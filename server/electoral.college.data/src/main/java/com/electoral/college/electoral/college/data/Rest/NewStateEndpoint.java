package com.electoral.college.electoral.college.data.Rest;

import com.electoral.college.electoral.college.data.DOM.ElectionsDAO;
import com.electoral.college.electoral.college.data.pojos.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/State")
public class NewStateEndpoint {
    private final Logger logger = LoggerFactory.getLogger(NewStateEndpoint.class);

    @PostMapping("/newState")
    @CrossOrigin(origins = "http://localhost:4200")
    public void postNewStateEndpoint(@RequestBody State newState) {
        logger.debug("Data passed: ");
        logger.debug("State name: " + newState.getStateName());
        logger.debug("State Abbreviation: " + newState.getStateAbbreviation());
        logger.debug("Year Incorporated: " + newState.getYearStateAddedToUs());
        logger.debug("State Population: " + newState.getCurrentPopulationEstimate());
    }

}
