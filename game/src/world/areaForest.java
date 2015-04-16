package world;

import basic.tree;

/**
 * Created by brian on 4/15/2015.
 */
public class areaForest extends area{

    public areaForest(String name) {
        super("Dark Forest");
    }

    @Override
    public void populate() {
        for (int i = 0; i < Math.random()*50; i++) {
            actors.add(new tree(this));
        }
        super.populate(util.utility.ent);
    }
}
