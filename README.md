# Desafio CRUD
Eu escolhi fazer um cadastro simples de pessoa.


#Techstack:
- Eclipse 2019-19 ?
- Mysql Server  ?
- MySQL Workbench
- Java 1.8 ?
- Maven 4.0.0
- Hibernate 5.4
- Java server faces 2.2
- Tomcat 7.0

#Intrucoes para rodar

- IDE de preferência: Eclipse
- Configure servidor tomcat

- Banco de dados
Esta aplica

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


- Rodar

- URL da aplicação
``http://localhost:8083/DesafioCRUD/``

