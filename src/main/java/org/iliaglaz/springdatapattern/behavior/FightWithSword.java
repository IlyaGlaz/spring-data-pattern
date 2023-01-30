package org.iliaglaz.springdatapattern.behavior;

public class FightWithSword implements FightStyle{

    @Override
    public void fight() {
        System.out.println("Sword is a best friend for good warrior");
    }

}
