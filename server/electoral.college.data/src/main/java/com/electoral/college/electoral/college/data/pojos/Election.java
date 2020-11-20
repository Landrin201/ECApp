package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Election {

    private State state;
    private ArrayList<Candidate> candidates;
    private ElectionYear electionYear;
    private Integer numberOfVotesCast;

    public Election(State state, ArrayList<Candidate> candidates, ElectionYear electionYear, Integer numberOfVotesCast){
        this.state = state;
        this.candidates = candidates;
        this.electionYear = electionYear;
        this.numberOfVotesCast = numberOfVotesCast;
    }

}
