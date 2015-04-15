package world;

/**
 * Created by brian on 4/12/2015.
 */
public class wallBaseTile extends baseTile {
    public wallBaseTile(int x, int y) {
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
