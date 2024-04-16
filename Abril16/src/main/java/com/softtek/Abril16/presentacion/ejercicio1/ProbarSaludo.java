package com.softtek.Abril16.presentacion.ejercicio1;

import com.softtek.Abril16.modelo.ejercicio1.Saludo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.softtek.Abril16.modelo.ejercicio1")
public class ProbarSaludo {

    public static void main(String[] args) {
        // Inicializar la aplicación Spring Boot y obtener el contexto
        ConfigurableApplicationContext context = SpringApplication.run(ProbarSaludo.class, args);

        // Recuperar el bean de tipo Saludo del contexto
        Saludo saludo = context.getBean(Saludo.class);

        // Mostrar el mensaje de bienvenida
        System.out.println(saludo.getMensajeBienvenida());

        // Cerrar el contexto de la aplicación al finalizar
        context.close();
    }
}
