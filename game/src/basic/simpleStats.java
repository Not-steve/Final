package basic;

/**
 * Created by brian on 4/10/2015.
 */
public class simpleStats {
    private int strength;
    private int dexterity;
    private int physicalDefense;


    private int magicDefense;

    public simpleStats(int strength, int dexterity, int physicalDefense, int magicDefense) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.physicalDefense = physicalDefense;
        this.magicDefense = magicDefense;
    }

    public simpleStats(simpleStats stats) {
        this.strength = stats.getStrength();
        this.dexterity = stats.getDexterity();
        this.physicalDefense = stats.getPhysicalDefense();
        this.magicDefense = stats.getMagicDefense();
    }

    public simpleStats(baseStats stats) {
        this(stats.getSimpleStats());
    }


    public void addStats(simpleStats stats) {
        this.strength += stats.strength;
        this.dexterity += stats.dexterity;
        this.physicalDefense += stats.physicalDefense;
    }

    public void remStats(simpleStats stats) {
        this.strength -= stats.strength;
        this.dexterity -= stats.dexterity;
        this.physicalDefense -= stats.physicalDefense;
    }

    //getters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getPhysicalDefense() {
        return physicalDefense;
    }


    //setters

    public void setPhysicalDefense(int physicalDefense) {
        this.physicalDefense = physicalDefense;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public simpleStats getSimpleStats() {
        return this;
    }

}
