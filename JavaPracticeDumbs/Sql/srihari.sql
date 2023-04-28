SHOW databases;
USE SRIHARI;

CREATE DATABASE SRIHARI;
SHOW TABLES;
CREATE TABLE LAPTOP(Product_Id int, Product_Name varchar(50),Price int);
select*from laptop;
desc laptop;
 alter table laptop rename column Product_name to name; 
rename table laptop to hp_world; 
desc hp_world;
select*from hp_world;
insert into hp_world values(01,"asus_laptop",45000);
insert into hp_world values(02,"Hp_laptop",45000);
insert into hp_world values(03,"Hp_laptop",45000);
insert into hp_world values(04,"Dell_laptop",45000);
insert into hp_world values(05,"samsung_laptop",45000),(06,"acer_laptop",44500),(07,"Apple_laptop",145000);
insert into hp_world  (product_id,name) values(07,"Samsung_laptop"); 
truncate table hp_world;
update  hp_world set price=25000 where product_id=07;




