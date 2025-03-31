# 📌 Marketplace API

Este repositório contém uma API desenvolvida com **Spring Boot**, focada na implementação de autenticação e segurança utilizando JWT. 

## 🚀 Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias:

- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Security** (para autenticação e controle de acesso)
- **JWT** (JSON Web Token para segurança)
- **Spring Data JPA** (para interação com o banco de dados)
- **Flyway** (para controle de migrações do banco de dados)
- **MySQL** (banco de dados utilizado)
- **Lombok** (para reduzir boilerplate no código)

## ⚙️ Configuração do Banco de Dados

No arquivo **application.properties**, configure sua conexão com o MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/marketplace_api
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

## 🔧 Instalação e Execução

1. Clone o repositório:
2. 
   ```sh
   git clone https://github.com/seu-usuario/marketplace-api.git
   ```
3. Acesse a pasta do projeto:
4. 
   ```sh
   cd api
   ```
5. Execute o projeto:
6. 
   ```sh
   mvn spring-boot:run
   ```

🛠 Testando no Postman

Criar um Usuário:

POST http://localhost:8080/users/cadastrar

Body (JSON):
```
{
    "nome": "Alan M. Souza",
    "email": "alan@email.com",
    "senha": "123456",
    "tipo": "CLIENTE"
}
```

Autenticar e Obter Token:

POST http://localhost:8080/auth/login

Body (JSON):
```
{
    "email": "alan@email.com",
    "senha": "123456"
}
```

Resposta esperada:
```
{
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCIg..."
}
```
📜 Licença

Este projeto é de uso livre para fins educacionais. 🔥🚀
