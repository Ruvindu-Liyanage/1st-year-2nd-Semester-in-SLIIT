--to create a database
create database Worksheet_1

--to active the database
use Worksheet_1;

--to create a new talble
create table Student(
Sno int primary key not null,
Stu_name varchar(50),
BDate date,
Addresse varchar(50),
Telephone varchar(30)
);


--Inserting records to the table
insert into Student values(100,'Nethu','12-June-1990','Kandy','1234567890')
insert into Student values(101,'Kevin','2-July-1994','Colombo','3456789012')
insert into Student values(102,'Kithmi','23-January-1992','Colombo','3466768789')
insert into Student values(103,'Kevin','5-August-1995','Negombo','1233454656')
insert into Student values(104,'Saman','28-February-1992','Kandy','6879889564')
insert into Student values(120,'Saman','6-June-1998','Wattala','2341231245')


--to create a new table as Course
create table Course(
CourseNo varchar(10) primary key,
Course_Name varchar(30),
Credits int
);

insert into Course values('C10','Java',4)
insert into Course values('C12','Database',4)
insert into Course values('C14','System Design',4)
insert into Course values('C16','Web Design',5)
insert into Course values('C20','Project',6)


--a)	List all the columns of Student table.
select *
from Student;

--b)	List name and address of all students.
select Stu_name,Addresse
from Student;

--c)	List all the columns of Course table.
select *
from Course;

--d)	List the course no and names of courses.
select CourseNo, Course_Name
from Course;

--e)	List the unique student names.
select distinct Stu_name
from Student;

--f)	List the unique addresses.
select distinct Address
from Student;





--to modify the column called Addresse into 'Address'
exec sp_rename 'dbo.Student.Addresse', 'Address', 'column'

--to add a new column to Stuent table
alter table Student
add Mother_name varchar(30);

--to delete a column
alter table Student
drop column Mother_name;