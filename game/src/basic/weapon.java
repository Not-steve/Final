package basic;

import abilities.activeAbility;
import world.area;

import java.util.ArrayList;

/**
 * Created by brian on 4/10/2015.
 */
public class weapon extends item {
    private int hands;
    protected ArrayList<activeAbility> attacks;

    /**
     * @param uses how many times can this weapon be used. use a negative number for infinite
     * @param a the area this weapon is in
     * @param l level of the weapon
     * @param name name of the weapon
     * @param hands the number of hands it takes to wield the weapon
     * @param attacks the attack the the weapon has
     */
    public weapon(int uses, area a, int l, String name, int hands, activeAbility attacks) {
        super(uses, a, l, name);
        this.hands=hands;
        this.attacks.add(attacks);
    }

    public weapon(weapon w){
        super(w.getItem());
        this.hands = w.hands;
        this.attacks=w.attacks;
    }

    protected weapon getWeapon(){
        return  this;
    }

    public int getHands() {
        return hands;
    }
}
