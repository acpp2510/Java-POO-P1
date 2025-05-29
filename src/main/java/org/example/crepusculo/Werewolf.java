package org.example.crepusculo;

public class Werewolf extends Character {
   public String nameManada;
   public boolean autocontroleTransfor;

   public Werewolf(String name , int age , String genre, String role, String nameManada, boolean autocontroleTransfor) {
      super(name , age , genre, role);
      this.nameManada = nameManada;
      this.autocontroleTransfor = autocontroleTransfor;
   }


}
