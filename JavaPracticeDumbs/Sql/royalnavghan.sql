create table srihari(product_name varchar2(20),product_price number,product_status varchar(20));
insert into srihari values('hello',2500,'good');
select*from srihari;
insert into srihari values('hello1',25000,'good');
insert into srihari values('hello2',250000,'good');
insert into srihari values('hello3',2500000,'good');
insert into srihari values('hello4',25000000,'good');
insert into srihari values('hello5',250000000,'good');
select round(avg (product_price)) from srihari;
delete from srihari where product_price=2500 ;
alter table srihari rename column product_name to name;

