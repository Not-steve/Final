package world;

import basic.race;

/**
 * Created by brian on 4/13/2015.
 */
public class tileForest extends baseTile {

    public tileForest(int x, int y) {
        super(x, y);
    }


    //todo make new populate
    @Override
    protected void populate() {
        super.populate(util.utility.ent);
    }


    @Override
    public String toString() {
        String people=inhabitantsList();
        return "This is a Forest Tile ("+(x)+","+(y)+"). \nIt is inhabited by "+people;
    }


}
