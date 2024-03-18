drop table if exists employee;
drop table if exists department;

create table department (
id integer primary key not null AUTO_INCREMENT,
name varchar(45)
);

insert into department (id, name)
values (1, 'accounting'), (2, 'engineering');

select * from department;

create table employee (
id integer primary key not null AUTO_INCREMENT,
name varchar(45),
age integer,
salary integer,
dept_id integer,
foreign key (dept_id) references department(id)
);


insert into employee (id, name, age, salary, dept_id)
values (1, 'john', 30, 100, 1), (2, 'mary',  24, 90, 1), (3, 'jack', 23, 80, 2), (4, 'pete', 33, 100, 2);

select * from employee;
