# Write your MySQL query statement below
select r.contest_id, round((count(r.contest_id)/((select count(user_id) from Users)))*100,2) as percentage
from Register as r 
group by r.contest_id
order by percentage desc, r.contest_id;