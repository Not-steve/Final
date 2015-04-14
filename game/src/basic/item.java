package basic;

import world.area;

/**
 * Created by brian on 4/9/2015.
 */
public abstract class item extends damageable {

    public item(int uses, area a, int l, String name) {
        super(uses, a, l, name);
    }

    public item(item i){
        super(i.getDamageable());
    }

    protected item getItem(){
        return this;
    }

}
