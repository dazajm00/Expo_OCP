package com.ocp.Ejercicios2;

public interface Ejemplo2_Animales {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  OCP — Ejemplo 2: Sonidos de animales    ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        zoo.escuchar(new Perro());
        zoo.escuchar(new Gato());
        zoo.escuchar(new Vaca());
        zoo.escuchar(new Leon());

        System.out.println();
        System.out.println("¿Quieres agregar un Pato?");
        System.out.println("Crea: class Pato implements Animal { ... }");
        System.out.println("La clase Zoologico no se toca. Eso es OCP.");
    }
}
