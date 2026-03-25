# 🏦 SpringBank - Account Microservice

**SpringBank** es un ecosistema financiero basado en **Microservicios Reactivos**. Este repositorio contiene el `account-service`, el núcleo encargado de la gestión de cuentas bancarias y saldos en tiempo real, diseñado para soportar alta disponibilidad y baja latencia.


---

## 🚀 Características Principales

* **Programación Reactiva:** Construido con **Spring WebFlux**, permitiendo un manejo de peticiones no bloqueante.
* **Persistencia Asíncrona:** Uso de **R2DBC** con PostgreSQL para evitar cuellos de botella en la base de datos.
* **Arquitectura Limpia:** Separación estricta entre capas (Domain, DTO, Service, Controller).
* **Infraestructura Moderna:** Despliegue orquestado con **Docker Compose** incluyendo Kafka y Redis.
* **Gestión de Eventos:** Preparado para integrarse con sistemas de mensajería (Event-Driven Design).

---

## 🛠️ Stack Tecnológico

* **Lenguaje:** Java 21 (LTS)
* **Framework:** Spring Boot 3.5+
* **Base de Datos:** PostgreSQL 16 (Relacional)
* **Driver DB:** R2DBC (Reactive Relational Database Connectivity)
* **Mensajería:** Apache Kafka (Event Broker)
* **Cache:** Redis
* **Herramientas:** Lombok, Spring Cloud Stream, Docker.

---

## 📂 Estructura del Proyecto

```text
com.dev.accountservice
  ├── config/      # Configuraciones de R2DBC y Kafka
  ├── controller/  # Endpoints REST reactivos (Mono/Flux)
  ├── domain/      # Entidades y Enums del dominio
  ├── dto/         # Data Transfer Objects (Request/Response)
  ├── repository/  # Repositorios reactivos (ReactiveCrudRepository)
  └── service/     # Lógica de negocio asíncrona
