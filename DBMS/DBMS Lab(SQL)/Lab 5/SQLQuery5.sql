--create database Worksheet_5
--use Worksheet_5

-----------create the table-------
create table Musician(
MusicianID int,
MusicianName varchar(30) not null,
Category varchar(20),
Rank int default 4,
Instrument varchar(20),
constraint m1 primary key(MusicianID),
constraint m2 check(Category in('Pop','Rock','Reggae','Classical'))
)

select *
from Musician

drop table Musician

---------Q2------------
insert into Musician values(12,'Selena','Pop',4,'Guitar')
insert into Musician values(14,'Davis','Rock',4,'Piano')
insert into Musician values(15,'Keanu','Reggae',3,'Guitar')
insert into Musician values(17,'Ravi','Classical',5,'Flute')
insert into Musician values(24,'Neela','Classical',DEFAULT,'Piano')
insert into Musician values(25,'Kevin','Pop',2,'Guitar')
insert into Musician values(27,'Lucas','Reggae',5,'Flute')
insert into Musician values(29,'Aiden','Classical',3,'Guitar')


----------Q3-----------
insert into Musician values(30,null,'Pop',4,'Guitar')
--comment:Cannot insert the value NULL into column 'MusicianName', table 'Worksheet_5.dbo.Musician'; column does not allow nulls. INSERT fails.
The statement has been terminated.

insert into Musician values(32,'Oliver','Hiphop',5,'Piano')
--comment: The INSERT statement conflicted with the CHECK constraint "m2". The conflict occurred in database "Worksheet_5", table "dbo.Musician", column 'Category'.
The statement has been terminated

-------------Q4---------
--adding new column
alter table Musician
add Country varchar(20)

-------Q5
update Musician
set Country = 'SriLanka'
where MusicianID in(12,17)

update Musician
set Country = 'America'
where MusicianID in(14,25,29)

update Musician
set Country = 'Brazil'
where MusicianID in(15,27)

update Musician
set Country = 'India'
where MusicianID in(24)

select *
from Musician

a)	List the unique countries of musicians. 
select distinct Country
from Musician

select Country
from Musician
group by Country

b)	List musician ID and name of musicians from Sri Lanka with a rank above 3.
select MusicianID, MusicianName
from Musician
where Country = 'SriLanka' and rank>3

c)	List all musicians those who have a rank less than to 4 or category is “Classical’.
select *
from Musician
where rank<4 and Category = 'Classical'

d)	List the details of the musicians whose name ends with n.
select *
from Musician
where MusicianName like '%n'

e)	List the name of all musicians who name start with a character between G and S
select MusicianName
from Musician
where MusicianName like '[G-S]%'

f)	List the details of the musicians whose musician IDs are between 20 and 30.
select *
from Musician
where  MusicianID between 20 and 30

g)	List musician ID and name of those play piano or guitar.
select MusicianID, MusicianName
from Musician
where Instrument in ('Piano','Guitar') 

select MusicianID, MusicianName
from Musician
where Instrument =  'Piano'or  Instrument = 'Guitar'

h)	What is the average rank of a musician? 
select avg(Rank) as 'Avg Rank'
from Musician

i)	List the maximum rank of an American musician.
select max(Rank) as 'Max Rank'
from Musician
where Country = 'America'

j)	How many unique categories are in the musician relation?   
select count(distinct Category) as 'NoOf Catagery'
from Musician

k)	List the musician ID, name, and country. Sort the output using the country.
select MusicianID, MusicianName, Country
from Musician
order by Country ASC

l)	List the Category and the number of musicians in each category. 
List only the categories which have more than one such musicians. 
sort the output in descending order of category.
select Category, count(*) as 'NoOf Musician'
from Musician
group by Category
having count(*)>1
order by Category DESC

m)List the Instrument and number of musicians who play a particular instrument. sort the output in descending order of Instrument.
select Instrument, count(*) as 'NoOf Musician'
from Musician
group by Instrument
having count(*)>1
order by Instrument DESC


7.	Delete all musicians whose rank is below 3.
delete 
from Musician
where rank<3