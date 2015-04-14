package basic;

import world.area;
import world.tickable;

/**
 * Created by brian on 4/9/2015.
 */
public abstract class damageable extends tickable implements Comparable {

    protected int health, maxHealth, level;
    protected area space;
    protected boolean breakable;
    protected String name;
    protected int exp= 0;
    protected int visibility =100;


    /**
     * @param h health
     * @param a current area
     * @param level level of creature or item
     * @param name name of creature or item
     */
    public damageable(int h, area a, int level, String name) {
        health = h;
        maxHealth = h;
        space = a;
        this.name = name;
        this.level = level;
        breakable = (h > 0);
    }

    /** copy constructor
     * @param thing damageable object ot copy
     */
    public damageable(damageable thing){
        this.breakable=thing.breakable;
        this.health=thing.health;
        this.maxHealth=thing.maxHealth;
        this.level=thing.level;
        this.name=thing.name;
        this.space=thing.space;
        this.visibility=thing.visibility;

    }


    //getters
    public int getMaxHealth() {return maxHealth;}

    public int getLevel() {return level;}

    public area getArea() {return space;}

    public int getHealth() {return health;}

    public int getVisibility() {return visibility;}

    public String getName() {return name;}

    public int getExp(){
        return exp;
    }

    //setters
    public void setHealth(int health) {this.health = health;}

    protected damageable getDamageable(){
        return this;
    }

    protected void setName(String n) {name=n;}

    public void setLevel(int level) {this.level = level;}

    public void setVisibility(int visibility) {this.visibility = visibility;}

    //add
    public void addExp(int num){
        exp+=num;
        if (exp>level*100){
            exp-=level*100;
            level+=1;
        }
    }

    //implement required methods
    public int compareTo(Object obj) {
        if (obj instanceof damageable)
            return name.compareToIgnoreCase(((damageable) obj).name);
        else
            return 0;
    }

    //methods
    public int tillNextLevel(){
        return level*100-exp;
    }
}
