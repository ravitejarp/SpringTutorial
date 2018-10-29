package com.ravi.spring.coach;

import com.ravi.spring.fortuneservice.FortuneService;

public class HockeyCoach implements Coach {

    //Using setter DI
    private FortuneService fortuneService;

    //Using values
    private String email;

    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Sample Workout for 100days";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
