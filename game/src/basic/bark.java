package basic;

import world.nullArea;

/**
 * Created by brian on 4/11/2015.
 */
public class bark extends armor {
    public bark(int l) {
        super(new baseStats(0,0,5*l,0,15, 0), new nullArea(), l, true);
    }
}
