package com.softtek.Abril16.modelo.ejercicio2;

public class Conductor {
    private Coche coche;

    public Conductor(Coche coche) {
        this.coche = coche;
    }

    public void conducir() {
        System.out.println("El conductor está conduciendo el coche.");
    }
}
