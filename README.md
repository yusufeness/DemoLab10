Lab 10 – HTTP Implementation with Spring Boot

This project was created for Lab 10 Hometask to demonstrate how HTTP works in a backend application using Java and Spring Boot.

Project Overview

The application is a simple REST-based backend that handles HTTP requests and responses.
It follows a layered architecture where each layer has a clear responsibility:

Controllers handle HTTP endpoints

Services contain business logic

Repositories interact with the database

Models represent database entities

Project Structure
src/main/java/com/example/demo
 ├─ Application.java        // Application entry point
 ├─ controller/             // HTTP request handlers
 │   └─ UserController.java
 ├─ service/                // Business logic
 │   └─ UserService.java
 ├─ repository/             // Database access layer
 │   └─ UserRepository.java
 └─ model/                  // Domain models
     ├─ User.java
     └─ dto/
         └─ CreateUserRequest.java
How It Works

A client sends an HTTP request (e.g. GET or POST).

The request is received by a Controller.

The Controller calls the Service to process business logic.

The Service uses the Repository to read/write data from the database.

A proper HTTP response is returned with status code and body.

Running the Application

Create a .env file with database configuration.

Run the project using:

./mvnw spring-boot:run

The embedded Tomcat server starts automatically.

Example Endpoint

GET /hello
Returns a simple response to demonstrate the HTTP request–response flow.

Purpose

The main goal is to understand HTTP methods, status codes, and how Spring Boot maps them to Java code.
