package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

import java.util.HashMap;

/**
 * Census data is decinneal, so this holds a HashMap of decinneal census data, with the year as the key and the population of the State as the value.
 */
@Data
public class StateCensusData {
    private Integer censusId;
    private State state;
    private HashMap<Integer, Integer> yearlyCensusData;

    public StateCensusData(Integer censusId, State state, HashMap<Integer, Integer> censusData){
        this.censusId = censusId;
        this.state = state;
        this.yearlyCensusData = censusData;
    }
}
