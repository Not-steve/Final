package util;

import basic.race;
import world.baseTile;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by brian on 4/12/2015.
 */
public final class utility {

    public static basic.race ent = new basic.race("Ent", "Ents", new basic.baseStats(5,15,20,0,10,10),
                                                  new ArrayList<abilities.ability>(), 15, new ArrayList<basic.race>(),
                                                  new ArrayList<basic.race>(), new basic.bark(1), 1 );
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<basic.race> races = new ArrayList<basic.race>();
    private static ArrayList<world.baseTile> forests = new ArrayList<world.baseTile>();
    private static ArrayList<world.baseTile> towns = new ArrayList<world.baseTile>();
    private static race r;

    public static int chooseList(ArrayList<Object> list){
         util.utility.output("-1 Go back");
         for (int i =0; i<list.size(); i++){
             util.utility.output("" + i + " " + list.get(i));
         }
         return scan.nextInt();
    }

    public static void removeDoubles(ArrayList objects){
        for (int i = objects.size()-1; i>0; --i) {
            if (objects.get(i) == objects.get(i-1)){
                objects.remove(i);
            }
        }
    }

    public static void output(String output){
        System.out.println(output);
    }
    public static void output(Object output){
        System.out.println(output);
    }

    //
    public static String generateName(basic.race r){
        return "Jim O'Shannahan";
    }


    public static void addRace(basic.race r){
        races.add(r);
    }
    public static void addTown(baseTile t){
        towns.add(t);
    }
    public static void addForest(baseTile f){
        forests.add(f);
    }

    public static int getForestNum() {
        return forests.size();
    }
    public static int getTownNum() {
        return towns.size();
    }

    public static basic.race getRandomRace(){
        return races.get((int)(Math.random()*races.size()));
    }

}
