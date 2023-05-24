Create database eleicoes;
use eleicoes;

Create table candidato(
id int(10) not null auto_increment,
nome varchar(50),
bi varchar(30),
historico varchar(100),
primary key(id)
);


Create table municipio(
id int(10) not null auto_increment,
nome varchar(10),
provinvia varchar(10),
descricao varchar(100),
quantRecenseados int(100),
Candidato1 int(10) not null, 
Candidato2 int(10) not null,
Candidato3 int (10) not null,
primary key(id),
CONSTRAINT FK_Candidato1 FOREIGN KEY (Candidato1) REFERENCES candidato (id),
CONSTRAINT FK_Candidato2 FOREIGN KEY (Candidato2) REFERENCES candidato (id),
CONSTRAINT FK_Candidato3 FOREIGN KEY (Candidato3) REFERENCES candidato (id)

);


Create table voto (
id int(10) not null auto_increment,
idMunicipio int(10) not null,
idCandidato int(10) not null, 
Datavoto datetime,
isValid boolean,
isBranco boolean,
primary key(id),
CONSTRAINT FK_Municipio FOREIGN KEY (idMunicipio) REFERENCES municipio (id),
CONSTRAINT FK_Candidato FOREIGN KEY (idCandidato) REFERENCES candidato (id)
);



/*inset do candidato
INSERT INTO `cadidnato` (`nome`, `bi`, `historico`) VALUES
 (x,x,x);

 SELECT * FROM `candidato` */

 
 /*INSERT INTO `municipio` (`id`, `nome`, `provinvia`, `descricao`, `quantRecenseados`, `Candidato1`, `Candidato2`, `Candidato3`)
  VALUES (NULL, 'ustm', 'maputo', 'localizado sssss', '200', '1', '2', '6');
  /*

  /*INSERT INTO `voto` (`id`, `idMunicipio`, `idCandidato`, `Datavoto`, `isValid`, `isBranco`) VALUES
   (NULL, '1', '1', '2023-05-23 22:51:32', '1', NULL); */

   /*
   select v.id as voto, m.nome, c.nome
    from voto as v, municipio as m, candidato as c
    
    where v.id = m.id
    and m.id = c.id;

   
   
   */

   /*contar todos os votos*/
    select count(id) from voto
   where isValid = 1;
   /*Contar os fotos em branco*/
   select count(id) from voto
   where isBranco = 1;

   /*Total de votos do municipe*/
    select count(id) from voto
   where idMunicipio;


   /*Selete para os candidatos*/
   select * from candidato;

    select 
    
    from voto as v,municipe as m



    select count(v.id), m.Candidato1, m.Candidato2, m.Candidato3
    from voto as v, municipio as m 
    where v.id = m.id and v.idMunicipio = 2;