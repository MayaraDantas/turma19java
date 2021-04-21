create database db_ecommerce ;
use db_ecommerce;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
descricao varchar (255) not null , 
valor float,
quantidade int (3),
primary key (id)
);

 insert into tb_produtos( nome, descricao, valor, quantidade) values("batom", "pigmento para os labios ", 30, 5);
 insert into tb_produtos( nome, descricao, valor, quantidade) values("sombra", "pigmento para os olhos ", 30, 3);
 insert into tb_produtos ( nome, descricao, valor, quantidade) values("rimel", "pigmento para os cilios ", 30, 6);
 insert into tb_produtos( nome, descricao, valor, quantidade) values("blush", "pigmento para os bochecha  ", 30, 8);
 insert into tb_produtos ( nome, descricao, valor, quantidade) values("esmalte","pigmento para os unhas ", 30, 9);
 insert into tb_produtos( nome, descricao, valor, quantidade) values(" iluminador", "pigmento para os bochecha ", 30, 2);
 insert into tb_produtos( nome, descricao, valor, quantidade) values("pó banana", " selagem para o rosto ", 30, 7);
 insert into tb_produtos( nome, descricao, valor, quantidade) values("espoja eletrica ", "massageador facil  ", 30, 1);

select * from tb_produtos;
select * from tb_produtos where salario > 500; 
select * from tb_produtos where salario < 500;
update tb_produtos set valor = 500 where id = 8 ;
