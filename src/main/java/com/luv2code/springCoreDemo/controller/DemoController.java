package com.luv2code.springCoreDemo.controller;

import com.luv2code.springCoreDemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define for private field for the dependency
    private Coach myCoach;

    //define for constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach coach){
        myCoach = coach;
        System.out.println("Name: " + getClass().getSimpleName());
    }

//    //define setter dependency injection
//    @Autowired
//    public void setCoach(Coach coach){
//         myCoach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }

}
