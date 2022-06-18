package com.coding_test.dws_diegobfarias.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Band implements Serializable {

    private String id;
    private String name;
    private String image;
    private String genre;
    private String biography;
    private Long numPlays;
    private List<String> albums;
    private List<Album[]> albumList;
}
