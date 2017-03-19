CREATE DATABASE distribuidora;

USE distribuidora;

CREATE TABLE fornecedor(
  codigo	int(5) auto_increment, 
  nome		varchar(45) not null,
  cnpj		int(14) not null,
  endereco  varchar(45) not null,
  cidade    varchar(40) not null,
  telefone  int(11) not null,
  email		varchar(50) not null,
PRIMARY KEY (codigo));

insert into fornecedor values (1, 'teste bd', 1, 'teste bd', 'teste bd', 1111, 'teste bd');

select * from fornecedor;

CREATE TABLE estoque(
	codigo 			int (5) auto_increment,
    categoria 		boolean not null,
    fabricante		varchar(40) not null,
    descricao 		varchar (30) not null,
    preco_venda  	float(5) not null,
    preco_custo  	float(5) not null,
    quantidade	 	int(4) not null,
PRIMARY KEY (codigo));

insert into estoque values (1, false, 'Coca Cola', 'teste bd', 5, 2.50, 10);

select * from estoque;