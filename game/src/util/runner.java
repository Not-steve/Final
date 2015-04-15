package util;

import abilities.ability;
import abilities.fireImmunity;
import basic.armor;
import basic.baseStats;
import basic.race;
import world.nullArea;
import world.world;

import java.util.ArrayList;

/**
 * Created by brian on 4/12/2015.
 */
public class runner {
    public static void main(String[] args){
        ArrayList<ability> abe = new ArrayList<ability>();
        baseStats stats = new baseStats(10,10,10,10,10,10), armStats = new baseStats(2,2,2,2,2,2);
        abe.add(new fireImmunity(100));

        race human = new race("Human", "Humans",stats, abe, 50, new ArrayList<basic.race>(),
                new ArrayList<basic.race>(), new armor(stats, new nullArea(), 1, true), 5);
        race Gangsters = new race("Elemental","Elementals",stats, abe, 50, new ArrayList<basic.race>(),
                new ArrayList<basic.race>(), new armor(stats, new nullArea(), 1, true), 5);
        race begees = new race("Monster","Monsters",stats, abe, 50, new ArrayList<basic.race>(),
                new ArrayList<basic.race>(), new armor(stats, new nullArea(), 1, true), 5);

        util.utility.outputln(util.utility.getRaces());

        //baseTile usage = new baseTile(3,5);


        //npc test =new npc(50, square.getBaseTile(15,23).getArea(3), 1, human, 5, stats, 0, new zeroArmor( square.getBaseTile(15,23).getArea(3)), "Tester McTest");

        //util.utility.outputln(square.getBaseTile(0, 0));

        world square;
        /**/
        try {
            for (int i = 0; i < 1000; i++) {
                square = new world(500);
                util.utility.outputln("World " + (i + 1));
            }
        }catch (OutOfMemoryError e){
            utility.outputln("Out of memory");
        }


        util.utility.outputln("\n\n\n\nForests:" + utility.getForestNum() + "\nTowns:" + utility.getTownNum());






        // while (test.stillAlive()){
       //     test.takeDamage(2);
       // }

        //util.utility.outputln(402 * 402);


        System.exit(0);
    }
}
