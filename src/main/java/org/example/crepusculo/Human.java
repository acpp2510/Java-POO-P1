package org.example.crepusculo;

import java.util.ArrayList;
import java.util.List;


public class Human extends Character {
    public String qualityDream;
    public String stateHealth;
    public static List humans =new ArrayList();
    //public qualityDream calidadSueno;
    //public stateHealth stateHealth;

    public Human(String name, int age, String genre, String role, String qualityDream, String stateHealth) {
        super (name,age,genre, role);
        this.qualityDream = qualityDream.toLowerCase();
        this.stateHealth = stateHealth.toLowerCase();
        humans.add(name);
    }
    public static List getInstancias() {
        return humans;
    }




}

