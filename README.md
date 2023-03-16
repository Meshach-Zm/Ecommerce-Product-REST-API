Spring Boot API MongoDB

Product API
This is a simple RESTful API built with Spring Boot that allows users to manage products. It uses MongoDB as the database.

Getting Started
Prerequisites
Java 11 or later
MongoDB
Installation
Clone this repository: git clone https://github.com/Meshach-Zm/Spring-boot-API.git

Navigate to the project directory:
cd Spring-boot-API
Build the application: ./mvnw package
Run the application: java -jar target/spring-boot-api-0.0.1-SNAPSHOT.jar
Usage
The API supports the following endpoints:

GET /products: Get a list of all products
POST /products: Create a new product
GET /products/{id}: Get a product by ID
PUT /products/{id}: Update a product by ID
DELETE /products/{id}: Delete a product by ID
The request and response formats for each endpoint are described in the Swagger UI, which can be accessed at http://localhost:8080/swagger-ui.html.

Configuration

By default, the API connects to a MongoDB instance running on localhost:27017. 
You can change this by modifying the spring.data.mongodb.uri property in src/main/resources/application.properties.

Contributing
Contributions are welcome! Please fork this repository and submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.
