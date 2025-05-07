package org.example.crepusculo;

import java.util.ArrayList;
import java.util.List;


public class Humano extends Personaje {
    public String calidadSueño;
    public String estadoSalud;
    public static List humanos =new ArrayList();
    //public CalidadSueño calidadSueno;
    //public EstadoSalud estadoSalud;

    public Humano (String nombre, int edad, String genero, String rol, String calidadSueño, String estadoSalud) {
        super (nombre,edad,genero, rol);
        this.calidadSueño = calidadSueño.toLowerCase();
        this.estadoSalud = estadoSalud.toLowerCase();
        humanos.add(nombre);
    }
    public static List getInstancias() {
        return humanos;
    }




}

