package com.ravi.spring.coach;

public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practise daily";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
