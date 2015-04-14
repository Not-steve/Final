package basic;

import abilities.ability;
import util.utility;

import java.util.ArrayList;

/**
 * Created by brian on 4/7/2015.
 */
public class race implements Comparable{
    private final String NAME;
    private final baseStats RACESTATS;
    private final ArrayList<ability> RACEABILITIES;
    private final int RACEAFFILIATION, RACIALSPEED;
    private final armor RACIALARMOR;
    private ArrayList<race> racialAllies, racialEnemies;
    private final String NAMEPLURAL;

    public race(String name, String namePlural, baseStats stats, ArrayList<ability> abe, int affiliation, ArrayList<race> friends,
                ArrayList<race> enemies, armor natArmor, int sp) {
        NAME = name;
        NAMEPLURAL=namePlural;
        RACESTATS = stats;
        RACEABILITIES = abe;
        RACEAFFILIATION = affiliation;
        racialAllies = friends;
        racialEnemies = enemies;
        RACIALARMOR = natArmor;
        RACIALSPEED = sp;

        utility.addRace(this);
    }


    public baseStats getRACESTATS() {
        return RACESTATS;
    }

    public ArrayList<ability> getRACEABILITIES() {
        return RACEABILITIES;
    }

    public int getRACEAFFILIATION() {
        return RACEAFFILIATION;
    }

    public String getName() {
        return NAME;
    }

    public ArrayList<race> getRacialAllies() {
        return racialAllies;
    }

    public ArrayList<race> getRacialEnemies() {
        return racialEnemies;
    }

    public armor getRACIALARMOR() {
        return RACIALARMOR;
    }

    public int getRACIALSPEED() {
        return RACIALSPEED;
    }

    public String getNAMEPLURAL() {
        return NAMEPLURAL;
    }

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof race){
            return NAME.compareTo(((race) o).NAME);
        }
        else {
            util.utility.output("Error in comparing races");
            return Integer.parseInt(null);
        }
    }
}
