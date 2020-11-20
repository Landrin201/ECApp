package com.electoral.college.electoral.college.data.pojos.object.mappers;

import com.electoral.college.electoral.college.data.pojos.State;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StateRowMapper implements RowMapper<State> {

    /**
     *
     * @param resultSet
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public State mapRow(ResultSet resultSet, int i) throws SQLException {
        State state = new State();
        state.setStateId(resultSet.getInt("state_id"));
        state.setStateName(resultSet.getString("state_name"));
        state.setStateAbbreviation(resultSet.getString("abbreviation"));
        state.setYearStateAddedToUs(resultSet.getString("year_joined"));
        state.setCurrentPopulationEstimate(resultSet.getInt("current_population"));

        return state;
    }
}
