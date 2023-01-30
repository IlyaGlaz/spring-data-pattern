package org.iliaglaz.springdatapattern.factory;

import org.iliaglaz.springdatapattern.behavior.FightStyle;
import org.iliaglaz.springdatapattern.behavior.FightWithBow;
import org.iliaglaz.springdatapattern.behavior.FightWithSword;
import org.iliaglaz.springdatapattern.behavior.FightWithWand;

public class Weapon {

    public static FightStyle of(String weapon) {
        FightStyle style = null;
        if (weapon.equals("Sword")) {
            style = new FightWithSword();
        } else if (weapon.equals("Bow")) {
            style = new FightWithBow();
        } else if (weapon.equals("Wand")) {
            style = new FightWithWand();
        }
        return style;
    }
}
