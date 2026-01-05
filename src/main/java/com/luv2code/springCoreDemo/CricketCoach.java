package com.luv2code.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "This is a cricket coach!!!";
    }
}
