create user my_user with login password 'my_user';

create database my_database owner my_user encoding 'utf8';

-- Создание обычной таблицы
create table employees
(
    id serial primary key,
    name varchar(15),
    surname varchar(25),
    department varchar(20),
    salary integer
);

-- Запрос для создания последовательность и дальнейшего использования GenerationType.SEQUENCE
CREATE SEQUENCE product_sequence
    START WITH 1
    INCREMENT BY 1;