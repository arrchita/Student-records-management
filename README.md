
# Student Records Management

A Spring Boot application designed for managing student records. This project leverages Spring Boot, Hibernate ORM, and MySQL to perform CRUD operations on student information. Maven is used for dependency management, and RESTful APIs are tested using Postman.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)

---

## Features
- **Create, Read, Update, Delete (CRUD)** functionality for student records.
- Dynamic query methods for customized data retrieval.
- RESTful API endpoints for easy interaction.
- Hibernate ORM integrated for database management.
- API tested using Postman.

## Technologies Used
- **Spring Boot**: For creating a maintainable application structure.
- **Hibernate ORM**: For database operations.
- **MySQL**: Database for storing student records.
- **Maven**: For dependency management.
- **Postman**: For API testing.

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/arrchita/Student-records-management.git
   cd Student-records-management
   ```

2. **Configure Database**
   Ensure you have a MySQL database named `studentdb`. The application connects to it using the following settings:

   ```properties
   spring.application.name=hibernate_project
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=root //enter your username
   spring.datasource.password=Blue@123 //enter your password
   server.port=9090 //desired port
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   ```

3. **Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```
   The application will start on `http://localhost:9090`.

## Usage
This application provides CRUD operations for managing student data:
- **Add a Student**: Add a new student record.
- **View Students**: View all or specific students by ID, name, email, or age.
- **Update a Student**: Update existing student information.
- **Delete a Student**: Remove a student record by ID.

## API Endpoints

| HTTP Method | Endpoint               | Description                        |
|-------------|-------------------------|------------------------------------|
| GET         | `/api/students`         | Retrieve all students              |
| GET         | `/api/students/id/{id}` | Retrieve a student by ID           |
| POST        | `/api/students/save`    | Add a new student                  |
| PUT         | `/api/students/update/{id}` | Update a student by ID         |
| DELETE      | `/api/students/id/{id}` | Delete a student by ID             |

### Sample Dynamic Queries
- **Find by Name**: `/api/students/name/{name}`
- **Find by Age Range**: `/api/students/age-range/{startAge}/{endAge}`
- **Count Students by Age**: `/api/students/count/age/{age}`


