package org.example.crepusculo;

public abstract class Character {
    private String name;
    private int age;
    private String genre;
    private String role;

    public Character(String name, int age, String genre, String role) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.role= role;
    }

    public String presentation ( ){
        return "Hola mi name es: " + name + ", mi age es: " + age + " años he interpreto a un "+ role+ " de género:" + genre+ " y soy "+ getClass().getSimpleName();
    }

    //


    public String getName() {
        return name;
    }
}
