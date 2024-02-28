CREATE DATABASE MERCADO;

USE MERCADO;

CREATE TABLE Setor
(
Nome VARCHAR(15),

PRIMARY KEY(Nome)
);

CREATE TABLE Funcionario
(
Nome VARCHAR(15),
Email VARCHAR(30),
Sexo VARCHAR(10),
Funçao VARCHAR(20),
Data_de_nascimento Date,
Setor VARCHAR(15),
Salario FLOAT,
Usuario VARCHAR(15),
Senha VARCHAR(15),

PRIMARY KEY(Usuario),
FOREIGN KEY(Setor) REFERENCES Setor (Nome)
);

CREATE TABLE Produto
(
Codigo INT NOT NULL,
Preço FLOAT,
Quantidade INT,
Nome VARCHAR(15),
Marca VARCHAR(15),
Validade DATE,
Nome_setor VARCHAR(15),
Usuario_funcionario VARCHAR(15) NOT NULL,

PRIMARY KEY(Codigo),
FOREIGN KEY(Nome_setor) REFERENCES Setor (Nome),
FOREIGN KEY(Usuario_funcionario) REFERENCES Funcionario (Usuario)
);