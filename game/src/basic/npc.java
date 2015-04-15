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

    public npc(area a, race type, int startingAffiliation) {
        super(40+(int)(Math.random()*21), a, 1+(int)(Math.random()*2)+(int)(Math.random()*2), type, 5, new baseStats(2,2,2,2,2,2),
                startingAffiliation, new armor(new baseStats(0,0,2,-2,2,2),a, 1 ,true), util.utility.generateName(type));
    }

    public npc(isSentient creature) {
        super(creature);
    }

    //todo implement a full response system
    public int response(){
        return -1;
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
