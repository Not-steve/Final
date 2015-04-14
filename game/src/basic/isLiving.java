package basic;

import abilities.ability;
import world.area;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by brian on 4/9/2015.
 */
public abstract class isLiving extends damageable {
    protected int speed;
    protected ArrayList<item> inventory;
    ArrayList<ability> powers;
    protected ArrayList<armor> defenses = new ArrayList<armor>();
    protected Object weapons;

    public isLiving(int h, area a, int l, int sp, armor arm, String name) {
        super(h, a, l, name);
        speed = sp;
        defenses.add(arm);
    }

    public isLiving(int h, area a, int l, int sp, ArrayList<armor> arm, String name) {
        super(h, a, l, name);
        speed = sp;
        defenses=arm;
    }

    public isLiving(isLiving creature){
        super(creature.getDamageable());
        this.speed=creature.speed;
        this.inventory=creature.inventory;
        this.powers=creature.powers;
        this.defenses=creature.defenses;
        this.weapons=creature.weapons;

    }

    public void die() {
        util.utility.output(getName() + " has died.");
        this.getArea().removeSelfFromArea(this);
    }


    public void addAbility(ability newAble) {
        powers.add(newAble);
        Collections.sort(powers);
    }

    public abstract armor equipArmor(armor arm);

    public int getSpeed() {
        return speed;
    }

    protected isLiving getIsLiving() {
        return this;
    }

    public ArrayList<armor> getDefenses() {
        return defenses;
    }

    public void getSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<ability> getPowers() {
        return powers;
    }

    public void takeDamage(int damage){
        health-=damage;
        tick();
    }

    public boolean stillAlive(){
        return health>0;
    }

    @Override
    public void tick() {
        super.tick();
        if(health<10){
            if(!stillAlive())
                die();
            else
                util.utility.output(name + " is seriously injured");
        }
    }
}
