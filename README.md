
# 📒 Projeto Agenda com JDBC

Este projeto é uma aplicação simples de **agenda de contatos**, desenvolvida em **Java**, com o objetivo de praticar o uso da **API JDBC (Java Database Connectivity)** para realizar operações com banco de dados **MariaDB**. O projeto utiliza o **Maven** como ferramenta de gerenciamento de dependências e build.

## 🚀 Objetivos

- Praticar os conceitos de JDBC
- Realizar operações CRUD (Create, Read, Update, Delete)
- Aprender a conectar uma aplicação Java com um banco de dados relacional
- Utilizar o Maven para facilitar o gerenciamento do projeto

## 🛠️ Tecnologias Utilizadas

- Java
- JDBC
- MariaDB
- Maven
- IDE de sua escolha (ex: IntelliJ, Eclipse, VSCode)

## 💾 Funcionalidades

- ✅ Adicionar novo contato
- ✅ Listar contatos cadastrados
- ✅ Atualizar informações de um contato
- ✅ Deletar um contato

## 🧰 Dependências (Maven)

No seu `pom.xml`, adicione a dependência do driver JDBC para MariaDB:

```xml
<dependencies>
  <dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
    <version>3.1.4</version> <!-- ou a versão mais recente -->
  </dependency>
</dependencies>
````

## 🔧 Configuração do Banco de Dados

1. Instale o MariaDB na sua máquina.
2. Crie o banco de dados:

```sql
CREATE DATABASE agenda;
```

3. Crie a tabela:

```sql
CREATE TABLE contatos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  telefone VARCHAR(20),
  email VARCHAR(100)
);
```

4. Atualize as credenciais de acesso ao banco no seu código Java:

```java
String url = "jdbc:mariadb://localhost:3306/agenda";
String user = "seu_usuario";
String password = "sua_senha";
```

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/nome-do-repositorio.git
```

2. Importe o projeto em sua IDE como um projeto Maven.
3. Compile e execute o arquivo principal da aplicação.
4. Use o menu interativo para gerenciar os contatos.

## 🧠 Aprendizados

Durante o desenvolvimento deste projeto, pratiquei:

* Conexão entre Java e bancos de dados relacionais com JDBC
* Utilização de `PreparedStatement` para evitar SQL Injection
* Manipulação de dados com SQL
* Estruturação de projeto Java com Maven

## 📌 Observações

Este projeto é apenas para fins de **aprendizado** e **prática** com JDBC. Futuramente, pode ser estendido com:

* Interface gráfica (JavaFX ou Swing)
* Integração com uma API REST
* Validações e logs

---

📅 Desenvolvido por Breno do Nascimento Santos.

```
