# RestSpringBoot
Create Rest server with Spring Data. You must have PostgreSQL in your machine.

# About Port
Port: 64500

# About application.properties
  # PostgreSQL configs
    spring.datasource.url=jdbc:postgresql://localhost:5432/testeDB
    spring.datasource.username=postgres
    spring.datasource.password=password


  # Create Table on PostgreSQL
        spring.jpa.hibernate.ddl-auto=create-drop

# WARN
    spring.database.driverClassName=org.postgresql.Driver
    'spring.database.driverClassName' is an unknown property.
