package world;

/**
 * Created by brian on 4/12/2015.
 */
public final class tileWall extends tileBase {
    public tileWall() {
        super();
    }

    @Override
    protected void populate() {
    }

    @Override
    public String toString() {
        String people=inhabitantsList();
        return "This is Wall ("+(x)+","+(y)+"). \nIt is inhabited by "+people;
    }
}
