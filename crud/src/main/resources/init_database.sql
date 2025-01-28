create user crud with login password 'crud';
create database crud owner crud encoding 'utf8';

CREATE TABLE employees
(
    id         serial primary key,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     integer
);

INSERT INTO employees (name, surname, department, salary
)
VALUES
    ('Zaur', 'Tregulov', 'IT', 500
    ),
    ('Oleg', 'Ivanov', 'Sales', 700
    ),
    ('Nina', 'Sidorova', 'HR', 850
    );