package com.ravi.spring.coach;

import com.ravi.spring.fortuneservice.FortuneService;

public class FootballCoach implements Coach {

    //Using setter DI
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Sample Workout for 10days";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
