package com.luv2code.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("");
    }

    @Override
    public String getDailyWorkout() {
        return "This is a Baseball coach!";
    }
}
