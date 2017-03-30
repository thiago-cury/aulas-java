create table produto(
    idproduto bigint auto_increment,
    nome varchar(50) not null,
    valorcusto double not null,
    quantidade int not null,
    primary key(idproduto)
)
