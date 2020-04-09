# Desafio CRUD
Escolhi fazer um cadastro simples de pessoa em uma única tela(view).
Foi usado JavaServer Faces(A), persistência em um banco de dados(B), Hibernate(C) e Testes (H).


#Techstack:
- Eclipse 2019-09
- Mysql Server  8.0.19
- MySQL Workbench
- JavaSE 1.6
- Maven 4.0.0
- Hibernate 5.4
- Java server faces 2.2
- Tomcat 7.0

#Intrucões para rodar

- IDE de preferência: Eclipse
- instale Jboss tools 4.13 na própria IDE
- Configure servidor tomcat
- Banco de dados

Script para criar a tabela no banco de dados

```
CREATE TABLE pessoa (
  id int NOT NULL AUTO_INCREMENT,
  nome varchar(45) NOT NULL,
  endereco varchar(45) NOT NULL,
  numero varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  telefone varchar(45) NOT NULL,
  cidade varchar(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

- Build

Rode o maven build


- URL da aplicação
``http://localhost:8083/DesafioCRUD/``

