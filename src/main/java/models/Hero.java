package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private String age;
    private String power;
    private String weakness;

    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;


    public Hero(String name, String age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

}











































