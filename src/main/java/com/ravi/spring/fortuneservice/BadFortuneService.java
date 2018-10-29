package com.ravi.spring.fortuneservice;

public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today its unlucky, be cautious";
    }
}
