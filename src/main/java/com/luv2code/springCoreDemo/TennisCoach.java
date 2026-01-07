package com.luv2code.springCoreDemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    public TennisCoach(){
        System.out.println("Name: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void pstConst() {
        System.out.println("PostConstruct: " + getClass().getSimpleName());
    }
    @PreDestroy
    public void preDest() {
        System.out.println("PreDestroy: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is a Tennis Coach!";
    }
}
