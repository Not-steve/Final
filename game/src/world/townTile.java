package world;

import basic.race;

import java.util.ArrayList;

/**
 * Created by brian on 4/13/2015.
 */
public class townTile extends tileBase {
    private int x,y;
    public townTile(int x, int y, ArrayList<race> races) {
        super();
        this.x = x;
        this.y = y;
        addRace(races.get(0));
        if (races.size()>1)
            addRace(races.get(1));
        areaName="Street corner";

    }

    //todo make new populate


    @Override
    protected void populate() {
        for (int i = 0; i < inhabitants.size(); i++) {
            populate(inhabitants.get(i));
        }
    }

    @Override
    public String toString() {
        String people=inhabitantsList();
        return "This is a Town Tile ("+(x)+","+(y)+"). \nIt is inhabited by "+people;
    }
}
