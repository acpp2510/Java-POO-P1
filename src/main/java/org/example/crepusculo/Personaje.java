package org.example.crepusculo;

public class Personaje {
    private String nombre;
    private int edad;
    private String genero;
    private String rol;

    public Personaje(String nombre, int edad, String genero, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.rol= rol;
    }

    public String presentacion ( ){
        return "Hola mi nombre es: " + nombre + ", mi edad es: " + edad + " años he interpreto a un "+ rol+ " de género:" + genero+ " y soy "+ getClass().getSimpleName();
    }

    //


    public String getNombre() {
        return nombre;
    }
}
