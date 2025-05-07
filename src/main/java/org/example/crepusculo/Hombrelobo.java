package org.example.crepusculo;

public class Hombrelobo extends Personaje {
   public String nombreManada;
   public boolean autocontrolTransfor;

   public Hombrelobo(String nombre, int edad, String genero, String rol, String nombreManada, boolean autocontrolTransfor) {
      super(nombre, edad, genero, rol);
      this.nombreManada = nombreManada;
      this.autocontrolTransfor = autocontrolTransfor;
   }


}
