CREATE TABLE children
(
    id   SERIAL PRIMARY KEY,
    name varchar(30),
    age  INTEGER
);

create table sections
(
    id   serial primary key,
    name varchar(30)
);

create table children_section
(
    child_id   integer,
    section_id integer,
    CONSTRAINT bill_product_pkey PRIMARY KEY (child_id, section_id),
    foreign key (child_id) references children (id),
    foreign key (section_id) references sections (id)
);