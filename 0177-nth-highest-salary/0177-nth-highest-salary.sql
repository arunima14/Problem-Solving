CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT(salary) AS getNthHighestSalary
      FROM Employee AS e1
      WHERE N = (
          SELECT COUNT(DISTINCT(salary))
          FROM Employee AS e2
          WHERE e1.salary <= e2.salary
      )      
  );
END