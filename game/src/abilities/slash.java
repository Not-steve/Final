package abilities;

import basic.isLiving;
import basic.weapon;

/**
 * Created by brian on 4/10/2015.
 */
public class slash extends activeAbility {

    public slash(isLiving creature) {
        super("Slash", "Allows user to attack something with a wide cutting swing");
    }

    @Deprecated
    public void activate(isLiving creature) {}

    public void activate(isLiving target, isLiving attacker){
        //weapon attack = attacker.getWeapon();
    }
}
