create database WorkSheet_7a

use WorkSheet_7a


--Section A:
--creating the tables

create table Manager
(MgrID Integer, 
MgrName varchar (20), 
Experience integer,
constraint manager_pk primary key(MgrID)
)

create table Project 
(ProjNo varchar (5), 
MgrID integer default(1),
Budget float,
StartDate date, 
Country varchar (20),
constraint project_pk primary key(ProjNo),
constraint manager_fk foreign key(MgrID) references Manager(MgrID)
)


drop table Project

select *
from Manager

select *
from Project


--2.Insert following data into tables.

insert into Manager values(3,'Sapumal',8)
insert into Manager values(4,'Ravi',4)
insert into Manager values(1,'Nethmi',4)
insert into Manager values(6,'Sarah',6)
insert into Manager values(8,'Janith',5)


insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')



--3.Delete the manager with ID 8. Observe and explain the result.
delete 
from Manager
where MgrID =8

--comments = The record with the MangerID =8 is deleted.

4.	 Delete the manager with ID 3. Observe and explain the result.
delete 
from Manager
where MgrID =3

--comment = The record with the ManagerID = 3 is not deleted becasue it belongs to the foreign key.
--If the foreign key constraint is deleted, and then , this record can be deleted.


-----------------------------------------------------------------------------------------------------------------------------------------------


--Section B: Working with Options: ON DELETE CASCADE


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk


Step 02:  Now try to Delete the manager with ID 3. Observe and explain the result.
delete
from Manager
where MgrID =3
--comment= now the record MgrID =3 can be deleted becasue the foreign key has been already removed in the above step


--Step 03:  Delete all the records from Project table.

delete 
from Project


--Step 04:  Add the foreign key with ON DELETE CASCADE option
alter table Project
add constraint manager_fk foreign key(MgrID) references Manager(MgrID) on delete cascade

--Step 05: Insert data into Manager table (The manager record with ID =3 and ID=8) and Project Table.
insert into Manager values(3,'Sapumal',8)
insert into Manager values(8,'Janith',5)


insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 06: Now delete the Manager with ID 3. Then select all data from both tables. Observe and explain the result.
delete
from Manager
where MgrID=3

--Step 07: Inset the Manager record with ID is 3.
insert into Manager values(3,'Sapumal',8)



select *
from Manager

select *
from Project


--------------------------------------------------------------------------
--Section C: Working with Options: ON DELETE SET NULL


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk


--Step 02:  Now try to Delete the manager with ID 3. Observe and explain the result.
delete
from Manager
where MgrID =3
--comment = the record magrid=3 can be deleted now because the foregin key has already deleted from the relation

--Step 03:  Delete all the records from Project table.
delete
from Project


--Step 04:  Add the foreign key with ON DELETE SET NULL option
alter table Project
add  constraint manager_fk foreign key(MgrID) references Manager(MgrID) on delete set null


--Step 05: Insert data into Manager table (The manager record with ID =3 and ID=8) and Project Table.
insert into Manager values(3,'Sapumal',8)



insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 06: Now delete the Manager with ID 3. Then select all data from both tables. Observe and explain the result.
delete
from Manager
where MgrID=3
--comment = now we can delete the record of MgrID = 3 from table called Manager becasue the foreign key with on delete set null

--Step 07: Inset the Manager record with ID is 3.
insert into Manager values(3,'Sapumal',8)



select *
from Manager

select *
from Project









--------------------------------------------------------------------------
--Section D: Working with Options: ON DELETE SET DEFAULT


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk 

--Step 02:Now try to Delete the manager with ID 3. Observe and explain the result.
delete
from Manager
where MgrID=3
--comment|: now the record MgrId = 3 can be delteted because the foreign key has been already deleted.

--Step 03:  Delete all the records from Project table.
delete 
from Project

--Step 04:  Add the foreign key with ON DELETE SET DEFAULT option
alter table Project
add constraint manager_fk foreign key(MgrID) references Manager(MgrID) on delete set default

--Step 05: Insert data into Manager table (The manager record with ID =3 ) and Project Table.
insert into Manager values(3,'Sapumal',8)



insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 06: Now delete the Manager with ID 3. Then select all data from both tables. Observe and explain the result.
delete
from Manager
where MgrID=3

--Step 07: Inset the Manager record with ID is 3.
insert into Manager values(3,'Sapumal',8)



select *
from Manager

select *
from Project




--------------------------------------------------------------------------
--Section E: Working with Options: ON UPDATE CASCADE


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk

--Step 02:  Delete all the records from Project table.
delete 
from Project

--Step 03: Add the foreign key with ON UPDATE CASCADE option. 
alter table Project
add constraint manager_fk foreign key(MgrID) references Manager(MgrID) on update cascade


--Step 04:  Insert data into Project Table
insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 05:Now update the Manager with ID 3 with 10. Then select all data from both tables. Observe and explain the result.
update Manager
set MgrID=10
where MgrID=3




select *
from Manager

select *
from Project






--------------------------------------------------------------------------
--Section f: Working with Options: ON UPDATE SET NULL


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk

--Step 02:  Delete all the records from Project table.
delete
from Project

--Step 03: Update the Manager with ID 10 with 3.
update Manager
set MgrID=3
where MgrID=10

--Step 04:  Add the foreign key with ON UPDATE SET NULL option 
alter table Project
add constraint manager_fk foreign key(MgrID) references Manager(MgrID) on update set null

--Step 05:  Insert data into Project Table

insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 06:Now update the Manager with ID 3 with 10. Then select all data from both tables. Observe and explain the result.
update Manager
set MgrID=10
where MgrID=3

select *
from Manager

select *
from Project




--------------------------------------------------------------------------
--Section G: Working with Options: ON UPDATE SET DEFAULT


--Step 01: Alter the table and drop the foreign key constraint on Project table.
alter table Project
drop constraint manager_fk

--Step 02:  Delete all the records from Project table.
delete
from Project

--Step 03: Update the Manager with ID 10 with 3.
update Manager
set MgrID=3
where MgrID=10

--Step 04:  Add the foreign key with ON UPDATE SET DEFAULT option. 
alter table Project
add constraint manager_fk foreign key(MgrID) references Manager(MgrID) on update set default

--Step 05:  Insert data into Project Table

insert into Project values('P9',3,420000.40,'12-Jul-2019','USA')
insert into Project values('P6',4,650000.50,'2-Jan-2018','USA')
insert into Project values('P4',1,230000.20,'6-Aug-2017','UK')
insert into Project values('P5',3,790000.50,'6-Sep-2019','Australia')
insert into Project values('P2',6,520000.40,'23-Jan-2017','Australia')
insert into Project values('P1',1,420000.40,'23-Feb-2017','UK')
insert into Project values('P3',4,820000.40,'21-Mar-2018','USA')

--Step 06:Now update the Manager with ID 3 with 10. Then select all data from both tables. Observe and explain the result.
update Manager
set MgrID=10
where MgrID=3

select *
from Manager

select *
from Project


