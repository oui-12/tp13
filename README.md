https://github.com/user-attachments/assets/201b4e33-d7ee-407e-9a8c-4966955fd8fa


# 🚀 Web Service SOAP avec JAX-WS et Spring Boot

## 📋 Table des matières
- [Présentation](#-présentation)
- [Prérequis](#-prérequis)
- [Technologies utilisées](#-technologies-utilisées)
- [Installation](#-installation)
- [Structure du projet](#-structure-du-projet)
- [Endpoints SOAP](#-endpoints-soap)
- [Tests](#-tests)
- [Documentation](#-documentation)

## 🌟 Présentation
Ce projet est une implémentation d'un Web Service SOAP utilisant JAX-WS avec Spring Boot. Il fournit des opérations CRUD pour la gestion des comptes bancaires.

## 🛠️ Prérequis
- Java 11 ou supérieur
- Maven 3.6.3 ou supérieur
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Postman ou SoapUI pour les tests

## 💻 Technologies utilisées
- **Spring Boot** : 2.7.0
- **JAX-WS** : Pour les services web SOAP
- **Maven** : Gestion des dépendances
- **Lombok** : Réduire le code boilerplate
- **H2 Database** : Base de données en mémoire

## 🚀 Installation
1. Cloner le dépôt :
   ```bash
   git clone [URL_DU_DEPOT]
   ```
2. Se placer dans le répertoire du projet
3. Lancer l'application :
   ```bash
   mvn spring-boot:run
   ```
4. Accéder à l'interface WSDL :
   ```
   http://localhost:8080/ws/comptes.wsdl
   ```

## 📂 Structure du projet
```
src/
├── main/
│   ├── java/com/example/
│   │   ├── config/       # Configurations Spring
│   │   ├── model/        # Entités JPA
│   │   ├── repository/   # Couche d'accès aux données
│   │   ├── service/      # Logique métier
│   │   └── ws/           # Endpoints SOAP
│   └── resources/
│       └── application.properties
└── test/                 # Tests unitaires et d'intégration
```

## 🔍 Endpoints SOAP
### 1. getCompteById
- **Description** : Récupère un compte par son ID
- **Paramètre** : id (Long)
- **Retour** : Objet Compte

### 2. getComptes
- **Description** : Liste tous les comptes
- **Paramètre** : Aucun
- **Retour** : Liste de Comptes

### 3. createCompte
- **Description** : Crée un nouveau compte
- **Paramètre** : Objet Compte
- **Retour** : Statut de la création

### 4. deleteCompte
- **Description** : Supprime un compte par son ID
- **Paramètre** : id (Long)
- **Retour** : Statut de la suppression

## 🧪 Tests
Pour exécuter les tests :
```bash
mvn test
```

## 📚 Documentation
- [Spring Web Services](https://spring.io/projects/spring-ws)
- [JAX-WS Documentation](https://javaee.github.io/metro-jax-ws/)
- [Spring Boot Reference](https://spring.io/projects/spring-boot)

## 📝 License
Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.

## ✨ Contribution
Les contributions sont les bienvenues ! N'hésitez pas à ouvrir une issue ou une pull request.

---
Développé avec ❤️ par [Votre Nom]
