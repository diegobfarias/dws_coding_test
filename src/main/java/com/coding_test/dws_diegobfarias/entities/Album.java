package com.coding_test.dws_diegobfarias.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Album implements Serializable {

    private String id;
    private String name;
    private String image;
    private LocalDateTime releasedDate;
    private String bandId;
    private List<Track> tracks;
}
