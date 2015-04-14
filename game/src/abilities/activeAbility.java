package abilities;

import basic.isLiving;

/**
 * Created by brian on 4/10/2015.
 */
public abstract class activeAbility extends  ability {
    public activeAbility(String n, String d) {
        super(n, d);
    }


    public abstract void activate(isLiving creature);

}
