package com.coding_test.dws_diegobfarias.services;

import com.coding_test.dws_diegobfarias.config.RestTemplateIWS;
import com.coding_test.dws_diegobfarias.controllers.dtos.BandDTO;
import com.coding_test.dws_diegobfarias.entities.Band;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BandService {

    private final RestTemplateIWS restTemplateIWS;

    public List<BandDTO> findAll(Boolean alphabeticalOrder, Boolean popularity, String bandName) {

        List<Band> listOfBands = restTemplateIWS.getIwsData();

        listOfBands = isSortedByAlphabeticalOrder(listOfBands, alphabeticalOrder);
        listOfBands = isSortedByPopularity(listOfBands, popularity);
        listOfBands = filteredByName(listOfBands, bandName);

        return listOfBands.stream().map(BandConverter::toDTO).collect(Collectors.toList());
    }

    private List<Band> isSortedByAlphabeticalOrder(List<Band> listOfBands, Boolean alphabeticalOrder) {
        if (alphabeticalOrder) {
            return listOfBands.stream().sorted(Comparator.comparing(Band::getName)).collect(Collectors.toList());
        }
        return listOfBands;
    }

    private List<Band> isSortedByPopularity(List<Band> listOfBands, Boolean popularity) {
        if (popularity) {
            return listOfBands.stream().sorted(Comparator.comparingLong(Band::getNumPlays)).collect(Collectors.toList());
        }
        return listOfBands;
    }

    private List<Band> filteredByName(List<Band> listOfBands, String bandName) {
        if (Objects.nonNull(bandName)) {
            return listOfBands.stream().filter(band -> band.getName().contains(bandName)).collect(Collectors.toList());
        }
        return listOfBands;
    }

    public Optional<BandDTO> findById(String bandId) {

        List<Band> listOfBands = restTemplateIWS.getIwsData();

        return listOfBands.stream().filter(band -> band.getId().equalsIgnoreCase(bandId)).map(BandConverter::toDTO).findFirst();
    }
}
