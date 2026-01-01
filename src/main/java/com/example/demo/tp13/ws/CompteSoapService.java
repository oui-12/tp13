/**
 * Service web SOAP pour la gestion des comptes bancaires
 */
package com.example.demo.tp13.ws;

import com.example.demo.tp13.entities.Compte;
import com.example.demo.tp13.enums.TypeCompte;
import com.example.demo.tp13.repositories.CompteRepository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Service SOAP pour les opérations sur les comptes.
 * Expose des méthodes accessibles via SOAP pour créer, consulter et supprimer des comptes.
 */
@Component // Annotation Spring pour enregistrer ce composant
@WebService(serviceName = "BanqueWS") // Nom du service web SOAP
public class CompteSoapService {

    /**
     * Repository pour accéder aux données des comptes
     */
    @Autowired // Injection automatique de la dépendance
    private CompteRepository compteRepository;

    /**
     * Récupère tous les comptes
     * @return Liste de tous les comptes
     */
    @WebMethod // Expose cette méthode via SOAP
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }

    /**
     * Récupère un compte par son identifiant
     * @param id L'identifiant unique du compte
     * @return Le compte trouvé ou null si inexistant
     */
    @WebMethod // Expose cette méthode via SOAP
    public Compte getCompteById(@WebParam(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    /**
     * Crée un nouveau compte
     * @param solde Le solde initial du compte
     * @param type Le type de compte (COURANT ou EPARGNE)
     * @return Le compte créé avec son identifiant
     */
    @WebMethod // Expose cette méthode via SOAP
    public Compte createCompte(@WebParam(name = "solde") double solde,
            @WebParam(name = "type") TypeCompte type) {
        Compte compte = new Compte(null, solde, new Date(), type);
        return compteRepository.save(compte);
    }

    /**
     * Supprime un compte par son identifiant
     * @param id L'identifiant unique du compte à supprimer
     * @return true si la suppression a réussi, false sinon
     */
    @WebMethod // Expose cette méthode via SOAP
    public boolean deleteCompte(@WebParam(name = "id") Long id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
