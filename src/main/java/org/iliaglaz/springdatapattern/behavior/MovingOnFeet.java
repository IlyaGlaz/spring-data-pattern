package org.iliaglaz.springdatapattern.behavior;

public class MovingOnFeet implements MovementStyle {

    @Override
    public void move() {
        System.out.println("I am tired");
    }

}
