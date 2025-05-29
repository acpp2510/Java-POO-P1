package org.example;

import org.example.crepusculo.*;

public class Main {
    public static void main(String[] args) {
        Human bella = new Human("Bella", 19, "femenino", "Estudiante", "bajo", "bueno");
        Vampire eduard = new Vampire("Eduard", 19, "masculino", "Estudiante", "experimentado", "leer el pensamiento", 500,true);
        Werewolf jacob = new Werewolf("Jacob",16,"masculino","Residente","Clan Black",false);
        Human charlie = new Human("Charlie", 48,"masculino","Jefe de Policía","regular","bueno");

        System.out.println(eduard.presentation());                    
        System.out.println(bella.presentation()); 
        System.out.println(jacob.presentation()); 
        System.out.println(charlie.presentation());
        System.out.println(eduard.toEat()); 

        Vampire rosalie = new Vampire("Rosalie",24,"femenino","Estudiante","experimentado","rapidez",600,true);
        VitalFunctions personajeVitalFunctions = rosalie;
        System.out.println(rosalie.getName() + ": " + personajeVitalFunctions.toEat());

    }

}