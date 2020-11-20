package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

import java.util.HashMap;

@Data
public class StateElections {

    private State state;
    private HashMap<ElectionYear, Election> electionsByYear;

    public StateElections(State state, HashMap<ElectionYear, Election> elections){
        this.state = state;
        this.electionsByYear = elections;
    }
}
