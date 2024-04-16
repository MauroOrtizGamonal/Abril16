package com.softtek.Abril16.modelo.ejercicio4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jefe extends Empleado implements Informe {

    private Informe informe;
    private String tareas;

    @Autowired
    public Jefe(String nombre, Informe informe) {
        super(nombre);
        this.informe = informe;
        this.tareas = "Gestionar equipo, coordinar proyectos, revisar informes";
    }

    public String getTareas() {
        return tareas;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
