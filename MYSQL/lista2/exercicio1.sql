create  database db_generation_game_online;
use db_generation_game_online;

create table  tb_classe(
id      bigint  auto_increment, 
habilidade 		 varchar (200) not null,
int_forca    varchar (200) not null, 
fraqueza     varchar (200) not null, 

primary key (id)
);

create table tb_personagem (
 id bigint auto_increment,
 nome varchar (200) not null,
 ataque decimal (7,2) not null,
 forca decimal (7,2) not null, 
 genero char (1),
 classe_id bigint,
 
 primary key (id),
 foreign key (classe_id) references  tb_classe(id)
);


INSERT INTO tb_classe(habilidade, int_forca, fraqueza) VALUES ("TELETRANSPORTE", "MEDIO", "TELETRANSPORTA SOMENTE P/ LUGARES QUE JA FOI");
INSERT INTO tb_classe(habilidade, int_forca, fraqueza) VALUES ("LASER PELOS OLHOS", "FORTE", "DOR FORTE NA CABEÇA AO LANÇAR MUITOS LASER");
INSERT INTO tb_classe(habilidade, int_forca, fraqueza) VALUES ("EXPLOSÃO PELO TOQUE", "MEDIA", "NÃO TER CONTROLE AO TOQUE");
INSERT INTO tb_classe(habilidade, int_forca, fraqueza) VALUES ("CONTROLE DA MENTE", "FORTE", "SÓ UMA POR VEZ");
INSERT INTO tb_classe(habilidade, int_forca, fraqueza) VALUES ("PERSUASÃO", "FRACO", "PRECISA TOCAR A PESSOAS E CONVERSAR POR 5 MIN");

INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("LUA", 150.9, 200.0, 'F', 4);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("SOL", 333.33, 150.0, 'M', 3);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("JUPITER", 100.0, 250.33, 'O', 3);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("SATURNO ", 170.9, 200.0, 'M', 2);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("PLUTÃO", 200.000, 350.0, 'O', 5);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("VENUS", 100.0, 250.43, 'F', 1);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("MERCURIO", 150.10, 200.0, 'M', 5);
INSERT INTO tb_personagem(nome, ataque, forca, genero, classe_id) VALUES ("URANO", 33.53, 150.3, 'M', 3);


select * from tb_personagem ;
select * from tb_personagem where ataque  > 2000.00; 
select * from tb_personagem where forca > 1000 and forca < 2000;
select * from tb_personagem where nome like "%c%";
select * from tb_personagem inner join tb_classe on tb_classe.id  = tb_personagem.id; 
select * from tb_personagem where classe_id = 4;


