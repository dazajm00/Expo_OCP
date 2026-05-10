package com.ocp.Ejercicios2;

interface Animal {

    String sonar();
    String nombre();

}

// ── Implementaciones ──────────────────────────────────────────

class Perro implements Animal {
    public String nombre() { return "Perro"; }
    public String sonar()  { return "¡Guau guau!"; }
}

class Gato implements Animal {
    public String nombre() { return "Gato"; }
    public String sonar()  { return "¡Miau!"; }
}

class Vaca implements Animal {
    public String nombre() { return "Vaca"; }
    public String sonar()  { return "¡Muuu!"; }
}

// Animal nuevo agregado sin tocar nada de lo anterior

class Leon implements Animal {
    public String nombre() { return "León"; }
    public String sonar()  { return "¡Roaaaar!"; }
}

