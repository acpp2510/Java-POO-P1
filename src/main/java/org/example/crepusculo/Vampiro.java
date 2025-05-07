package org.example.crepusculo;

import java.util.ArrayList;
import java.util.List;

import static org.example.crepusculo.Humano.getInstancias;

public class Vampiro extends Personaje {
    public String estadoTransformacion;
    public String habilidadVampirica;
    public int edadVampirica;
    public boolean esVegetariano;

    public Vampiro(String nombre, int edad, String genero, String rol, String estadoTransformacion, String habilidadVampirica, int edadVampirica, boolean esVegetariano) {
        super(nombre, edad, genero, rol);
        this.estadoTransformacion = estadoTransformacion;
        this.habilidadVampirica = habilidadVampirica;
        this.edadVampirica = edadVampirica;
        this.esVegetariano = esVegetariano;
    }

    //mis funciones


    public String alimentarse() {
        if (this.esVegetariano == true) {
            return "Debes salir a cazar un venadito";
        } else {
            return "La victima podría ser: " + getInstancias();
        }
    }
}


