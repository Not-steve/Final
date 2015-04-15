package world;

/**
 * Created by brian on 4/13/2015.
 */
public class tileForest extends baseTile {
    int x,y;

    public tileForest(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        areaName = "Town Square";
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
