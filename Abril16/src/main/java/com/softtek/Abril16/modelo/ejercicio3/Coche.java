package com.softtek.Abril16.modelo.ejercicio3;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class Coche {
    private Taller taller;

    @Autowired
    public Coche(Taller taller) {
        this.taller = taller;
    }

    public String reparar() {
        // Llamar al método repararCoche() en el objeto Taller
        return taller.repararCoche(this);
    }
}
