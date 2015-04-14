package basic;

/**
 * Created by brian on 4/7/2015.
 */
public class baseStats extends simpleStats {
    //base stats
    private int charm,
                intelligence;


    //constructor
    public baseStats(int charm, int intelligence, int strength, int dexterity, int defense, int magicDefense) {
        super(strength, dexterity, defense, magicDefense);
        this.charm = charm;
        this.intelligence = intelligence;
    }

    //copy constructor
    public baseStats(baseStats stats) {
        super(stats.getSimpleStats());
        this.charm = stats.charm;
        this.intelligence = stats.intelligence;
    }


    public void addStats(baseStats stats) {
        addStats(stats.getSimpleStats());
        this.charm += stats.charm;
        this.intelligence += stats.intelligence;
    }

    public void remStats(baseStats stats) {
        remStats(getSimpleStats());
        this.charm -= stats.charm;
        this.intelligence -= stats.intelligence;

    }


    //getters
    public int getCharm() {
        return charm;
    }

    //setters
    public void setCharm(int charisma) {
        this.charm = charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
