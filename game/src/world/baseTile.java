package world;

import basic.race;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by brian on 4/11/2015.
 */
public class baseTile extends tickable {
    protected int x,y;
    protected ArrayList<area> features = new ArrayList<area>();
    protected ArrayList<race> inhabitants = new ArrayList<race>();
    protected String areaName = "Meadow";



    //raced tile
    public baseTile(race r){
        inhabitants.add(r);
        populate(inhabitants.get(0));
    }

    //raceless tile
    public baseTile(){
        populate();
    }

    // TODO make race based populate
    protected void populate(race r){
        for(int i = 4; i>=0; --i){
            area a = new area("meadow");
            a.populate(r);
            features.add(a);
        }
    }

    protected void populate(){
        for(int i = 4; i>=0; --i){
            features.add(new area(areaName));
        }
    }



    public void addFeature(area newFeature){
        features.add(newFeature);
    }

    public void addRace(race r){
        boolean flag = false;

        for(int i = 0; i<inhabitants.size() && !flag; ++i){
            if(inhabitants.get(i)==r)
                flag=true;
        }

        if (!flag) {
            inhabitants.add(r);
            Collections.sort(inhabitants);
        }
    }

    /**
    *@param i percent chance of adding a random race
     */
    public void addRandomRace(int i){
        if (Math.random()*100+1<i){
            addRace(util.utility.getRandomRace());
        }

    }

    public void moveOnto(){

    }

    public area getArea(int num){
        if(num<=features.size()){
            return features.get(num);
        }
        else {
            util.utility.output("error in Tile. invalid area gotten. There are "+features.size()+" areas");
            return null;
        }
    }

    public ArrayList<race> getInhabitants() {
        return inhabitants;
    }

    public boolean isInhabited(){
        return (inhabitants.size()>0);
    }


    @Override
    public void tick() {
        super.incrementTicks();
        addRandomRace(5);
        for( area a:features){
            a.tick();
        }
    }

    protected String inhabitantsList(){
        String people="";
        if(inhabitants.size()>0){
            if (inhabitants.size()==1)
                people=inhabitants.get(0).getNAMEPLURAL();
            else if (inhabitants.size()==2)
                people = inhabitants.get(0).getNAMEPLURAL()+" and "+inhabitants.get(1).getNAMEPLURAL();
            else{
                for (int i = inhabitants.size()-1; i>=0; --i){
                    if (i==0)
                        people += " and "+inhabitants.get(i).getNAMEPLURAL();
                    else
                        people += inhabitants.get(i).getNAMEPLURAL()+", ";
                }
            }
        }
        else
            people="nobody";
        return people;
    }

    @Override
    public String toString() {
        String people=inhabitantsList();
        return "This is Tile ("+(x)+","+(y)+"). \nIt is inhabited by "+people;
    }
}
