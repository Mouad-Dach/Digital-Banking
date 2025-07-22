# 💳 NovaBank E-Banking System (Full Stack)

Cette plateforme bancaire numérique complète est développée avec **Spring Boot (Java)** pour le backend et **Angular** pour le frontend. Elle reproduit fidèlement les fonctionnalités essentielles d'un système bancaire en ligne moderne, offrant une gestion complète des clients et des comptes, une authentification sécurisée, des opérations financières, un contrôle d'accès utilisateur, et des tableaux de bord analytiques.

---

## 🚀 Fonctionnalités

### 🔐 Authentification & Autorisation
- Connexion sécurisée basée sur JWT
- Contrôle d'accès par rôles (`UTILISATEUR`, `ADMINISTRATEUR`)
- Routes protégées via Angular Guards
- Sections réservées aux administrateurs (journaux et gestion des utilisateurs)

### 👥 Gestion des Utilisateurs & Clients
- L'administrateur peut gérer les utilisateurs internes (création/réinitialisation de mots de passe)
- Activation/désactivation des comptes utilisateurs
- Visualisation de tous les clients
- Ajout, modification, suppression de clients
- Recherche de clients par mot-clé

### 🧾 Comptes & Opérations
- Consultation des détails des comptes (Courant / Épargne)
- Opérations de crédit / débit
- Virements entre comptes
- Consultation des journaux d'opérations par compte
- Enregistrement de l'identité de l'opérateur pour toutes les transactions

### 📈 Tableau de Bord
- Graphiques propulsés par Chart.js
- Diagramme circulaire pour les types de comptes (Courant vs Épargne)
- Graphique à barres des opérations par type (Débit, Crédit, Virement)
- Graphique à barres montrant les clients les plus actifs
- Cartes statistiques récapitulatives : nombre de clients, nombre de comptes, solde total, nombre d'opérations

### 📜 Journaux d'Actions
- Section de journaux réservée aux administrateurs
- Consultation des journaux backend pour audit et débogage

---

## 🧱 Stack Technologique

| Couche    | Technologie                    |
| -------- | ----------------------------- |
| Frontend | Angular 20                   |
| Backend  | Spring Boot, Spring Security  |
| Auth     | JWT, Route Guards, Interceptors |
| Graphiques | Chart.js (via ng2-charts)     |
| Base de données | H2 / MySQL                    |
| Documentation | Swagger UI                    |
| Build    | Maven                         |
| Langages | Java 17+, TypeScript          |

---

## 📦 Structure du Projet

### Backend: `ebanking-backend/`
```
├── config/             # Spring Security + JWT
├── controllers/        # APIs REST (auth, client, compte, journaux)
├── services/           # Logique métier
├── entities/           # Modèles JPA
├── dtos/               # DTOs Requête/Réponse
├── repositories/       # Spring Data JPA
├── mappers/            # Mapping DTO ↔ Entité
├── logs/               # Points d'accès aux journaux
└── resources/          # Configuration app & données SQL
```

### Frontend: `ebanking-frontend/`
```
├── app/
│   ├── services/           # Services Auth, Client, Compte, Journal
│   ├── guards/             # AuthGuard pour les routes
│   ├── interceptors/       # Injection de token JWT
│   ├── login/              # Formulaire de connexion
│   ├── dashboard/          # Tableau de bord avec graphiques
│   ├── customers/          # CRUD Client
│   ├── accounts/           # Opérations sur comptes
│   ├── admin/              # Journaux + Gestion utilisateurs
│   └── layout/             # Templates navbar + sidebar
```

---

## 📬 Points d'Accès Backend Principaux

| Méthode   | Point d'Accès                | Description                |
|----------|-------------------------------|----------------------------|
| `POST`   | `/auth/login`                 | Connexion utilisateur (JWT) |
| `GET`    | `/customers`                  | Liste de tous les clients   |
| `POST`   | `/customers`                  | Ajout de client             |
| `PUT`    | `/customers/{id}`             | Mise à jour de client       |
| `DELETE` | `/customers/{id}`             | Suppression de client       |
| `POST`   | `/accounts/credit`            | Créditer un compte          |
| `POST`   | `/accounts/debit`             | Débiter un compte           |
| `POST`   | `/accounts/transfer`          | Virement entre comptes      |
| `GET`    | `/accounts/{id}`              | Détails du compte           |
| `GET`    | `/logs`                       | Consultation des journaux système |
| `POST`   | `/users/reset-password`       | Réinitialisation de mot de passe par l'admin |
| `POST`   | `/users/change-password`      | Changement de mot de passe par l'utilisateur |

> ⚠️ Tous protégés par JWT + Périmètres basés sur les rôles.

---

## ▶️ Exécution du Backend

```bash
cd ebanking-backend
./mvnw spring-boot:run
```

Accédez à Swagger UI à:  
🔗 [http://localhost:8085/swagger-ui.html](http://localhost:8085/swagger-ui.html)

---

## ▶️ Exécution du Frontend

```bash
cd ebanking-frontend
npm install
ng serve
```

Le frontend s'exécute à:  
🔗 [http://localhost:4200](http://localhost:4200)

---

## 🎨 Aperçu de l'Interface

- Interface entièrement responsive avec Bootstrap 5
- Graphiques responsifs et animés
- Barre latérale avec liens dynamiques basés sur le rôle de l'utilisateur
- Identité visuelle NovaBank présente dans toute l'interface

---

## 👤 Auteur

**Mouad Dacheikh**