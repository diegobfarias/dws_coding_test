package com.coding_test.dws_diegobfarias.controllers.dtos;

import com.coding_test.dws_diegobfarias.entities.Album;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BandDTO {

    private String id;
    private String name;
    private String image;
    private String genre;
    private String biography;
    private Long numPlays;
    private List<Album> albumList;
}
