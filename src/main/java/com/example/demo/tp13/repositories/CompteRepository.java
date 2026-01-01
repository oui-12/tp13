/**
 * Couche d'accès aux données pour les comptes bancaires
 */
package com.example.demo.tp13.repositories;

import com.example.demo.tp13.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repository pour l'entité Compte.
 * Fournit les opérations CRUD basiques grâce à JpaRepository.
 */
@Repository // Marque cette interface comme un composant de repository Spring
public interface CompteRepository extends JpaRepository<Compte, Long> {
    // Hérite des méthodes: findAll, findById, save, delete, etc.
}
