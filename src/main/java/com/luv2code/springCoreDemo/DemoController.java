package com.luv2code.springCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define for private field for the dependency
    private Coach myCoach;

    //define for constructor for dependency injection
    @Autowired
    public DemoController(Coach coach){
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }

}
