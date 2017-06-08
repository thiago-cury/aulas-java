create table produto(
      idproduto bigint auto_increment,
      nome varchar(30) not null,
      valorcusto decimal(10,2) not null,
      quantidade bigint not null,
      primary key(idproduto)
);

insert into produto(idproduto, nome, valorcusto, quantidade)
values(null,"chinelo",10.5,100),
(null,"trakinas",1.9,30),
(null,"farinha",1.5,20),
(null,"feijão",6.5,400),
(null,"arroz",2.5,500),
(null,"suco",3.98,200),
(null,"café Bom Jesus",5.5,100),
(null,"café Melita",4.5,23),
(null,"Erva Mate Tacapi",5.5,70),
(null,"Negresco",1.5,50);
