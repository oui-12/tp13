// Application principale Spring Boot pour le système de gestion bancaire
package com.example.demo.tp13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe d'entrée pour l'application Spring Boot TP13.
 * Cette classe lance l'application et configure les beans de base.
 */
@SpringBootApplication // Annotation pour une application Spring Boot complète
public class Tp13Application {

    /**
     * Méthode principale pour exécuter l'application
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(Tp13Application.class, args);
    }

}
