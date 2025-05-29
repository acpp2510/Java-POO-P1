package org.example.crepusculo;

import static org.example.crepusculo.Human.getInstancias;

public class Vampire extends Character implements VitalFunctions {
    public String statusTransformation;
    public String skillVampiric;
    public int ageVampiric;
    public boolean esVegetarian;

    public Vampire(String name, int age, String genre, String role, String statusTransformation, String skillVampiric, int ageVampiric, boolean esVegetarian) {
        super(name, age, genre, role);
        this.statusTransformation = statusTransformation;
        this.skillVampiric = skillVampiric;
        this.ageVampiric = ageVampiric;
        this.esVegetarian = esVegetarian;
    }

    //mis funciones

    @Override
    public String toEat() {
        if (this.esVegetarian == true) {
            return "Debes salir a cazar un venadito";
        } else {
            return "La victima podría ser: " + getInstancias();
        }
    }
}


