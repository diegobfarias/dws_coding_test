package com.coding_test.dws_diegobfarias.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Track implements Serializable {

    private String id;

    private String name;
    private Integer duration;
}
