package abilities;

/**
 * Created by brian on 4/7/2015.
 */
public class ability implements Comparable {
    private String name;
    private String description;

    public ability(String n, String d) {
        name = n;
        description = d;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof ability)
            return name.compareToIgnoreCase(((ability) obj).name);
        else
            return 0;
    }


    @Override
    public String toString() {
        return (name + "\n" + description);
    }
}
