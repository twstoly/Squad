package models;

import java.util.ArrayList;
public class Squad {
    private String squad;
    private String size;
    private String task;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int id;

    public Squad(String squad, String size, String task) {
        this.squad = squad;
        this.size = size;
        this.task = task;
        instances.add(this);
        this.id = instances.size();
    }
    public static ArrayList<Squad> getAllInstances() {
        return instances;
    }

    public String getSquad() {
        return squad;
    }

    public String getSize() {
        return size;
    }

    public String getTask() {
        return task;
    }

    public int getId() {
        return id;
    }
    public static void clearAllPost(){
        instances.clear();
    }

}




































































