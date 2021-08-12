use Worksheet_1

select *
from Student

select *
from Course

----Q1
insert into Student values(105,'Denuwan',null,'Colombo',null)	
insert into Student(Sno,Stu_name,Address,Telephone)  values (107,'Kalum','Colombo','1276534222')
insert into Student(Sno,BDate) values(108,'6-June-1998')




------Q2: Section A

--a)List the students those who come from Colombo.
select *
from Student
where Address = 'Colombo'

--b)List the students those who come from a city other than Colombo.
select *
from Student
where Address != 'Colombo'

select *
from Student
where Address <> 'Colombo'

--c)List the courses which have more than 4 credits.
select *
from Course
where Credits > 4


--d)List the name and address of students whose student number is greater than 103.
select *
from Student
where Sno > 103


--e)List the phone number of ‘Nethu’.
select Telephone
from Student
where Stu_name = 'Nethu' 





---------Q2- Section B

--a)List the course number and name of courses that start with ‘D’.
select CourseNo,Course_Name
from Course
where Course_Name LIKE 'D%'


--b)List the names of students whose name ends with ‘n’.
select *
from Student
where Stu_name LIKE '%n'


--c)List all the students with the name starting with any character, followed by ‘am’
select *
from Student
where Stu_name LIKE '_am%'


--d)List all the subjects that have the word ‘design’ in its name.
select *
from Course
where Course_Name LIKE '%design%'


--e)selects all studnets with a address that starts with ‘C’ and ends with ‘O’
select *
from Student
where Address LIKE 'C%o'


--f)Select all the students with the name starting with ‘A’, ‘B’, ‘C’, or ‘D’
select *
from Student
where Stu_name LIKE '[ABCD]%'

select *
from Student
where Stu_name LIKE '[A-D]%'


--g)List all the details of students whose name start with a letter between B and N.
select *
from Student
where Stu_name LIKE '[B-N]% '


--h)List the course names that start with a letter between A and J including A and J. 
select *
from Course
where Course_Name LIKE '[A-J]%'


--i)List the names of courses which has the letter ‘s’ as the 3rd letter in course name.
select *
from Course
where Course_Name LIKE '__s%'


--j)Select all the students whose name not starting with ‘D’ or ‘S’
select *
from Student
where Stu_name LIKE '[^DS]%'

select *
from Student
where Stu_name NOT LIKE '[DS]%'




----------Selection 3

--a)Select names and phone numbers of all the students whose name start with ‘N’ or ‘D’ and 
--who are from ‘Colombo’
select Stu_name, Telephone
from Student
where Stu_name LIKE '[ND]%' AND Address = 'Colombo'



--b)List the names of courses which has the letter ‘s’ anywhere in a course name or which have more than 4 credits.
select *
from Course
where Course_Name LIKE '%S%' OR Credits>4



------Section D

--a)	List all details of students whose dob is null but the phone number is not null.
select *
from Student
where BDate IS NULL AND Telephone IS NOT NULL

--b)Select names and phone numbers of all the students whose phone number is not null.
select Stu_name, Telephone
from Student
where Telephone IS NOT NULL


--c)Select names, date of birth (dob) and phone numbers of all the students whose dob and phone both attributes are null.
select Stu_name, BDate, Telephone
from Student
where BDate IS NULL AND Telephone IS NULL
