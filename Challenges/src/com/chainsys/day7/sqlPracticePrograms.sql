HACKERRANK QUESTIONS
1. Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.
Solution:
SELECT * FROM CITY
WHERE COUNTRYCODE='USA' AND POPULATION > 100000;

2.Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.
Solution:
SELECT NAME FROM CITY
WHERE COUNTRYCODE ='USA' AND POPULATION > 120000;

3.Query all columns (attributes) for every row in the CITY table.
Solution:
SELECT * FROM CITY;

4.Query all columns for a city in CITY with the ID 1661.
Solution:
SELECT * FROM CITY WHERE ID = 1661;

5.Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
Solution:
SELECT * FROM CITY
WHERE COUNTRYCODE='JPN';

6.Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
Solution:
SELECT NAME FROM CITY
WHERE COUNTRYCODE ='JPN';

7.Query the average population for all cities in CITY, rounded down to the nearest integer.
Solution:
SELECT ROUND(AVG(POPULATION))
FROM CITY;

8.Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.
Solution:
SELECT SUM(POPULATION)
FROM CITY
WHERE COUNTRYCODE = 'JPN';

9.Query a count of the number of cities in CITY having a Population larger than 100,000.
Solution:
SELECT COUNT(ID) FROM CITY
WHERE POPULATION > 100000;

10.Query a list of CITY and STATE from the STATION table. The STATION table is described as follows:
Solution:
SELECT CITY, STATE FROM STATION;

11.Query the following two values from the STATION table:

1.The sum of all values in LAT_N rounded to a scale of 2 decimal places.
2.The sum of all values in LONG_W rounded to a scale of 2 decimal places.
Solution:
SELECT ROUND(SUM(LAT_N), 2), ROUND(SUM(LONG_W), 2)
FROM STATION;

12.Query the Name of any student in STUDENTS who scored higher than 75 Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
Solution:
SELECT Name
FROM STUDENTS
WHERE MARKS > 75
ORDER BY RIGHT(NAME, 3) ASC, ID;

13.Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.
Solution:
SELECT name FROM Employee ORDER BY name;

14.Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

Equilateral: It's a triangle with 3 sides of equal length.
Isosceles: It's a triangle with 2 sides of equal length.
Scalene: It's a triangle with 3 sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.

Solution:
SELECT IF(A+B>C AND A+C>B AND B+C>A, IF(A=B AND B=C, 'Equilateral', IF(A=B OR B=C OR A=C, 'Isosceles', 'Scalene')), 'Not A Triangle')
FROM TRIANGLES;

15.Query the number of ocurrences of each occupation in OCCUPATIONS. Sort the occurrences in ascending order, and output them in the following format:

Solution:
SET @r1=0, @r2=0, @r3 =0, @r4=0;
SELECT MIN(Doctor), MIN(Professor), MIN(Singer), MIN(Actor) FROM
(SELECT CASE Occupation WHEN 'Doctor' THEN @r1:=@r1+1
                       WHEN 'Professor' THEN @r2:=@r2+1
                       WHEN 'Singer' THEN @r3:=@r3+1
                       WHEN 'Actor' THEN @r4:=@r4+1 END
       AS RowLine,
       CASE WHEN Occupation = 'Doctor' THEN Name END AS Doctor,
       CASE WHEN Occupation = 'Professor' THEN Name END AS Professor,
       CASE WHEN Occupation = 'Singer' THEN Name END AS Singer,
       CASE WHEN Occupation = 'Actor' THEN Name END AS Actor
       FROM OCCUPATIONS ORDER BY Name) AS t
GROUP BY RowLine;

16.Write a query to find the node type of Binary Tree ordered by the value of the node. Output one of the following for each node:

Root: If node is root node.
Leaf: If node is leaf node.
Inner: If node is neither root nor leaf node.

Solution:
SELECT N,
IF(P IS NULL, 'Root', IF((SELECT COUNT(*) FROM BST WHERE P=B.N)>0, 'Inner', 'Leaf'))
FROM BST AS B ORDER BY N;

17.Given the table schemas below, write a query to print the company_code, founder name, total number of lead managers, total number of senior managers, total number of managers, and total number of employees. Order your output by ascending company_code.

Solution:
SELECT c.company_code, c.founder,
       COUNT(DISTINCT l.lead_manager_code), COUNT(DISTINCT s.senior_manager_code),
       COUNT(DISTINCT m.manager_code), COUNT(DISTINCT e.employee_code)
FROM Company c, Lead_Manager l, Senior_Manager s, Manager m, Employee e
WHERE c.company_code = l.company_code AND
      l.lead_manager_code = s.lead_manager_code AND
      s.senior_manager_code = m.senior_manager_code AND
      m.manager_code = e.manager_code
GROUP BY c.company_code, c.founder ORDER BY c.company_code;

18.Query the average population for all cities in CITY, rounded down to the nearest integer.

Solution:
SELECT ROUND(AVG(POPULATION))
FROM CITY;

19.Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.
Solution:
SELECT SUM(POPULATION)
FROM CITY
WHERE COUNTRYCODE = 'JPN';

20.Query the difference between the maximum and minimum populations in CITY.
Solution:
Query the difference between the maximum and minimum populations in CITY.

21.Write a query calculating the amount of error, and round it up to the next integer.
Solution:
SELECT CEIL(AVG(Salary) - AVG(REPLACE(Salary, '0', '')))
FROM EMPLOYEES;

22.The Employee table containing employee data for a company is described as follows:
where employee_id is an employee's ID number, name is their name, months is the total number of months they've been working for the company, and salary is the their monthly salary.
Solution:
SELECT (months*salary) as earnings, COUNT(*)
FROM Employee
GROUP BY earnings
ORDER BY earnings DESC
LIMIT 1;

23.Write a query to get the names and salaries of employees who earn more than $50,000.

Solution:
SELECT name, salary
FROM employees
WHERE salary > 50000;

24.Write a query to get all employee names and salaries, sorted by salary in descending order.

Solution:
SELECT name, salary
FROM employees
ORDER BY salary DESC;

25.Write a query to find the average salary of employees in the employees table.

Solution:
SELECT AVG(salary) AS average_salary
FROM employees;

26.Write a query to find the number of employees in each department.

Solution:
SELECT department_id, COUNT(*) AS number_of_employees
FROM employees
GROUP BY department_id;

27.Write a query to find the names of employees who earn more than the average salary of all employees.

Solution:
SELECT name
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);


28. Write a query to increase the salary by 10% for employees in department 5.

Solution:
UPDATE employees
SET salary = salary * 1.10
WHERE department_id = 5;


29.Write a query to delete employees who have not been assigned a department.

Solution:
DELETE FROM employees
WHERE department_id IS NULL;

