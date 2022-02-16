REM   Script: Activity9
REM   JOIN operations

select salesman.SALESMAN_NAME, customers.CUSTOMER_NAME from salesman
inner join customers
on salesman.SALESMAN_ID = customers.SALESMAN_ID

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_NAME AS "Salesman" FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

select cus.CUSTOMER_NAME, sales.SALESMAN_NAME, sales.COMMISSION from customers cus
inner join salesman sales
on cus.SALESMAN_ID = sales.SALESMAN_ID where sales.COMMISSION > 12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "CustomerName", b.grade, c.SALESMAN_NAME AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;
