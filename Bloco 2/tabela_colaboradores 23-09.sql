CREATE DATABASE db_test;

USE db_test;

CREATE TABLE TABELA_COLABORADORES(
ID BIGINT AUTO_INCREMENT, 
NOME VARCHAR(1000),
IDADE INT,
AREA CHAR(255),
SUPERVISOR VARCHAR(1000),
SALARIO INT,
PRIMARY KEY(ID)
);

INSERT INTO TABELA_COLABORADORES(NOME, IDADE, AREA, SUPERVISOR, SALARIO) 
VALUES("ANA SILVA",25,"VENDAS","ALEX JOSÉ",3500);
INSERT INTO TABELA_COLABORADORES(NOME, IDADE, AREA, SUPERVISOR, SALARIO) 
VALUES("JOÃO PEREIRA",45,"VENDAS","ALEX JOSÉ",4000);
INSERT INTO TABELA_COLABORADORES(NOME, IDADE, AREA, SUPERVISOR, SALARIO) 
VALUES("JÉSSICA ALVES",53,"SUPORTE","MARCELO SILVA",2500);
INSERT INTO TABELA_COLABORADORES(NOME, IDADE, AREA, SUPERVISOR, SALARIO) 
VALUES("MARIO CARVALHO",21,"ESTÁGIO","ALEX JOSÉ",1500);
INSERT INTO TABELA_COLABORADORES(NOME, IDADE, AREA, SUPERVISOR, SALARIO) 
VALUES("ANGELA CLARA",36,"ESTÁGIO","ALEX JOSÉ",900);

SELECT * FROM TABELA_COLABORADORES;
SELECT * FROM TABELA_COLABORADORES WHERE SALARIO > 2000;
SELECT * FROM TABELA_COLABORADORES WHERE SALARIO < 2000;

SET SQL_SAFE_UPDATES = 0;
UPDATE TABELA_COLABORADORES SET SALARIO = 1900 WHERE NOME = "ANGELA CLARA";
SELECT * FROM TABELA_COLABORADORES WHERE NOME = "ANGELA CLARA";