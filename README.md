API REST desenvolvida com Java e Spring Boot para gerenciamento de biblioteca, permitindo controle de livros, usuários e empréstimos.

Tecnologias utilizadas
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Funcionalidades
Cadastro de livros
Cadastro de usuários
Controle de empréstimos
Atualização de informações
Remoção de registros
Relacionamento entre entidades
Persistência de dados com JPA/Hibernate

Estrutura do projeto
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 └── config
 
Como executar o projeto
1. Clonar o repositório
git clone URL_DO_REPOSITORIO
2. Configurar o banco de dados

Criar um banco MySQL:

CREATE DATABASE biblioteca;
3. Configurar variáveis de ambiente

No IntelliJ IDEA:

Run > Edit Configurations > Environment Variables

Adicionar:

DB_USER=root;
DB_PASSWORD=suaSenha

4. Configurar o application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

5. Executar a aplicação
./mvnw spring-boot:run

A aplicação estará disponível em:

http://localhost:8080
Endpoints principais
Livros
GET /livros
POST /livros
PUT /livros/{id}
DELETE /livros/{id}
Usuários
GET /usuarios
POST /usuarios
Empréstimos
GET /emprestimos
POST /emprestimos
Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos de desenvolvimento backend utilizando Spring Boot, JPA/Hibernate, APIs REST e integração com banco de dados relacional.

Autor
Elias Wender de Morais Ramos
