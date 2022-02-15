REM   Script: Activity8
REM   Aggregate operations using Group By


select SALESMAN_ID, max(PURCHASE_AMOUNT) from orders group by SALESMAN_ID;

select SALESMAN_ID, ORDER_DATE, max(PURCHASE_AMOUNT) from orders group by SALESMAN_ID, ORDER_DATE having ORDER_DATE = TO_DATE('2012/08/17', 'YYYY/MM/DD');

select SALESMAN_ID, ORDER_DATE, max(PURCHASE_AMOUNT) from orders group by SALESMAN_ID, ORDER_DATE having max(PURCHASE_AMOUNT) in(2030, 3450, 5760, 6000);
