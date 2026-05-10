package com.ocp;

public interface Figura {

    String nombre();

    double calcularArea();
    
}
class Circulo implements Figura {
    private double radio;
 
    public Circulo(double radio) {
        this.radio = radio;
    }
 
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
 
    public String nombre() {
        return "Círculo (radio=" + radio + ")";
    }
}
 
class Rectangulo implements Figura {
    private double ancho;
    private double alto;
 
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto  = alto;
    }
 
    public double calcularArea() {
        return ancho * alto;
    }
 
    public String nombre() {
        return "Rectángulo (" + "ancho=" + ancho + ", alto=" + alto + ")";
    }
}
 
class Triangulo implements Figura {
    private double base;
    private double altura;
 
    public Triangulo(double base, double altura) {
        this.base   = base;
        this.altura = altura;
    }
 
    public double calcularArea() {
        return (base * altura) / 2;
    }
 
    public String nombre() {
        return "Triángulo (base=" + base + ", altura=" + altura + ")";
    }
}


/* 
public class Hexagono implements Figura {
    private double lado;
    public Hexagono(double lado) {
        this.lado = lado;
    }
public double calcularArea() {
     return (3 * Math.sqrt(3) * lado * lado) / 2;
}
 public String nombre() {
return "Hexágono (lado=" + lado + ")";
  }
}
*/