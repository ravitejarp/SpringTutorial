package com.ravi.spring.fortuneservice;

import java.util.Random;

public class NeutralFortune implements FortuneService {
    @Override
    public String getFortune() {
        String[] fortuneArray = {"Today its gonna be 50-50","Today is your best day","Today is your worst day"};
        return fortuneArray[new Random().nextInt(2)];
    }
}
