package com.luv2code.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("Name: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is a Track Coach";
    }

}
