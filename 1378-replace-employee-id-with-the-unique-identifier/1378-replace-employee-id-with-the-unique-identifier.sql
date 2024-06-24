# Write your MySQL query statement below
# SELECT orders.id, users.FirstName, users.Surname, products.name as ‘product name’
# FROM orders
# INNER JOIN users on orders.user_id = users.id
# INNER JOIN products on orders.product_id = products.id;

select EmployeeUNI.unique_id, Employees.name 
from Employees
left join EmployeeUNI on Employees.id = EmployeeUNI.id;