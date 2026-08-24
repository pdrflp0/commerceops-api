# CommerceOps API

A REST API for managing e-commerce products, inventory, and orders.

## Overview

Small e-commerce operations often manage catalog data, stock, and orders across spreadsheets or disconnected tools. CommerceOps provides a single backend service for those workflows and will support an administrative web dashboard.

## Version 1 scope

- Role-based access control for `ADMIN` and `OPERATOR` users
- Category and product management
- Inventory balances and movement history
- Order creation and lifecycle management
- Stock validation before order confirmation
- Input validation, standardized error responses, and pagination
- Interactive API documentation
- Automated tests, database migrations, and continuous integration

Out of scope for v1: payment processing, shipping carrier integrations, marketplace integrations, and a public storefront.

## Planned stack

- Java 21 and Spring Boot 4
- Spring Web, Spring Data JPA, Spring Security, and Bean Validation
- PostgreSQL and Flyway
- Docker Compose
- JUnit 5, Mockito, and Testcontainers
- OpenAPI / Swagger
- Maven Wrapper and GitHub Actions

## Architecture

```text
Admin dashboard / HTTP client
            |
            v
      Spring Boot REST API
            |
            v
        PostgreSQL
```

## Running locally

Requirements: Java 21.

```bash
./mvnw test
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd` instead of `./mvnw`.

Useful endpoints:

- `GET /api/v1`
- `GET /actuator/health`
- `GET /actuator/info`

## Documentation

- [Product scope](docs/product-scope.md)
- [Contribution guidelines](CONTRIBUTING.md)
