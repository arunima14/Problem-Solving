# Write your MySQL query statement below
SELECT w2.id 
FROM Weather w1 INNER JOIN Weather w2
ON w1.recordDate = w2.recordDate - INTERVAL 1 day
WHERE w2.temperature > w1.temperature