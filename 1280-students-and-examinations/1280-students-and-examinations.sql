# Write your MySQL query statement below
# select *
# from students as s
# join subjects as s1 join Examinations as e on s1.subject_name=e.subject_name 
# on s.student_id=e.student_id;

select s.student_id, s.student_name, s1.subject_name, count(e.student_id) as attended_exams
from students as s
cross join Subjects as s1
left join Examinations as e on e.student_id=s.student_id and e.subject_name=s1.subject_name
group by s.student_id,s.student_name,s1.subject_name
order by s.student_id,s1.subject_name