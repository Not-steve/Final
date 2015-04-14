package basic;


/**
 * Created by brian on 4/9/2015.
 */
public class undead extends npc {

    public undead(npc creature) {
        super(creature);

        zombify();

        //make him rise
        health=maxHealth;
    }

    private void zombify() {
        //half speed
        speed/=2;

        //change affiliation
        affiliation = affiliation < -50 ? affiliation : -50;

        //destroy charm
        stats.setCharm(0);

        //double magic defense
        stats.setMagicDefense(stats.getMagicDefense()*2);

        //half the dexterity
        stats.setDexterity(stats.getDexterity() / 2);

        //double strength
        stats.setStrength(stats.getStrength() * 2);

        //make intelligence 50-100% a strong as original
        stats.setIntelligence((int) (stats.getIntelligence() * (Math.random() / 2 + .5)));

        //make name zombeielike
        setName("Undead "+name);
    }

    @Override
    public void die() {
        super.die();
    }
}
