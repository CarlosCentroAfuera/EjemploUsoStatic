package com.company;

import java.util.Random;

public class Persona {

    private String name;

    // Constructores
    public Persona(String name) {
        this.name = name;
    }

    public void diQuienEres(){
        System.out.println("Mi nombre es " + name);
    }




    // Factory
    public static Persona factory() {
        Random r = new Random();
        return new Persona("Persona" + r.nextInt());
    }


}
