## Overview
 
This microservice is designed to manage a product catalog. It includes functionalities such as retrieving all products, adding a new product, updating a product, deleting a product, and more.
 
## Technologies Used
 
- Spring Boot
- Spring Data JPA
- Spring Cloud Config (for configuration management)
- Other dependencies...
 
## Configuration
 
- Database configuration: Update `application.properties` with the database connection details.
- Config Server: Ensure the Config Server is correctly configured and running.
 
## Build and Run
 
1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd product-catalog-microservice`
3. Build the project: `./mvnw clean install` 
4. Run the application: `./mvnw spring-boot:run` 
 
## Configuration Management
 
The microservice uses Spring Cloud Config for externalized configuration. The configuration files are stored in a Git repository, and the Config Server provides the configuration to this microservice.
 
