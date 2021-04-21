create database db_escola; 
use db_escola;

create table tb_alunos (
id bigint auto_increment, 
nome varchar (500),
matricula int, 
dataNascimento date, 
periodo char (1),
nota float (4,2),
primary key (id)


);
 
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Mateus", 45001, "1997-02-16", 'M',10.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Felipe", 45001, "1999-06-18", 'N',8.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Miguel", 45001, "1998-09-19", 'T',6.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("David", 45001, "1998-03-18", 'M',5.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Maya", 45001, "1999-12-1", 'M',8.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Cecelia", 45001, "1998-03-10", 'M',9.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Kaue", 45001, "1997-07-17", 'N',10.00);
insert into tb_alunos ( nome, matricula, dataNascimento, periodo, nota) values("Marilia", 45001, "1998-01-15", 'T',5.00);

select * from tb_alunos; 
select * from tb_alunos where nota > 7.00;
select * from tb_alunos where nota < 7.00;
update tb_alunos set nota = 10.00 where id = 4;