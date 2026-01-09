package com.luv2code.springCoreDemo.config;

import com.luv2code.springCoreDemo.interfaces.Coach;
import com.luv2code.springCoreDemo.services.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
