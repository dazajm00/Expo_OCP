package com.ocp.Ejercicios2;

public class Zoologico {
    
        public void escuchar (Animal animal) {
        System.out.printf("  El %-8s dice: %s%n", animal.nombre(), animal.sonar());
    }

}
