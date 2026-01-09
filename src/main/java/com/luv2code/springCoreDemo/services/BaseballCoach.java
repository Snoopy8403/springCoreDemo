package com.luv2code.springCoreDemo.services;

import com.luv2code.springCoreDemo.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("");
    }

    @Override
    public String getDailyWorkout() {
        return "This is a Baseball coach!";
    }
}
