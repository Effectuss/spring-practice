-- Создание двух таблиц с foreihg keys и One-To-One relation
CREATE TABLE employees
(
    id         serial primary key,
    name       varchar(55),
    surname    varchar(55),
    department varchar(35),
    salary     integer,
    details_id integer,
    constraint details_id_fk foreign key (details_id) references details (id)
);

CREATE TABLE details
(
    id           serial primary key,
    city         varchar(55),
    phone_number varchar(25),
    email        varchar(45)
);