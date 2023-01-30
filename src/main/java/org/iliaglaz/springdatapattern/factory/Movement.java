package org.iliaglaz.springdatapattern.factory;

import org.iliaglaz.springdatapattern.behavior.MovementStyle;
import org.iliaglaz.springdatapattern.behavior.MovingOnFeet;
import org.iliaglaz.springdatapattern.behavior.MovingOnHorse;

public class Movement {

    public static MovementStyle of(String movement) {
        MovementStyle style = null;
        if (movement.equals("Horse")) {
            style = new MovingOnHorse();
        } else if (movement.equals("Feet")) {
            style = new MovingOnFeet();
        }
        return style;
    }
}
