package basic;

import abilities.ability;
import world.area;

import java.util.ArrayList;

/**
 * Created by brian on 4/9/2015.
 */
public class armor extends damageable {

    private baseStats armorStats;
    protected ArrayList<ability> immunity;
    private boolean physical;

    /*equipment
    @stats stats the the armor buffs/hurts
    @h the number of hit points the armor can take
    */
    public armor(baseStats stats, int h, damageable creature, int l, boolean phys, ArrayList<ability> immunity){
        super(h, creature.getArea(), l, "Armor");
        this.immunity = immunity;
        physical = phys;
        armorStats = stats;
    }

    public armor(baseStats stats, int h, area a, int l, boolean phys) {
        super(h, a, l, "Armor");
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
    public ArrayList<ability> getImmunity() {return immunity;}


    public void setArmorStats(baseStats armorStats) {
        this.armorStats = armorStats;
    }

}
