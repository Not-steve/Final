package basic;

import world.area;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by brian on 4/9/2015.
 */
public abstract class isSentient extends isLiving {

    protected static Scanner scan = new Scanner(System.in);
    protected baseStats stats, statChange;
    protected int affiliation;
    protected race r;

    /**
     * @param h health of creature
     * @param a area of creature
     * @param l level of creature
     * @param type race of creature
     * @param sp speed of creature
     * @param stats baseStats of creature
     * @param startingAffiliation where the creature is on the scale of evil to good
     * @param arm armor of the creature
     * @param name name of the creature
     */
    public isSentient(int h, area a, int l, race type, int sp, baseStats stats, int startingAffiliation,
                      armor arm, String name) {
        super(h, a, l, sp, arm, name);
        this.stats = stats;
        affiliation = startingAffiliation;
        r = type;
        getDefenses().add(1, r.getRACIALARMOR());
    }

    public isSentient(int h, area a, int l, race type, int sp, baseStats stats, int startingAffiliation,
                     ArrayList<armor> arm, String name) {
        super(h, a, l, sp, arm, name);
        this.stats = stats;
        affiliation = startingAffiliation;
        r = type;
        getDefenses().add(1, r.getRACIALARMOR());
    }

    /** copy constructor
     * @param creature isSentient to copy
     */
    public isSentient(isSentient creature){
        super(creature.getIsLiving());
        this.stats=creature.stats;
        this.statChange=creature.statChange;
        this.affiliation=creature.affiliation;
        this.r=creature.r;
    }

    @Override
    public armor equipArmor(armor arm) {
        if (getDefenses().get(0) instanceof zeroArmor) {
            statChange.addStats(arm.getArmorStats());
            return getDefenses().set(0, arm);
        } else {
            util.utility.output("Are you sure you want to replace the current armor with the new set:(y/n)  ");
            String yesNo = scan.nextLine();
            if (yesNo.equalsIgnoreCase("y")) {
                return getDefenses().set(0, arm);
            } else {
                return new zeroArmor(this);
            }
        }
    }

    @Override
    public void tick() {
        super.tick();

    }



    //getters
    public race getRace() {
        return r;
    }

    public baseStats getStats() {
        return stats;
    }

    public void setStats(baseStats stats) {
        this.stats = stats;
    }

    public int getAffiliation() {
        return affiliation;
    }

    //setters
    public void setAffiliation(int affiliation) {
        this.affiliation = affiliation;
    }

    protected isSentient getIsSentient(){
        return this;
    }



}
