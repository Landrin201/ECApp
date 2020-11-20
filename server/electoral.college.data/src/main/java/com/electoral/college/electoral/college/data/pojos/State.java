package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

@Data
public class State {
    private int stateId;
    private String stateName;
    private String stateAbbreviation;
    private String yearStateAddedToUs;
    private int currentPopulationEstimate;


}
