# 📚 Online Bookstore Management System

![Java](https://img.shields.io/badge/Java-17-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.9-green) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue) ![MongoDB](https://img.shields.io/badge/MongoDB-6-green) ![Keycloak](https://img.shields.io/badge/Keycloak-26.0.5-red) ![Docker](https://img.shields.io/badge/Docker-Compose-blue)

A robust and scalable Online Bookstore backend built with **Spring Boot** and a microservices-ready architecture. This project demonstrates modern enterprise application patterns including **OAuth2 security with Keycloak**, **Hybrid Database (SQL/NoSQL)**, **Batch Processing**, and **Reactive Caching**.

## 🚀 Key Features

*   **Advanced Security**: Full implementation of OAuth2 / OpenID Connect using **Keycloak** as the Identity Provider (IdP). Supports Resource Server & Client flows.
*   **Hybrid Data Persistence**:
    *   **PostgreSQL**: For transactional data (Books, Authors, Publishers).
    *   **MongoDB**: For unstructured high-volume data (Reviews, Ratings).
*   **High Performance**:
    *   Integrated **Spring Cache** for frequently accessed data.
    *   **Spring Batch** for heavy background processing (e.g., bulk book imports).
*   **Database Migrations**: Automated schema management using **Liquibase**.
*   **Containerized Environment**: Full Docker support for PostgreSQL, MongoDB, and Keycloak services.

## 🛠️ Technology Stack

*   **Language**: Java 17
*   **Framework**: Spring Boot 3.5.9 (Web, Data JPA, Data MongoDB, Security, Batch, OAuth2)
*   **Databases**: PostgreSQL, MongoDB
*   **Identity Management**: Keycloak
*   **Build Tool**: Gradle
*   **Infrastructure**: Docker & Docker Compose

## 📋 Prerequisites

Before running the application, ensure you have the following installed:

*   **Java 17 SDK**
*   **Docker** & **Docker Compose**

## ⚙️ Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/online-bookstore.git
cd online-bookstore
```

### 2. Start Infrastructure
This project uses `docker-compose` to spin up the required databases and Keycloak server.

```bash
docker-compose up -d
```
This will start:
*   **PostgreSQL** (Port 5433)
*   **MongoDB** (Port 27017)
*   **Keycloak** (Port 8180)
*   **Keycloak DB** (PostgreSQL)

### 3. Keycloak Configuration
The application relies on Keycloak for authentication.
*   **Admin Console**: [http://localhost:8180](http://localhost:8180)
*   **Admin User**: `admin` / `admin`
*   **Realm**: `BookStoreRealm` (Ensure this realm is created or imported if not automated)

### 4. Run the Application
You can run the application using Gradle:

```bash
./gradlew bootRun
```
The application will start on port `8080`.

## 🧪 Testing

Run unit and integration tests using:
```bash
./gradlew test
```

## 🔧 Configuration
Key configuration can be found in `src/main/resources/application.properties`.

*   **Database URLs**:
    *   Postgres: `jdbc:postgresql://localhost:5433/bookstore`
    *   Mongo: `mongodb://localhost:27017/bookstore`
*   **Keycloak**:
    *   Issuer URI: `http://localhost:8180/realms/BookStoreRealm`

## 🤝 Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## 📄 License
This project is licensed under the MIT License.
