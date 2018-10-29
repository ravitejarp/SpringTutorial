package com.ravi.spring.coach;

import com.ravi.spring.fortuneservice.FortuneService;

public class TrackCoach implements Coach {
    //Constructor DI
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkOut() {
        return "Run hard 5k";
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
