package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

import java.util.HashMap;

@Data
public class Candidate {

    private Integer candidateId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthYear;
    private ElectionYear electionYear;
    private HashMap<State, Integer> numberOfVotesPerState;

    public Candidate(Integer candidateId, String firstName, String middleName, String lastName, String birthYear, ElectionYear electionYear, HashMap<State, Integer> numberOfVotesPerState){
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.electionYear = electionYear;
        this.numberOfVotesPerState = numberOfVotesPerState;
    }



}
