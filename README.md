# Task Management System

## Description
A simple task management system with a backend built in Java (Spring Boot) and a frontend in Angular.

## Features
- Create, read, update, and delete tasks.
- Filter tasks by status and priority.
- Simple UI using Bootstrap.

## Installation

### Prerequisites
- Java (JDK 11 or higher)
- Node.js and npm (for frontend)
- MySQL for database
- Maven for building the Spring Boot application

### Backend Setup (Spring Boot)
1. Clone the repository.
   ```bash
   git clone https://github.com/lalwaniharsh47/task-manager-system.git



Setup Backend : 

Navigate to the backend directory: 
cd task-manager

Update application.properties with your MySQL database configuration:
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager_db
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

Build and run the backend:
./mvnw spring-boot:run


Setup the Frontend:

Navigate to the frontend folder:
cd task-manager-frontend
Install the necessary dependencies:
npm install
Run the Angular app:
ng serve


The frontend should now be accessible at http://localhost:4200, and the backend at http://localhost:8080.

