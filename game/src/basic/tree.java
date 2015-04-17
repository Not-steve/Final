package basic;

import world.area;

/**
 * Created by brian on 4/11/2015.
 */
public class tree extends isNotSentient {
    private static zeroArmor zero = new zeroArmor();
    public tree(area a) {
        super(40, a, 0, 0, zero, 10,10, 10, 0, "Tree");
        equipArmor(new bark((int)((Math.random()*10))));
    }

    public tree(area a, int l) {
        super(40, a, 0, 0, zero, 10,10, 10, 0, "Tree");
        equipArmor(new bark(l));
    }

    @Override
    public armor equipArmor(armor arm) {
        return arm;
    }

    @Override
    public void tick() {
        incrementTicks();
        if (Math.random()*100<8){
            level+=1;
        }
    }
}
