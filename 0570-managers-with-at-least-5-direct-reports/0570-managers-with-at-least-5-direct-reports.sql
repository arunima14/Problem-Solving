# Write your MySQL query statement below
SELECT e1.name
FROM Employee e1 CROSS JOIN Employee e2
ON e1.id != e2.id
AND e2.managerId = e1.id
GROUP BY e2.managerId
HAVING COUNT(e2.managerId) >= 5

