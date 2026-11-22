# Write your MySQL query statement below
Select MAX(salary) as SecondHighestSalary from (Select Salary, Dense_rank() over (order by salary desc) as rnk from employee) ranked where rnk=2;