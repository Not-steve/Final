package world;

import basic.race;

import java.util.ArrayList;

import static java.lang.Object.*;

/**
 * Created by brian on 4/11/2015.
 */
public class world extends tickable{
    baseTile[][] world;

    public world(int num) {
        util.utility.output("Preparing World");

        world = new baseTile[num+2][num+2];

        for (int x = 0; x < world.length; ++x) {
            for (int y = 0; y < world.length; ++y) {
                world[x][y] = new baseTile(x, y);

                //add random races with a 20% chance
                world[x][y].addRandomRace(50);

                if (world[x][y].isInhabited()){
                    world[x][y].addRandomRace(33);
                }
            }
        }

        //create top amd bottom stone walls
        for (int i = 0; i < world.length; i++) {
            world[i][0] = new wallBaseTile(i, 0);
            world[i][world.length-1] = new wallBaseTile(i, world.length-1);
        }
        //create side stone walls
        for (int i = 0; i < world.length; i++) {
            world[0][i] = new wallBaseTile(0, i);
            world[world.length-1][i] = new wallBaseTile(world.length-1, i);
        }


        util.utility.output("World Created");
        util.utility.output("Creating towns and Forests");
        makeTowns();
        util.utility.output("Towns and Forests created");

    }

    public void makeTowns() {
        for (int x = 1; x < world.length-3; ++x){
            for (int y = 1; y < world.length-3; ++y) {
                int check = tripSquareInhabited(x, y);
                if (check == 9) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            world[x + i][y + j] = new townTile(x, y, tripRaces(x, y));
                        }
                    }
                    util.utility.addTown(world[x + 1][y + 1]);

                }
                else if (check == 0) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            world[x + i][y + j] = new tileForest(x + i, y + j);
                        }
                    }
                    util.utility.addForest(world[x + 1][y + 1]);

                }
            }
        }
    }


    private int tripSquareInhabited(int x, int y){
        int flag = 0;

        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                if (world[x+l][y+m].isInhabited()){
                    flag+=1;
                }
                if (world[x+l][y+m] instanceof townTile || world[x+l][y+m] instanceof tileForest)
                    flag=-15;
            }

        }

        return flag;
    }

    private ArrayList<basic.race> tripRaces(int x, int y){
        ArrayList<race> races = new ArrayList<race>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                races.addAll(world[x + i][y + j].getInhabitants());
            }
        }

        util.utility.removeDoubles(races);

        return races;
    }



    public int getNum() {
        return world.length-3;
    }

    public baseTile getBaseTile(int x, int y){
        if (x<getNum() && y<getNum())
            return world[x][y];
        else
            return world[0][0];
    }

    @Override
    public void tick() {
        for(int x = 0; x<world.length-2; ++x){
            for(int y = 0; y<world.length-2; ++y){
                world[x][y].tick();
            }
        }
    }
}
