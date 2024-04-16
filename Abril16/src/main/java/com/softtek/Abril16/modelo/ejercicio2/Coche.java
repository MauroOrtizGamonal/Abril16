package com.softtek.Abril16.modelo.ejercicio2;

public class Coche implements IVehiculo {

    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito > 0) {
            deposito--;
            return "El coche tiene gasolina";
        } else {
            return "El coche no tiene gasolina";
        }
    }
}

