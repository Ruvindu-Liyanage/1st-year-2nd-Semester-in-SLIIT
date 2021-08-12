--create database Worksheet_3;
use Worksheet_3;

--1.Create the following table.

create table Employee(
Empno int primary key,
Empname varchar(20),
Job varchar(20),
Dno int,
Salary float
)

--2.Insert following data into table.

insert into Employee values(100,'Nimal','HR assistant',1,25000)
insert into Employee values(101,'Gamini','IT Manager',2,80000)
insert into Employee values(102,'Supipi','Software Engineer',2,60000)
insert into Employee values(110,'Dev','Project Manager',2,85000)
insert into Employee values(121,'Sahani','Admin Manager',1,70000)
insert into Employee values(107,'Dev','Software Engineer',2,68000)
insert into Employee values(108,'Anuki','Finance Manager',3,70000)
insert into Employee values(114,'Supipi','Software Engineer',2,42000)
insert into Employee values(122,'Janani','Finance Executive',3,32000)

select *
from Employee;


--a)List the employee name and their department number.
select Empname,Dno
from Employee;


--b)List the unique job roles in the table.
select distinct Job
from Employee;

--c)List all employees who are earning the salary more than 50000.
select *
from Employee
where Salary>50000

--d)List the employees who are working as a Software Engineer.
select *
from Employee
where Job = 'Software Engineer';

--e)List the employees whose name starts with the letter S and salary greater than 40000.
select *
from Employee
where Empname like 'S%' and  Salary>40000;

--f)Select the employees whose name ends with the string ‘ni’.
select *
from Employee
where Empname like '%ni';

g)List all the employees that have the letters ‘an’ in its name.
select *
from Employee
where Empname like '%an%';


h)Select the employees whose name starts with the letter S and ends with the letter i and department number is 2.
select *
from Employee
where Empname like 'S%i' and Dno=2;

i)List the employees where the name second character is the letter a.
select *
from Employee
where Empname like '_a%';

j)List the employees whose name starts with A or D and empno is less than to 110.
select *
from Employee
where Empname like '[AD]%' and Empno<110;

k)Select the employees whose name does not start with S or N.
select *
from Employee
where Empname not like '[SN]%';

select *
from Employee
where Empname like '[^SN]%';



l)Select the employees whose name starts with a letter between A and G or job other than Engineer (whose job does not contain the word ‘Engineer’).
select *
from Employee
where Empname like '[a-g]%' or Job not like '%Engineer%';






Section B



a).List employees whose employee number is equal to 101, 102 or 114.
select *
from Employee
where Empno =101 or Empno =102 or Empno =114;

select *
from Employee
where Empno in (101,102,114);


b).Select emp name and department no of employees whose employee no is not equal to 105, 107 or 122. 
select Empname,Dno
from Employee
where Empno != 105 or Empno != 107 or Empno != 122;


select Empname,Dno
from Employee
where Empno not in (105,107,122);


c).List employees whose salary is between 40000 and 100000.
select *
from Employee
where Salary between 40000 and 100000

d).Select the employees who are Software Engineers and salary not between 50000 and 70000.

select *
from Employee
where Salary not between 50000 and 70000 and Job = 'Software Engineer';





Section C
a).	List the number of employees in the table.
select count(*) as 'No_of_Emps'
from Employee;

b).	Find and display the highest eno. 
select max(Empno) as 'Highest_number'
From Employee;

c).	What is highest salary?
select max(Salary) as 'Highest_Salary'
From Employee;

d).	What is the smallest salary?
select min(Salary) as '
From Employee;

e).	What is the average salary of an employee?
select avg(Salary)
From Employee;

f).	How many software engineers are there?
select count(Job)
from Employee;
where Job = 'Software Engineer';

g).	How many employees are working in the department no 2?
select count(Dno)
from Employee;
where Dno = 2;

h).	How many employees are getting a salary between 50000 and 100000?
select count(Empname)
from Employee;


i).	How many employees are there whose name start with D, M or S.?
select count(Empname)
from Employee;


j).	List the highest salary of a manager. (where job has the word ‘manager’).
k).	What is the average salary of a software engineer? Round off the average salary to the two decimal places.
l).	What is the total salary paid for employees working in the department no 3?
