CREATE DATABASE DB_FARMACIA_BEM_ESTAR;
USE DB_FARMACIA_BEM_ESTAR;
CREATE TABLE TB_CATEGORIAS(ID bigint(5) auto_increment, 
TIPO varchar(255) NOT NULL,
INDICACAO varchar(255) NOT NULL,
primary key(ID));
CREATE TABLE TB_PRODUTOS(ID bigint(5) auto_increment,
NOME varchar(255),
VALOR int,
MARCA varchar(255),
USO varchar(255),
CLASSE_ID bigint,
primary key(ID),
foreign key(CLASSE_ID) references TB_CATEGORIAS(ID));

INSERT INTO TB_CATEGORIAS (TIPO,INDICACAO) values ("Remédio","Sistema Digestivo");
INSERT INTO TB_CATEGORIAS (TIPO,INDICACAO) values ("Remédio","Cardiovascular");
INSERT INTO TB_CATEGORIAS (TIPO,INDICACAO) values ("Remédio","Respiratório");
INSERT INTO TB_CATEGORIAS (TIPO,INDICACAO) values ("Cosmético","Rosto");
INSERT INTO TB_CATEGORIAS (TIPO,INDICACAO) values ("Cosmético","Pele");

SELECT* FROM TB_CATEGORIAS;

INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Omeprazol", 12, "MSD","Adulto/Infantil", 1);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Amlodipina", 75, "BH","Adulto", 2);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Espironolactona", 65, "MSD","Adulto/Infantil", 2);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Fluimucil", 34, "Brafarm","Adulto/Infantil", 3);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Toner", 112, "Avene","Adulto", 4);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Hidratante", 89, "La Roche Posay","Adulto/Infantil", 5);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Serum", 75, "Avene","Adulto", 4);
INSERT INTO TB_PRODUTOS (NOME, VALOR, MARCA, USO, CLASSE_ID) values ("Protetor Solar", 62, "Brafarm","Adulto/Infantil", 5);

SELECT * FROM TB_PRODUTOS WHERE VALOR > 50;
SELECT * FROM TB_PRODUTOS WHERE VALOR > 5 AND VALOR <60;
SELECT * FROM TB_PRODUTOS WHERE NOME LIKE "%C%";
SELECT * FROM TB_PRODUTOS INNER JOIN TB_CATEGORIAS ON TB_PRODUTOS.CLASSE_ID=TB_CATEGORIAS.ID;
SELECT * FROM TB_PRODUTOS INNER JOIN TB_CATEGORIAS ON TB_PRODUTOS.CLASSE_ID=TB_CATEGORIAS.ID WHERE TB_PRODUTOS.CLASSE_ID = 5;