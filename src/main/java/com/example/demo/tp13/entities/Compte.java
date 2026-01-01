/**
 * Entité pour représenter un compte bancaire
 */
package com.example.demo.tp13.entities;

import com.example.demo.tp13.enums.TypeCompte;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * Classe représentant un compte bancaire.
 * Cette entité est persistée dans la base de données et sérialisable en XML.
 */
@Entity // Marque cette classe comme une entité JPA
@Table(name = "comptes") // Spécifie le nom de la table
@Data // Lombok: génère getters, setters, equals, hashCode, toString
@NoArgsConstructor // Lombok: génère un constructeur sans paramètres
@AllArgsConstructor // Lombok: génère un constructeur avec tous les paramètres
@XmlRootElement // JAXB: indique l'élément racine XML
@XmlAccessorType(XmlAccessType.FIELD) // JAXB: accès par champs pour XML
public class Compte {

    /**
     * Identifiant unique du compte (clé primaire)
     */
    @Id // Clé primaire JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Génération automatique par la BD
    private Long id;

    /**
     * Solde du compte en euros
     */
    private double solde;

    /**
     * Date de création du compte
     */
    @Temporal(TemporalType.DATE) // Type de date (sans heure)
    private Date dateCreation;

    /**
     * Type de compte (COURANT ou EPARGNE)
     */
    @Enumerated(EnumType.STRING) // Stocke l'énumération en tant que chaîne
    private TypeCompte type;
}
