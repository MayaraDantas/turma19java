create database  bd_rh ;
use bd_rh;

create table tb_funcionario (
id bigint auto_increment ,
nome  varchar(255) not null,
sobreNome varchar (255) not null, 
salario float not null,
profissao varchar (255),
matricula bigint,
primary key (id) 
) ; 
insert into tb_funcionario ( nome, sobreNome, salario, profissao, matricula) values(  " Mayara", "Dantas", "3500", "dev", " 0001");
insert into tb_funcionario ( nome, sobreNome, salario, profissao, matricula) values(  " Felipe", "Silva", "3500", "dev" ,  "  0002");
insert into tb_funcionario ( nome, sobreNome, salario, profissao, matricula) values(  " David", " Santos", "3500", "dev", " 0003");
insert into tb_funcionario ( nome, sobreNome, salario, profissao, matricula) values(  " João", " Furtado", "3500", "dev", " 0004");
insert into tb_funcionario ( nome, sobreNome, salario, profissao, matricula) values(  " Levi", "honorato", "3500", "dev", " 0005");


select * from tb_funcionario ;
select * from tb_funcionario where salario > 2000.00; 
select * from tb_funcionario where salario < 2000.00;
update tb_funcionario set salario = 25000.00 where id = 2;

