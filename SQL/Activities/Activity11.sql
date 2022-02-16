REM   Script: Activity11
REM   Activity11

select cus.CUSTOMER_ID, cus.CUSTOMER_NAME from customers cus where 1 <
(select count(*) from orders b where cus.CUSTOMER_ID = b.CUSTOMER_ID)
UNION
SELECT a.salesman_id, a.SALESMAN_NAME FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

SELECT a.salesman_id, SALESMAN_NAME, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, SALESMAN_NAME, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);
