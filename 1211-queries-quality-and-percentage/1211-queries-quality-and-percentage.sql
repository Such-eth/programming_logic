# Write your MySQL query statement below
select query_name, round(avg(q.rating/q.position),2) as quality,
round(avg(rating<3)*100,2) as poor_query_percentage
from Queries as q
where query_name is not null
group by query_name;