package player;

import basic.*;
import world.area;

import java.util.ArrayList;

/**
 * Created by brian on 4/7/2015.
 */
public class playerCharacter extends isSentient {

    public playerCharacter(int h, area a,  int l, int sp, baseStats stats, race type, int affiliation,
                           armor arm, String name) {
        super(h, a, l, type, sp, stats,  affiliation , arm , name);
    }



}//end of charStats
