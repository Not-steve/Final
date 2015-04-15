package basic;

import abilities.ability;
import world.area;

import java.util.ArrayList;

/**
 * Created by brian on 4/9/2015.
 */
public class armor extends damageable {

    protected ArrayList<ability> immunity;
    private baseStats armorStats;
    private boolean physical;

    /**equipment
     * @param stats stats the the armor buffs/hurts
     * @param creature
    */
    public armor(baseStats stats,  damageable creature, int l, boolean phys, ArrayList<ability> immunity){
        super(-1, creature.getArea(), l, "Armor");
        this.immunity = immunity;
        physical = phys;
        armorStats = stats;
    }

    public armor(baseStats stats, area a, int l, boolean phys) {
        super(-1, a, l, "Armor");
        physical = phys;
        armorStats = stats;
    }

    @Override
    public void setHealth(int health) {
        if (breakable)
            super.setHealth(health);
    }


    public boolean isPhysical() {return physical;}

    public baseStats getArmorStats() {
        return armorStats;
    }

    public void setArmorStats(baseStats armorStats) {
        this.armorStats = armorStats;
    }

    public ArrayList<ability> getImmunity() {return immunity;}

}
