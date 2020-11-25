package com.electoral.college.electoral.college.data.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FuckSpring {

    @GetMapping("/test")
    public String testEndpoint(){
        return "This endpoint works";
    }

}
