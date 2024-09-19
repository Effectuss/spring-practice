-- Создание таблиц для связи One-To-Many department к employee как Один ко многим
CREATE TABLE departments
(
    id         serial primary key,
    name       varchar(55),
    max_salary bigint,
    min_salary bigint,
);

CREATE TABLE employees
(
    id            serial primary key,
    name          varchar(55),
    surname       varchar(55),
    department    varchar(35),
    salary        integer,
    department_id integer,
    constraint details_id_fk foreign key (details_id) references details (id)
);