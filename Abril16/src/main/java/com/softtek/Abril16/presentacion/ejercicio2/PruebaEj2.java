package com.softtek.Abril16.presentacion.ejercicio2;

import com.softtek.Abril16.modelo.ejercicio2.Coche;
import com.softtek.Abril16.modelo.ejercicio2.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaEj2 {

    public static void main(String[] args) {
        SpringApplication.run(PruebaEj2.class, args);

        // Get Coche and Conductor objects from Spring context
        Coche coche = SpringApplication.run(PruebaEj2.class, args).getBean(Coche.class);
        Conductor conductor = SpringApplication.run(PruebaEj2.class, args).getBean(Conductor.class);

        // Display initial state
        System.out.println("Coche inicial:");
        System.out.println("Nivel de combustible: " + coche.moverse()); // Access fuel level from Coche object
        System.out.println("Conductor:");



        // Simulate driving
        for (int i = 0; i < 1; i++) {
            conductor.conducir();
        }

        // Display final state
        System.out.println("\nCoche final:");
        System.out.println("Nivel de combustible: " + coche.moverse()); // Access final fuel level from Coche object
    }

    @Bean
    public Coche coche() {
        return new Coche(10);
    }

    @Bean
    public Conductor conductor(@Autowired Coche coche) {
        return new Conductor(coche);
    }
}
