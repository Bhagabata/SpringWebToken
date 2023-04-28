/*1. Create a Database as Nexwave
2. Inside that database create a emp table with fields emp_id, name, dept, salary
3. insert upto 10 employees data into emp table with all the fields,
4. give a 10% hike to all the employees,
5. Delete all employees whose salary is less than 15000,
6. modify the salary column name to gross_salary,
7. Find the average of all the salaries,
8. Count the number of records in the table,
9. Find the total sum of salary in emp table,
10. Find the lowest salary in the table,
11. Find the highest salary in the table,
12. Calculate the annual salary of each employee,
13. Find only unique employee names,
14. concat the name of employee with company name
15. Update the emp_id of any perticular employee
16. Insert another employee without emp_id and dept,
17. Sort all the employees by name in descending order,
18. Group all the employees by dept and find the hightest salary in each dept,
19. Clear all the data from the table,
20. Delete the table,*/
-- 1. Create a Database as Nexwave
create database  Nexwave;
-- 2.Inside that database create a emp table with fields emp_id, name, dept, salary
create table Employee(Employee_id int,employee_name varchar(20),employee_salary int);
-- 3. insert upto 10 employees data into emp table with all the fields,
insert into employee values(01,"Srihari",120000),(02,"Praveen",115000),(03,"Rajasekhar",110000),(04,"prasad",100000),(05,"nikhil",98000),(06,"Suraj",12000),(07,"mounika",60000),(08,"soumya",45000),(09,"suchith",30000),(10,"Rajesh",530000);

select *from employee;
-- 4. give a 10% hike to all the employees,
update  employee set employee_salary=((employee_salary*0.1)+employee_salary) where employee_salary;
-- 5. Delete all employees whose salary is less than 15000,
delete from Employee where employee_salary=(employee_salary<40000);
-- 6. modify the salary column name to gross_salary,
alter table employee rename column employee_salary to salary;
-- 7. Find the average of all the salaries,
select round(avg(salary))from employee; 
-- 8. Count the number of records in the table,
select count(*)from employee;
-- 9. Find the total sum of salary in emp table,
select sum(salary) from employee;
-- 10. Find the lowest salary in the table,
SELECT  MIN(salary) FROM employee;
-- 11. Find the highest salary in the table,
SELECT  MAX(salary) FROM employee;
USE NEXWAVE;
SHOW tables;
-- 12. Calculate the annual salary of each employee,
SELECT  round(salary*12) FROM employee;
-- 13. Find only unique employee names,
SELECT DISTINCT "srihari" FROM EMPLOYEE;
-- 14. concat the name of employee with company name 
select concat(employee_name,"  Nexwave.inc")from employee;
-- 15. Update the emp_id of any perticular employee
update  employee set employee_id=100 where employee_id=01;
-- 16. Insert another employee without emp_id and dept,
insert into employee  (salary,employee_name) values(12000,"lucky"); 
-- 17. Sort all the employees by name in descending order,
select * from employee order by employee_name desc;
-- 18. Group all the employees by dept and find the hightest salary in each dept,
SELECT  MAX(salary) FROM employee group by salary ;
-- 19. Clear all the data from the table,
truncate table employee;
-- 20. Delete the table
drop table nexwave;











