package com.coding_test.dws_diegobfarias.controllers.dtos;

import com.coding_test.dws_diegobfarias.entities.Track;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlbumDTO {

    private String name;
    private String image;
    private LocalDateTime releasedDate;
    private String bandId;
    private List<Track> tracks;
}
