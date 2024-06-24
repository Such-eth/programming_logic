# Write your MySQL query statement below
select a1.name,a2.bonus
from Employee as a1
left join Bonus as a2 on a1.empId=a2.empId where a2.bonus<1000 or a2.bonus is null;