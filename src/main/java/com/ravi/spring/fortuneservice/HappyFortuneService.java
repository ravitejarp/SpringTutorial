package com.ravi.spring.fortuneservice;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you have a good fortune";
    }
}
