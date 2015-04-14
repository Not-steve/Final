package world;

import basic.race;
import java.util.ArrayList;

/**
 * Created by brian on 4/13/2015.
 */
public class townTile extends baseTile{
    public townTile(int x, int y, ArrayList<race> races) {
        super(x, y);
        addRace(races.get(0));
        if (races.size()>1)
            addRace(races.get(1));
    }

    //todo make new populate


    @Override
    public String toString() {
        String people=inhabitantsList();
        return "This is a Town Tile ("+(x)+","+(y)+"). \nIt is inhabited by "+people;
    }
}
