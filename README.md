# Spring Boot without Database

## API using Spring Boot
- [Spring initializr](https://start.spring.io/)
    - Java 17 
    - Gradle-Groovy
    - Spring Boot 3.1.7
    - Dependencies
      - Spring Web
      - Lombok
    - Packaging Jar

- Flow
  - user(frontend) - > controller - > service - > repository - > model - > database(using ArrayList in this project)

- Detail
  - Package controller
    - API mapping method
  - Package model
    - class Product for streaming array
  - Package repository
    - CRUD logic using ArrayList of Product
  - Package service
    - services of API

