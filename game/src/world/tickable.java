package world;

/**
 * Created by brian on 4/12/2015.
 */
public abstract class tickable {
    private int ticks = 0;

    public void tick() {
        incrementTicks();
    }

    public int getTicks() {
        return ticks;
    }
    public void incrementTicks(){
        ticks+=1;
    }
}
