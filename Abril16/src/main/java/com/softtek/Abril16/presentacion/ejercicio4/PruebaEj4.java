package com.softtek.Abril16.presentacion.ejercicio4;

import com.softtek.Abril16.modelo.ejercicio4.Director;
import com.softtek.Abril16.modelo.ejercicio4.Jefe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.softtek.Abril16.modelo.ejercicio4")
public class PruebaEj4 {

    public static void main(String[] args) {
        // Inicializar la aplicación Spring Boot y obtener el contexto
        ConfigurableApplicationContext context = SpringApplication.run(PruebaEj4.class, args);

        // Recuperar el bean de tipo Jefe del contexto
        Jefe jefe = context.getBean(Jefe.class);

        // Llamar al método getTareas() del bean Jefe y mostrar el resultado
        System.out.println("Tareas del Jefe: " + jefe.getTareas());

        // Recuperar el bean de tipo Director del contexto
        Director director = context.getBean(Director.class);

        // Llamar al método getInforme() del bean Director y mostrar el resultado
        System.out.println("Informe del Director: " + director.getInforme());

        // Cerrar el contexto de la aplicación al finalizar
        context.close();
    }
}
