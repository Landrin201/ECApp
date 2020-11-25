package com.electoral.college.electoral.college.data.DOM;

import com.electoral.college.electoral.college.data.Rest.NewStateEndpoint;
import com.electoral.college.electoral.college.data.pojos.ElectionYear;
import com.electoral.college.electoral.college.data.pojos.State;
import com.electoral.college.electoral.college.data.pojos.StateElections;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ElectionsDAO {

    //Select statements
    private String getCandidateResultsPerYear = "SELECT * from candidate_results ;";

    private final Logger logger = LoggerFactory.getLogger(ElectionsDAO.class);
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(final DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public StateElections getElectionResultsForState(State state){
        //Get election years where state participated

        //Get loop through election years and get candidates and results for year
        //Add results to hash map
        //Add hash map to object
        //Return object

        return new StateElections(null, null);
    }

    public ElectionYear getElectionYearsAfterYear(Integer year){
        String query = "select * from presidents.election_years where election_year >= ?";

        return null;
    }



}
