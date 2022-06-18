package com.coding_test.dws_diegobfarias.controllers;

import com.coding_test.dws_diegobfarias.controllers.dtos.BandDTO;
import com.coding_test.dws_diegobfarias.services.BandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class BandController {

    private final BandService bandService;

    @GetMapping(value = "/full")
    public ResponseEntity<List<BandDTO>> findAll(@RequestParam(required = false, defaultValue = "false") Boolean alphabeticalOrder,
                                                 @RequestParam(required = false, defaultValue = "false") Boolean popularity,
                                                 @RequestParam(required = false) String bandName) {
        return ResponseEntity.ok().body(bandService.findAll(alphabeticalOrder, popularity, bandName));
    }

    @GetMapping
    public ResponseEntity<Optional<BandDTO>> findById(@RequestParam() String bandId) {
        return ResponseEntity.ok().body(bandService.findById(bandId));
    }
}
