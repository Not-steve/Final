package basic;

import world.area;

/**
 * Created by brian on 4/10/2015.
 */
public class zeroArmor extends armor {

    public zeroArmor(damageable creature) {
        super(new baseStats(0, 0, 0, 0, 0, 0), creature.getArea(), 0, true);
    }

    public zeroArmor(area a) {
        super(new baseStats(0, 0, 0, 0, 0, 0),  a, 0, true);
    }

    public zeroArmor() {
        super(new baseStats(0, 0, 0, 0, 0, 0),  null, 0, true);
    }


}
