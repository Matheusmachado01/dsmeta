# Projeto Spring React

Acesse por este link --> https://dsmetamatheusm.netlify.app/

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Matheusmachado01/dsmeta/blob/main/license)

**Spring React Project** é uma aplicação full stack web e mobile desenvolvida durante a **Semana Spring React**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior") com o intuito de ensinar uma forma de integração de uma aplicação Frontend com Backend.

A aplicação consiste em uma tela web estática, na qual o usuário pode consultar uma lista de vendedores por datas, e a implementação de notificação deste vendedor é enviada via SMS que contém seu nome, a data e o total de vendas realizadas.



## Layout mobile
![Mobile 1](https://github.com/Matheusmachado01/dsmeta/blob/main/assets/mobile1.jpeg) ![Mobile 2](https://github.com/Matheusmachado01/dsmeta/blob/main/assets/mobile2.jpeg)
![Mobile 3](https://github.com/Matheusmachado01/dsmeta/blob/main/assets/mobile3.jpeg)




## Layout web
![WEB 1](https://github.com/Matheusmachado01/dsmeta/blob/main/assets/web.png)

# Tecnologias utilizadas
## Back end
- Java JDK 17
- Spring Boot
- Intellij
- Maven
- Postman
- Twilio

DEPENDÊNCIAS | REFERÊNCIA
------------ | ---------------
SPRING WEB   | https://mvnrepository.com/artifact/org.springframework/spring-web/5.3.22
SPRING SECURITY  | https://mvnrepository.com/artifact/org.springframework.security/spring-security-core/5.7.3
SPRING DATA JPA          | https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa/2.7.3
DEV TOOLS    | https://spring.io/blog/2015/06/17/devtools-in-spring-boot-1-3
H2 DATABASE  | http://www.h2database.com/html/build.html
TWILIO  | https://mvnrepository.com/artifact/com.twilio.sdk/twilio/9.0.0

## Front end
- HTML / CSS / JS / TypeScript
- NodeJS
- Yarn
- Curl
- VS Code
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: H2 Database
- Git

# Como executar o projeto

## Back end
Pré-requisitos: **Java 17**

```bash
# clonar repositório
git clone https://github.com/Matheusmachado01/dsmeta

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: **npm / yarn**

```bash
# clonar repositório
git clone https://github.com/Matheusmachado01/dsmeta

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Matheus Machado 

https://www.linkedin.com/in/matheus-machado-281a33216/
