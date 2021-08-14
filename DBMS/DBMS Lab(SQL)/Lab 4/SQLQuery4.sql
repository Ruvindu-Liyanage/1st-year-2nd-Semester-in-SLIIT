--create database Worksheet_4
--use Worksheet_4

create table Employee(
Empno int primary key,
Empname varchar(20),
Job varchar(20),
Dno int,
Salary float
)



insert into Employee values(100,'Nimal','HR assistant',1,25000)
insert into Employee values(101,'Gamini','IT Manager',2,80000)
insert into Employee values(102,'Supipi','Software Engineer',2,60000)
insert into Employee values(110,'Dev','Project Manager',2,85000)
insert into Employee values(121,'Sahani','Admin Manager',1,70000)
insert into Employee values(107,'Dev','Software Engineer',2,68000)
insert into Employee values(108,'Anuki','Finance Manager',3,70000)
insert into Employee values(114,'Supipi','Software Engineer',2,42000)
insert into Employee values(122,'Janani','Finance Executive',3,32000)
insert into Employee values(124,'Danuki','Finance Executive',3,32000)
insert into Employee values(125,'Methmi','Admin Support',1,22000)
insert into Employee values(127,'Malik','Research Assistant',4,56000)
insert into Employee values(134,'Chathuri','Software Engineer',3,56000)

select *
from Employee;

Section A
a).	How many unique jobs are there in the employee table?
select count( distinct Job) as 'No of Jobs'
from Employee;

b).	List the employee number and the name. Sort the output in the ascending order of employee name. 
Method 1
select Empno, Empname
from Employee
order by Empname asc;

select Empno, Empname
from Employee
order by Empname;

Method 2
select Empno, Empname
from Employee
order by 2;

select Empno, Empname
from Employee
order by 2 asc;

Method 3
select Empno, Empname as 'Employee Name'
from Employee
order by 'Employee Name';


c).	List all employees whose name start with a letter between C and M. Sort the output in the descending order of employee name.
Method 1
select *
from Employee
where Empname like '[C-M]%' 
order by Empname desc;

select *
from Employee
where Empname like '[C-M]%' 
order by 2 desc;

d).	List the Job and salary of all the employees. Sort the output in descending order of Job and ascending order of salary.
select Job, Salary
from Employee
order by 1 desc, 2 asc;

select Job, Salary
from Employee
order by Job desc, Salary asc;




   Section B
a).	List the department number and the number of employees from each department.
select Dno, count(*) as 'No of Emps'
from Employee
group by Dno;


b).	List the department number and the number of employees from each department. Sort the output according to the number of employees in the ascending order.
select Dno, count(*)
from Employee
group by Dno
order by count(*) asc

select Dno, count(*) as 'No of Emps'
from Employee
group by Dno
order by 'No of Emps' asc

select Dno, count(*) as 'No of Emps'
from Employee
group by Dno
order by 2 asc

c).	List the department number and the number of employees from each department. 
List only the department with more than 2 employees. 
Sort the output according to the number of employees in the descending order.
select Dno, count(*)
from Employee
group by Dno
having count(*) >2
order by count(*) asc

d).	List the department number and the highest salary of each department. 
Sort the output according to the highest salary in the descending order.
select Dno, max(Salary) as 'Max Salary'
from Employee
group by Dno
order by 'Max Salary' desc;

e).	Display the department number and number of unique job types are in each department.
select Dno,count(distinct Job) as 'No Jobs'
from Employee
group by Dno

f).	List the Job name and no of employees each job type. 
Sort the output according to the Job name in the descending order.
select Job, count(Job) as 'No of Jobs'
from Employee
group by Job
order by Job desc;

g).	List the dno and the number of employees whose name start with a letter between C and S. 
Sort the output in the ascending order of number of employees.
select Dno, count(*) as 'No of Emps'
from Employee
where Empname like '[c-s]%'
group by Dno
order by count(*) asc;

h).	List the dno and the number of employees whose name start with a letter between C and S. 
List only the department with more than 2 such employees. Sort the output in the ascending order of number of employees.
 

select Dno, count(*) as 'No of Emps'
from Employee
where Empname like '[c-s]%'
group by Dno
having count(*) >2
order by count(*) asc;