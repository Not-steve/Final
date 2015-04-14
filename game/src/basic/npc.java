package basic;

import world.area;

import java.util.ArrayList;

/**
 * Created by brian on 4/12/2015.
 */
public class npc extends isSentient {
    public npc(int h, area a, int l, race type, int sp, baseStats stats, int startingAffiliation, armor arm, String name) {
        super(h, a, l, type, sp, stats, startingAffiliation, arm, name);
    }

    public npc(int h, area a, int l, race type, int sp, baseStats stats, int startingAffiliation, ArrayList<armor> arm, String name) {
        super(h, a, l, type, sp, stats, startingAffiliation, arm, name);
    }

    public npc(isSentient creature) {
        super(creature);
    }

    @Override
    public void die() {
        util.utility.output(getName() + " has died.");
        if (Math.random() * 10 < 1 && !(this instanceof undead)) {
            util.utility.output(" and has returned as an undead");
            getArea().addSelfToArea(new undead(this));
        }
        else
            util.utility.output("");
    }
}
