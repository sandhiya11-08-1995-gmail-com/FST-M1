REM   Script: Activity10
REM   Subquery operations

select * from orders where SALESMAN_ID =
(select distinct SALESMAN_ID from customers where CUSTOMER_ID = 3007);

select * from orders where SALESMAN_ID
IN (select SALESMAN_ID from customers where CITY = 'New York');

select grade, count(CUSTOMER_ID) from customers group by grade having grade >
(select avg(grade) from customers where CITY = 'New York');

select * from orders where SALESMAN_ID =
(select SALESMAN_ID, max(COMMISSION) from salesman group by );

select * from orders where SALESMAN_ID =
(select SALESMAN_ID from salesman where COMMISSION =
(select max(COMMISSION) from salesman));
