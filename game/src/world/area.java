package world;

import basic.damageable;
import basic.npc;
import basic.race;
import basic.tree;

import java.util.ArrayList;

/**
 * Created by brian on 4/9/2015.
 */
public class area extends tickable{

    protected ArrayList<damageable> actors = new ArrayList<damageable>();
    protected String name;

    public area(String name) {
        this.name=name;
        populate();
    }

    public area(String name, basic.race r) {
        this.name=name;
        populate();
    }

    public area(String name, ArrayList<damageable> actors) {
        this.actors=actors;
        this.name=name;
    }

    public void removeSelfFromArea(damageable thing){
        for(int i = actors.size(); i>=0; --i){
            if(actors.get(i)==thing)
                actors.remove(i);
        }
    }

    public void addSelfToArea(damageable thing){actors.add(thing);}

    //Todo make an actual populate
    public void populate(){
        actors.add(new tree(this));
    }

    public void  populate(race r){
        for (int i = 0; i < (int)(Math.random()*5+5); i++) {
            actors.add(new npc(this, r, 30));
        }
    }

    @Override
    public void tick() {
        super.tick();
        for (damageable actor : actors) {
            actor.tick();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
