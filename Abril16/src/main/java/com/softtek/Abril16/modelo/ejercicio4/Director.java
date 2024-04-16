package com.softtek.Abril16.modelo.ejercicio4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director extends Empleado implements Informe {

    private Informe informe;

    @Autowired
    public Director(Informe informe) {
        super("Nombre del Director");
        this.informe = informe;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
