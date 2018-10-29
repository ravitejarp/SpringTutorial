package com.ravi.spring.coach;

import com.ravi.spring.fortuneservice.FortuneService;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //Sample method to return the workout
    @Override
    public String getDailyWorkOut() {
        return "Spend 30 mins on your exercise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
