package basic;

/**
 * Created by brian on 4/7/2015.
 */
public class charmMod extends statMod {

    public charmMod(int c, String s) {
        super(c, s);
    }

    @Override
    public void activate(isLiving main) {
        if (main instanceof isSentient) {
            isSentient temp = (isSentient) main;
            //output reason for base changes
            util.utility.output(dialogue);

            //change stats by change
            int newCharm = temp.getStats().getCharm() + change;

            temp.getStats().setCharm(newCharm);
        }
    }
}
