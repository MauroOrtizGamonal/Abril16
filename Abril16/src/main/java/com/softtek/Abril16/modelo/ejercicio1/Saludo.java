package com.softtek.Abril16.modelo.ejercicio1;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    private String mensajeBienvenida = "¡Bienvenido a nuestra aplicación!";

    public String getMensajeBienvenida() {
        return mensajeBienvenida;
    }

    public void setMensajeBienvenida(String mensajeBienvenida) {
        this.mensajeBienvenida = mensajeBienvenida;
    }
}
