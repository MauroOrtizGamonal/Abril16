package com.softtek.Abril16.presentacion.ejercicio3;

import com.softtek.Abril16.modelo.ejercicio3.Coche;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.softtek.Abril16.modelo.ejercicio3")
public class PruebaEj3 {

    public static void main(String[] args) {
        // Inicializar la aplicación Spring Boot y obtener el contexto
        ConfigurableApplicationContext context = SpringApplication.run(PruebaEj3.class, args);

        // Recuperar el bean de tipo Coche del contexto
        Coche coche = context.getBean(Coche.class);

        // Llamar al método reparar()
        String resultadoReparacion = coche.reparar();
        System.out.println("Resultado de la reparación: " + resultadoReparacion);

        // Cerrar el contexto de la aplicación al finalizar
        context.close();
    }
}
