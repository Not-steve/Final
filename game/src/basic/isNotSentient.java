package basic;

import world.area;

/**
 * Created by brian on 4/9/2015.
 */
public abstract class isNotSentient extends isLiving {
    private simpleStats stats;

    public isNotSentient(int h, area a, int level, int sp, armor arm, int defense, int magicDefense,
                         int strength, int dexterity, String name) {
        super(h, a, level, sp, arm, name);
        stats = new simpleStats(defense, dexterity, strength, magicDefense);
    }

    public isNotSentient(isNotSentient creature){
        super(creature.getIsLiving());

    }

    public simpleStats getStats() {
        return stats;
    }

    protected isNotSentient getIsNotSentient(){
        return this;
    }
}
