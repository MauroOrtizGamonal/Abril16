package com.softtek.Abril16.modelo.ejercicio3;

import org.springframework.stereotype.Service;

@Service
public class TallerMecanica implements Taller {

    @Override
    public String repararCoche(Coche coche) {
        // Simulate repair process
        System.out.println("TallerMecanica: Reparando el coche...");
        // ... (actual repair logic)
        return "El coche ha sido reparado";
    }
}
