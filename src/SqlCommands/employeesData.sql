use employees;
create Table employees.employeesData
(
	employeeId int primary key,
    	lastName varchar (20),
    	salary decimal (6, 3)
);

insert into employees.employeesData (employeeId, lastName, salary) values
	(24, "Silva", 120.000),
    	(52, "Parker", 230.000),
    	(32, "Emmich", 450.000),
    	(15, "Lopes", 200.000),
    	(21, "Vieira", 300.500)
