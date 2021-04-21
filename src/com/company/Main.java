package com.company;

public class Main {

    public static void main(String[] args) {
        //Creamos la variable usando el constructor.
        Persona p1 = new Persona("Carlos");
        p1.diQuienEres();



        Persona p2 = Persona.factory();
        p2.diQuienEres();
    }
}
