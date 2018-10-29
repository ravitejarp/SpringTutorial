package com.ravi.spring.coach.scope;

import com.ravi.spring.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeApplicationContext.xml");

        Coach mycoach = context.getBean("mycoach", Coach.class);
        Coach newCoach = context.getBean("mycoach", Coach.class);

        System.out.println("Are the references same: "+(mycoach==newCoach));
        System.out.println("Reference for mycoach:"+mycoach);
        System.out.println("Reference for newcoach:"+newCoach);


        Coach mycoach1 = context.getBean("protoCoach", Coach.class);
        Coach newCoach1 = context.getBean("protoCoach", Coach.class);

        System.out.println("Are the references same: "+(mycoach1==newCoach1));
        System.out.println("Reference for mycoach:"+mycoach1);
        System.out.println("Reference for newcoach:"+newCoach1);



    }
}
