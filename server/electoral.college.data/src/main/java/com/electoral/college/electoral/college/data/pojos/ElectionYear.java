package com.electoral.college.electoral.college.data.pojos;

import lombok.Data;

@Data
public class ElectionYear {

    private Integer year;
    private Integer totalElectoralVotes;

    public ElectionYear(Integer year, Integer totalElectoralVotes){
        this.year = year;
        this.totalElectoralVotes = totalElectoralVotes;
    }

}
