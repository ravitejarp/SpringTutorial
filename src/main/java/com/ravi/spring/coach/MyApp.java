package com.ravi.spring.coach;

public class MyApp {
    public static void main(String[] args) {
        //Create the Object
        Coach coach = new TrackCoach();
        //Use the object
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());
    }
}
