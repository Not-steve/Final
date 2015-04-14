package basic;

/**
 * Created by brian on 4/7/2015.
 */
public abstract class statMod {

    int change;
    String dialogue;

    public statMod(int c, String s) {
        change = c;
        dialogue = s;
    }

    public abstract void activate(isLiving main);

    int getChange() {
        return change;
    }

    ;
}
