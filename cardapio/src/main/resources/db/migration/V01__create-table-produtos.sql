create table produtos (
id serial primary key,
produto varchar(50) not null,
descricao varchar(200) not null,
valor real not null,
ativo bool not null
);
