package abilities;

import basic.isLiving;

/**
 * Created by brian on 4/10/2015.
 */
public class fireImmunity extends activeAbility{
    private int percent;
    public fireImmunity(int percent) {
        super("Fire Immunity", "User can enter fire or be lit on fire and will only take "+ percent+"% of the normal damage");
        this.percent=percent;
    }

    public void activate(isLiving creature, int damage) {
        creature.setHealth(creature.getHealth()-(damage*percent));
    }

    @Deprecated
    public void activate(isLiving creature) {
        util.utility.outputln("Error in " + this + " need to send in damage too");
    }
}
