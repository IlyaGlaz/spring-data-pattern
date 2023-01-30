package org.iliaglaz.springdatapattern.behavior;

public class MovingOnHorse implements MovementStyle {

    @Override
    public void move() {
        System.out.println("I am a knight");
    }
}
