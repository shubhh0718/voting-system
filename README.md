# 🗳️ Voting System

A **Voting System REST API** built using **Java and Spring Boot** that provides a structured backend for managing users, candidates, and voting operations. The application uses **Spring Data JPA** for database interaction and **MySQL** for persistent data storage.

## 🚀 Features

* 👤 User management
* 🧑‍💼 Candidate management
* 🗳️ Vote management
* 🔗 RESTful API architecture
* 💾 MySQL database integration
* 🛢️ Spring Data JPA for database operations
* 📦 Layered project architecture
* 🧪 API testing support

## 🛠️ Technologies Used

| Technology          | Purpose                     |
| ------------------- | --------------------------- |
| **Java 17**         | Backend programming         |
| **Spring Boot**     | Application framework       |
| **Spring Data JPA** | Database interaction        |
| **MySQL**           | Database                    |
| **Maven**           | Dependency management       |
| **Lombok**          | Reducing boilerplate code   |
| **REST API**        | Client-server communication |

The current `pom.xml` confirms Java 17, Spring Data JPA, Spring Web MVC, MySQL Connector/J, Lombok, and Maven-based Spring Boot configuration.

## 🏗️ Project Structure

```text
voting-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/votingsystem/
│   │   │       │
│   │   │       ├── controller/
│   │   │       │   ├── CandidateController.java
│   │   │       │   ├── UserController.java
│   │   │       │   └── TestController.java
│   │   │       │
│   │   │       ├── model/
│   │   │       │   ├── Candidate.java
│   │   │       │   ├── User.java
│   │   │       │   └── Vote.java
│   │   │       │
│   │   │       ├── repository/
│   │   │       │   ├── CandidateRepository.java
│   │   │       │   └── UserRepository.java
│   │   │       │
│   │   │       └── DemoApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

The repository follows a layered structure with controllers, models, repositories, and application configuration.

## ⚙️ Architecture

```text
Client
  │
  ▼
REST API
  │
  ▼
Controller Layer
  │
  ▼
Repository Layer
  │
  ▼
Spring Data JPA
  │
  ▼
MySQL Database
```

## 📋 Prerequisites

Before running the project, make sure you have:

* Java 17 or later
* Maven
* MySQL
* IntelliJ IDEA / Eclipse / VS Code
* Postman (recommended for API testing)

## 🔧 Setup & Installation

### 1. Clone the repository

```bash
git clone https://github.com/shubhh0718/voting-system.git
```

### 2. Navigate to the project

```bash
cd voting-system
```

### 3. Configure MySQL

Create a MySQL database for the project.

Example:

```sql
CREATE DATABASE voting_system;
```

Then configure your database details inside:

```text
src/main/resources/application.properties
```

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/voting_system
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Replace `YOUR_PASSWORD` with your MySQL password.

### 4. Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class:

```text
DemoApplication.java
```

## 🧪 API Testing

You can use **Postman** to test the REST APIs.

Typical operations include:

```text
POST   → Create User
GET    → Get Users
POST   → Add Candidate
GET    → Get Candidates
POST   → Cast Vote
GET    → View Voting Data
```

> The exact endpoints depend on the controller mappings implemented in the project.

## 📚 Learning Outcomes

Through this project, the following backend concepts are practiced:

* Java Object-Oriented Programming
* Spring Boot application development
* REST API development
* Spring Data JPA
* Entity and repository concepts
* MySQL database connectivity
* Maven dependency management
* Layered backend architecture
* API testing with Postman

## 🔮 Future Enhancements

* 🔐 Spring Security authentication
* 🔑 JWT-based authorization
* 👨‍💼 Separate Admin and Voter roles
* 🚫 Prevent multiple votes from the same user
* 📊 Voting result dashboard
* 🏆 Automatic winner calculation
* ✅ Input validation
* ⚠️ Global exception handling
* 📖 Swagger/OpenAPI documentation
* 🌐 Frontend integration using React or Angular

## 👨‍💻 Author

**Shubham Singh**

GitHub: [shubhh0718](https://github.com/shubhh0718)

## 📌 Repository

[View the Voting System Project](https://github.com/shubhh0718/voting-system)

---

⭐ If you find this project useful, consider giving it a star!
