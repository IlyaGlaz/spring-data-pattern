package org.iliaglaz.springdatapattern.character;

import org.iliaglaz.springdatapattern.behavior.FightStyle;
import org.iliaglaz.springdatapattern.behavior.MovementStyle;

public class Hero {

    private final MovementStyle movementStyle;
    private final FightStyle fightStyle;

    public Hero(MovementStyle movementStyle, FightStyle fightStyle) {
        this.movementStyle = movementStyle;
        this.fightStyle = fightStyle;
    }

    public void onRide() {
        movementStyle.move();
    }

    public void onFight() {
        fightStyle.fight();
    }

    public MovementStyle getMovementStyle() {
        return movementStyle;
    }

    public FightStyle getFightStyle() {
        return fightStyle;
    }
}
