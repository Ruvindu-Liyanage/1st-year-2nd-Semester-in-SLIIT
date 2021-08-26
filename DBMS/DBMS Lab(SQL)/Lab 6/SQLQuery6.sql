create database Worksheet_6

use Worksheet_6

--Q1 : CREATE TABLES------

create table Customer(
CusID int, 
Name varchar(20)not null, 
City varchar(20), 
Age int, 
NIC varchar(20), 
Email varchar(50),
constraint PK primary key (CusID),
constraint N_number check(NIC like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]V'),
constraint Bdate check(Age>18),
constraint mail unique(Email)
)

select *
from Customer;

create table Product(
ProductID varchar(10), 
ProductName varchar(20) not null, 
Unitprice int, 
Quantity int, 
Category char(5),
constraint pkey primary key(ProductID),
constraint price check(Unitprice>0)
)

select *
from Product;

insert into Customer values(100,'Kamal','Galle',25,'191447852V','kamal@yahoo.com')
insert into Customer values(101,'Janani','Matara',22,'191444552V','janai@gamil.com')
insert into Customer values(102,'Namal','Colombo',24,'191747852V','nam1@gmail.com')
insert into Customer values(105,'Jayantha','Kandy',20,'201852852V','jayan@hotmail.com')
insert into Customer values(107,'Janith','Gampaha',29,'202144782V','janith@yahoo.com')
insert into Customer values(110,'Amali','Kandy',30,'199614478V','ama@gmail.com')
insert into Customer values(115,'Kusal','Colombo',34,'199847742V','kusa@hotmail.com')
insert into Customer values(117,'Piyal','Jaffna',28,'200144442V','piya@gmail.com')


insert into Product values('P1','Chais',100,100,'A')
insert into Product values('P3','Chang',150,200,'B')
insert into Product values('P4','Aniseed Syrup',250,1000,'C')
insert into Product values('P7','Queso Cabrales',120,500,'B')
insert into Product values('P8','Genen Shouyu',400,250,'B')
insert into Product values('P10','Vegie-spread',300,1500,'A')

-------Q3-----------
alter table Product
add SupID int;

update Product
set SupID = 1
where ProductID in('P1','P3','P7')

update Product
set SupID = 2
where ProductID in('P4')

update Product
set SupID = 3
where ProductID in('P8','P10')


--a)List all customers’ details.
select *
from Customer


--b)Select the ProductID, ProductName and category of all the products.
select ProductID,ProductName,Category
from Product


--c)List the unique cities.
select distinct City
from Customer

select City
from Customer
group by City
--d)Find names of the customers who are older than 25 years.
select Name
from Customer
where Age>25


--e)Find the details of customers whose names starts with ‘S’
select *
from Customer
where Name like 'S%'

--f)Find the details of customers whose names contains ‘mal’. (anywhere in the name)
select *
from Customer
where Name like '%mal%'

--g)Find the details of customers whose city starts with any character and followed by ‘andy’
select *
from Customer
where City like '_andy'

--h)List all customers who have an e-mail address that ends with ‘gmail.com’
select *
from Customer
where Email like '%gmail.com'

--i)List all customers who are from a city starting with ‘M’ or ’K’
select *
from Customer
where City like '[KM]%'

select *
from Customer
where City like 'K%' or City like 'M%'

--j)Find the details of customers whose city does not starts with ‘G’ or ‘K’.
select *
from Customer
where City not like '[GK]%'

select *
from Customer
where City like '[^GK]%'


--k)List the details of the products those name starts with character between A and C. 
select *
from Product
where ProductName like '[A-C]%'

----l)List all customers who are from ‘Kandy’, ‘Galle’ or ‘Colombo.
select *
from Customer
where City in ('Kandy','Galle','Colombo')


----m)List the customer number and name of customers who are from Kandy and the e-mail address ends with ‘hotmail.com’
select CusID, Name
from Customer
where City = 'Kandy' and Email like '%hotmail.com'

----n)List details of products of those with a price between 50 and 100.
select *
from Product
where UnitPrice between 50 and 100

----o)List the details of the customers whose age is not between 25 and 30.
select *
from Customer
where age not between 25 and 30;




--a)Find the average price of all products.
select avg(UnitPrice) as 'Avg Price'
from Product

--b)Count the number of products in the product table.
select count(*) as 'NoOfProduct'
from Product

--c)Count the number of unique addresses in the Customer table.
select count(distinct City) as 'NoOfCity'
from Customer

--d)What is the maximum price of products which are supplied by supplier 1?
select max(UnitPrice) as 'MaxPrice'
from Product
where SupID =1

--e)Display Customer ID, Customer name and city. Sort the output in the ascending order of customer name.
select CusID, Name, City
from Customer
order by Name asc

select CusID, Name, City
from Customer
order by 2 asc

--f)List the number of customers from each city. Sort the output in the descending order of city.
select City, count(CusID) as 'No Of Cus'
from Customer
group by City
order by City desc

select City, count(CusID) as 'No Of Cus'
from Customer
group by City
order by 1 desc

g)	List the category and number of products from each category.
select Category , count(*) as 'No of product'
from Product
group by Category

--h)What is the maximum price of products in each category? Display the category and maximum price.
select Category, max(UnitPrice) as 'Max Price'
from Product
group by Category

--i)What is the average price of products in each category? Round off the average value to one decimal place.
select Category,round( avg(UnitPrice),1) as 'Averge price'
from Product
group by Category

--j)List the suppliers who supply products more than 1000 in total.
select SupID, sum(Quantity) 
from Product
group by SupID
having  sum(Quantity)>1000

--k)List the suppliers who are supplying more than one product. Sort the output in the descending order of number of products.
select SupID, count(*) as 'No of product'
from Product
group by SupID
having count(*)>1
order by count(*) desc

select SupID, count(*) as 'No of product'
from Product
group by SupID
having count(*)>1
order by 2 desc