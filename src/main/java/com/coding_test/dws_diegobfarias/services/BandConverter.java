package com.coding_test.dws_diegobfarias.services;

import com.coding_test.dws_diegobfarias.controllers.dtos.BandDTO;
import com.coding_test.dws_diegobfarias.entities.Band;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class BandConverter {

    public static BandDTO toDTO(Band band) {
        return BandDTO.builder()
                .albumList(band.getAlbumList())
                .biography(band.getBiography())
                .genre(band.getGenre())
                .image(band.getImage())
                .numPlays(band.getNumPlays())
                .name(band.getName())
                .id(band.getId())
                .build();
    }
}
