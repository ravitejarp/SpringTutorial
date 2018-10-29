package com.ravi.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve the bean from container
        Coach myCoach = context.getBean("baseBallCoach",Coach.class);
        //Call methods
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        myCoach = context.getBean("myCoach",Coach.class);
        //Call methods
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        HockeyCoach hockeyCoach = context.getBean("hockeyCoach",HockeyCoach.class);
        //Call methods
        System.out.println(hockeyCoach.getDailyWorkOut());
        System.out.println(hockeyCoach.getDailyFortune());
        System.out.println(hockeyCoach.getEmail());
        System.out.println(hockeyCoach.getTeam());


        myCoach = context.getBean("footBallCoach",Coach.class);
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        //Close the context
        context.close();
    }
}
