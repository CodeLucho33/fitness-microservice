# 🧠 AI-Powered Fitness Application

Una aplicación de fitness completamente funcional basada en microservicios, que incorpora inteligencia artificial para mejorar la experiencia del usuario. Diseñada con tecnologías modernas, escalables y seguras.

## ✨ Características Destacadas

- 💪 Aplicación Fitness con funcionalidades completas (usuarios, rutinas, seguimiento)
- 🤖 Integración de IA para recomendaciones personalizadas de ejercicios
- 📚 Guía paso a paso para facilitar el aprendizaje y comprensión
- 🧩 Arquitectura modular y escalable basada en microservicios

## 🧱 Tech Stack

- **Backend:** Spring Boot (Java)
- **Frontend:** React JS
- **Autenticación & Seguridad:** Keycloak
- **Gateway:** Spring Cloud Gateway
- **Descubrimiento de Servicios:** Eureka Server (Spring Cloud Netflix)
- **Mensajería Asíncrona:** RabbitMQ (Spring AMQP)
- **Bases de Datos:** PostgreSQL / MySQL (según configuración)
- **API de IA:** Google Gemini API
- **Configuración Centralizada:** Spring Cloud Config Server

## 📐 Arquitectura

La aplicación está dividida en múltiples microservicios comunicándose a través de HTTP y mensajería asíncrona:

- **User Service**
- **Workout Service**
- **Recommendation (AI) Service**
- **Auth Server (Keycloak)**
- **API Gateway**
- **Config Server**
- **Service Registry (Eureka)**

> 📝 Diagrama de arquitectura próximamente.

## ⚙️ Requisitos Previos

- Java 17+
- AWS
- RabbitMQ (puede ejecutarse con Docker)
- PostgreSQL, MySQL, MongoDB
- Cuenta con acceso a Google Gemini API

## 🚀 Cómo Ejecutar

1. Clonar el repositorio
2. Configurar las variables de entorno y archivos `application.yml`
3. Levantar los servicios:

```bash
# Backend
cd backend
./mvnw spring-boot:run

# Frontend
cd frontend
npm install
npm run dev
