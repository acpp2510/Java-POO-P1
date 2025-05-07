package org.example;

import org.example.crepusculo.Hombrelobo;
import org.example.crepusculo.Humano;
import org.example.crepusculo.Vampiro;

import java.util.List;

import static org.example.crepusculo.Humano.humanos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Humano Bella = new Humano("Bella", 19, "femenino", "Estudiante", "bajo", "bueno");
        Vampiro Eduard = new Vampiro("Eduard", 19, "masculino", "Estudiante", "experimentado", "leer el pensamiento", 500,true);
        Hombrelobo Jacob = new Hombrelobo("Jacob",16,"masculino","Residente","Clan Black",false);
        Humano Charlie = new Humano("Charlie", 48,"masculino","Jefe de Policía","regular","bueno");

        System.out.println(Eduard.presentacion()); //esta en clase personaje
        System.out.println(Bella.presentacion()); //esta en clase personaje
        System.out.println(Jacob.presentacion()); //esta en clase personaje

        System.out.println(Eduard.alimentarse()); //esta en clase vampiro



    }

}