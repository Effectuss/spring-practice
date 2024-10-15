-- Создание таблиц для связи One-To-Many department к employee как Один ко многим
CREATE TABLE departments
(
    id         serial primary key,
    name       varchar(55),
    max_salary bigint,
    min_salary bigint
);

CREATE TABLE employees
(
    id            serial primary key,
    name          varchar(55),
    surname       varchar(55),
    salary        integer,
    department_id integer,
    constraint department_id_fk foreign key (department_id) references departments (id)
);