package com.ocp;

public class Ejemplo1_Figuras {
    public static void main(String[] args) {
    CalculadoraArea calculadora = new CalculadoraArea();
 
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  OCP Ejemplo 1: Calculadora de áreas     ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
 
     
        // Para agregar una figura nueva solo creamos una clase nueva.
        // La CalculadoraArea NO se modifica jamás.
        calculadora.mostrarArea(new Circulo(5));
        calculadora.mostrarArea(new Rectangulo(4, 6));
        calculadora.mostrarArea(new Triangulo(3, 8));
 
        System.out.println();
        System.out.println("¿Quieres agregar un Hexágono?");
        System.out.println("Solo crea: class Hexagono implements Figura { ... }");
        System.out.println("CalculadoraArea no se toca. Eso es OCP.");
    }
}
    

