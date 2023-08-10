# Write your MySQL query statement below
SELECT l1.num
    AS 'ConsecutiveNums'
FROM logs l1 CROSS JOIN logs l2 
ON l1.num = l2.num AND l2.id = l1.id+1 

CROSS JOIN logs l3 
ON l1.num = l3.num AND l3.id = l2.id+1 
GROUP BY l1.num
# HAVING l2.id = l1.id+1 AND l3.id = l2.id+1
