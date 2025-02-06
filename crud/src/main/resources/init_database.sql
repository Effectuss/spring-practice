create user crud with login password 'crud';

GRANT ALL PRIVILEGES ON TABLE employees TO crud;

create database crud owner crud encoding 'utf8';

SELECT current_user;

SET ROLE crud;


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

GRANT USAGE, SELECT ON SEQUENCE employees_id_seq TO crud;