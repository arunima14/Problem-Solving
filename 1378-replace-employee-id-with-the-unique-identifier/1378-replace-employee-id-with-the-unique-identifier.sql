# Write your MySQL query statement below
# select employeeUNI.unique_id, name
# from employees, employeeUNI
# where employees.id in (employeeUNI.id) and
# set employeeUNI.unique_id is null if employees.id not in (employeeUNI.id)

select eu.unique_id, e.name from Employees as e LEFT JOIN EmployeeUNI as eu on e.id = eu.id;