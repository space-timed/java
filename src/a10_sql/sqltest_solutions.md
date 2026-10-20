# SQL Practice Questions and Solutions

## Question 1

**Query:** Retrieve FIRST_NAME from the Worker table with the column alias WORKER_NAME.

**Solution:**

```sql
Select FIRST_NAME AS WORKER_NAME from Worker;
```

## Question 2

**Query:** Convert and display all FIRST_NAME values from the Worker table in uppercase.

**Solution:**

```sql
Select upper(FIRST_NAME) from Worker;
```

## Question 3

**Query:** Retrieve all unique department names from the Worker table without duplicates.

**Solution:**

```sql
Select distinct DEPARTMENT from Worker;
```

## Question 4

**Query:** Extract the first 3 characters of FIRST_NAME for all workers.

**Solution:**

```sql
Select substring(FIRST_NAME,1,3) from Worker;
```

## Question 5

**Query:** Find the 1-based character position of the letter 'a' in the first name 'Michael'.

**Solution:**

```sql
SELECT INSTR(FIRST_NAME, 'a') FROM Worker WHERE FIRST_NAME = 'Michael';
```

## Question 6

**Query:** Retrieve FIRST_NAME from the Worker table with all trailing whitespace removed.

**Solution:**

```sql
Select RTRIM(FIRST_NAME) from Worker;
```

## Question 7

**Query:** Retrieve DEPARTMENT from the Worker table with all leading whitespace removed.

**Solution:**

```sql
Select LTRIM(DEPARTMENT) from Worker;
```

## Question 8

**Query:** Retrieve distinct DEPARTMENT names along with the character length of each name, aliased as Department_Length.

**Solution:**

```sql
SELECT DISTINCT DEPARTMENT, LENGTH(DEPARTMENT) AS Department_Length FROM Worker;
```

## Question 9

**Query:** Retrieve FIRST_NAME from the Worker table with all occurrences of lowercase 'a' replaced by uppercase 'A'.

**Solution:**

```sql
Select REPLACE(FIRST_NAME,'a','A') from Worker;
```

## Question 10

**Query:** Concatenate FIRST_NAME and LAST_NAME separated by a space into a single column aliased as COMPLETE_NAME.

**Solution:**

```sql
SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) AS COMPLETE_NAME FROM Worker;
```

## Question 11

**Query:** Retrieve all worker records, sorted alphabetically by FIRST_NAME in ascending order.

**Solution:**

```sql
Select * from Worker order by FIRST_NAME asc;
```

## Question 12

**Query:** Retrieve all worker records sorted by FIRST_NAME in ascending order, and then by DEPARTMENT in descending order.

**Solution:**

```sql
Select * from Worker order by FIRST_NAME asc, DEPARTMENT desc;
```

## Question 13

**Query:** Retrieve all details of workers whose first name is either 'William' or 'Joseph'.

**Solution:**

```sql
SELECT * FROM Worker WHERE FIRST_NAME IN ('William', 'Joseph');
```

## Question 14

**Query:** Retrieve all details of workers whose first name is neither 'William' nor 'Joseph'.

**Solution:**

```sql
SELECT * FROM Worker WHERE FIRST_NAME NOT IN ('William', 'Joseph');
```

## Question 15

**Query:** Retrieve all workers belonging to any department starting with 'Admin'.

**Solution:**

```sql
Select * from Worker where DEPARTMENT like 'Admin%';
```

## Question 16

**Query:** Retrieve all workers whose FIRST_NAME contains the letter 'a' (case-insensitive in standard collation).

**Solution:**

```sql
Select * from Worker where FIRST_NAME like '%a%';
```

## Question 17

**Query:** Retrieve all workers whose FIRST_NAME ends with the letter 'a'.

**Solution:**

```sql
Select * from Worker where FIRST_NAME like '%a';
```

## Question 18

**Query:** Retrieve workers whose FIRST_NAME ends with the letter 'h' and is exactly 6 characters long.

**Solution:**

```sql
Select * from Worker where FIRST_NAME like '_____h' AND LENGTH(FIRST_NAME) = 6;
```

## Question 19

**Query:** Retrieve all workers whose SALARY is between 100,000 and 500,000 (inclusive).

**Solution:**

```sql
Select * from Worker where SALARY between 100000 and 500000;
```

## Question 20

**Query:** Retrieve all workers who joined the company in February 2021.

**Solution:**

```sql
SELECT * FROM Worker WHERE YEAR(JOINING_DATE) = 2021 AND MONTH(JOINING_DATE) = 2;
```

## Question 21

**Query:** Count the total number of employees working in the 'Admin' department.

**Solution:**

```sql
SELECT COUNT(*) FROM Worker WHERE DEPARTMENT = 'Admin';
```

## Question 22

**Query:** Retrieve the full name (aliased as Worker_Name) and salary of workers earning between 50,000 and 100,000.

**Solution:**

```sql
SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) AS Worker_Name, SALARY FROM Worker WHERE SALARY BETWEEN 50000 AND 100000;
```

## Question 23

**Query:** Count the number of workers in each department (aliased as No_Of_Workers), ordered by headcount from highest to lowest.

**Solution:**

```sql
SELECT DEPARTMENT, count(WORKER_ID) No_Of_Workers FROM Worker GROUP BY DEPARTMENT ORDER BY No_Of_Workers DESC;
```

## Question 24

**Query:** Retrieve the first names and designations of all workers who hold the title 'Manager'.

**Solution:**

```sql
SELECT DISTINCT W.FIRST_NAME, T.WORKER_TITLE FROM Worker W INNER JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID AND T.WORKER_TITLE in ('Manager');
```

## Question 25

**Query:** Find duplicate entries in the Title table that share the exact same title name and effective date, along with their occurrence count.

**Solution:**

```sql
SELECT WORKER_TITLE, AFFECTED_FROM, COUNT(*) FROM Title GROUP BY WORKER_TITLE, AFFECTED_FROM HAVING COUNT(*) > 1;
```

## Question 26

**Query:** Retrieve all records from the Worker table that have an odd WORKER_ID.

**Solution:**

```sql
SELECT * FROM Worker WHERE WORKER_ID % 2 <> 0;
```

## Question 27

**Query:** Retrieve all records from the Worker table that have an even WORKER_ID.

**Solution:**

```sql
SELECT * FROM Worker WHERE WORKER_ID % 2 = 0;
```

## Question 28

**Query:** Clone the schema and data from the Worker table into a new table named WorkerClone.

**Solution:**

```sql
DROP TABLE IF EXISTS WorkerClone;
CREATE TABLE WorkerClone AS SELECT * FROM Worker;
```

## Question 29

**Query:** Retrieve intersecting records that exist in both the Worker and WorkerClone tables.

**Solution:**

```sql
SELECT Worker.* FROM Worker INNER JOIN WorkerClone USING (WORKER_ID);
```

## Question 30

**Query:** Retrieve records that exist in the Worker table but do NOT exist in the WorkerClone table (Set Difference).

**Solution:**

```sql
SELECT Worker.* FROM Worker LEFT JOIN WorkerClone USING (WORKER_ID) WHERE WorkerClone.WORKER_ID IS NULL;
```

## Question 31

**Query:** Retrieve the current database server date and timestamp.

**Solution:**

```sql
SELECT NOW();
```

## Question 32

**Query:** Retrieve the top 10 highest-earning employees from the Worker table.

**Solution:**

```sql
SELECT * FROM Worker ORDER BY SALARY DESC LIMIT 10;
```

## Question 33

**Query:** Determine the 5th highest distinct salary from the Worker table.

**Solution:**

```sql
SELECT DISTINCT SALARY
FROM Worker
ORDER BY SALARY DESC
LIMIT 1 OFFSET 4;
```

## Question 34

**Query:** Determine the 5th highest salary from the Worker table without using the LIMIT or TOP keywords.

**Solution:**

```sql
SELECT Salary FROM Worker W1 WHERE 4 = (SELECT COUNT(DISTINCT W2.Salary) FROM Worker W2 WHERE W2.Salary >= W1.Salary);
```

## Question 35

**Query:** Find all pairs of employees who earn the exact same salary.

**Solution:**

```sql
SELECT distinct W.WORKER_ID, W.FIRST_NAME, W.Salary from Worker W, Worker W1 where W.Salary = W1.Salary and W.WORKER_ID != W1.WORKER_ID;
```

## Question 36

**Query:** Retrieve the second-highest salary in the company using a subquery.

**Solution:**

```sql
SELECT max(Salary) from Worker where Salary not in (Select max(Salary) from Worker);
```

## Question 37

**Query:** Display all employees from the 'HR' department duplicated twice in a single result set.

**Solution:**

```sql
SELECT FIRST_NAME, DEPARTMENT from Worker W where W.DEPARTMENT='HR' union all select FIRST_NAME, DEPARTMENT from Worker W1 where W1.DEPARTMENT='HR';
```

## Question 38

**Query:** Retrieve common records between the Worker and WorkerClone tables.

**Solution:**

```sql
SELECT Worker.* FROM Worker INNER JOIN WorkerClone USING (WORKER_ID);
```

## Question 39

**Query:** Retrieve the first 50% of records from the Worker table based on WORKER_ID.

**Solution:**

```sql
SELECT * FROM Worker WHERE WORKER_ID <= (SELECT COUNT(WORKER_ID)/2 FROM Worker);
```

## Question 40

**Query:** List all departments that have fewer than 5 employees, displaying the headcount aliased as 'Number of Workers'.

**Solution:**

```sql
SELECT DEPARTMENT, COUNT(WORKER_ID) as 'Number of Workers' FROM Worker GROUP BY DEPARTMENT HAVING COUNT(WORKER_ID) < 5;
```

## Question 41

**Query:** List all departments along with the total count of workers in each, aliased as 'Number of Workers'.

**Solution:**

```sql
SELECT DEPARTMENT, COUNT(DEPARTMENT) as 'Number of Workers' FROM Worker GROUP BY DEPARTMENT;
```

## Question 42

**Query:** Retrieve the last inserted record from the Worker table (worker with the highest WORKER_ID).

**Solution:**

```sql
Select * from Worker where WORKER_ID = (SELECT max(WORKER_ID) from Worker);
```

## Question 43

**Query:** Retrieve the first record from the Worker table (worker with the lowest WORKER_ID).

**Solution:**

```sql
Select * from Worker where WORKER_ID = (SELECT min(WORKER_ID) from Worker);
```

## Question 44

**Query:** Retrieve the last 5 records from the Worker table.

**Solution:**

```sql
SELECT * FROM Worker ORDER BY WORKER_ID DESC LIMIT 5;
```

## Question 45

**Query:** Find the employee(s) who earn the highest salary in each respective department.

**Solution:**

```sql
SELECT t.DEPARTMENT, t.FIRST_NAME, t.Salary from (SELECT max(Salary) as TotalSalary, DEPARTMENT from Worker group by DEPARTMENT) as TempNew Inner Join Worker t on TempNew.DEPARTMENT = t.DEPARTMENT and TempNew.TotalSalary = t.Salary;
```

## Question 46

**Query:** Retrieve the top 3 highest distinct salaries from the Worker table without using LIMIT.

**Solution:**

```sql
SELECT distinct Salary from Worker a WHERE 3 >= (SELECT count(distinct Salary) from Worker b WHERE a.Salary <= b.Salary) order by a.Salary desc;
```

## Question 47

**Query:** Retrieve the 3 lowest distinct salaries from the Worker table without using LIMIT.

**Solution:**

```sql
SELECT distinct Salary from Worker a WHERE 3 >= (SELECT count(distinct Salary) from Worker b WHERE a.Salary >= b.Salary) order by a.Salary desc;
```

## Question 48

**Query:** Retrieve the 5th highest distinct salary from the Worker table.

**Solution:**

```sql
SELECT DISTINCT SALARY FROM Worker ORDER BY SALARY DESC LIMIT 1 OFFSET 4;
```

## Question 49

**Query:** Calculate the total cumulative salary expenditure for each department.

**Solution:**

```sql
SELECT DEPARTMENT, sum(Salary) from Worker group by DEPARTMENT;
```

## Question 50

**Query:** Retrieve the first name and salary of the worker(s) who earn the overall highest salary.

**Solution:**

```sql
SELECT FIRST_NAME, SALARY from Worker WHERE SALARY=(SELECT max(SALARY) from Worker);
```

## Question 51

**Query:** Calculate annual salary aliased as Annual_Salary (SALARY * 12) and filter workers earning more than 1,000,000 without referencing the SELECT alias in the WHERE clause.

**Solution:**

```sql
SELECT FIRST_NAME, LAST_NAME, SALARY * 12 AS Annual_Salary FROM Worker WHERE (SALARY * 12) > 1000000;
```

## Question 52

**Query:** Calculate the average salary per department for workers who joined in 2021, and display only departments where the average salary is at least 150,000.

**Solution:**

```sql
SELECT DEPARTMENT, AVG(SALARY) AS Avg_Salary FROM Worker WHERE YEAR(JOINING_DATE) = 2021 GROUP BY DEPARTMENT HAVING AVG(SALARY) >= 150000;
```

## Question 53

**Query:** Retrieve the top 2 total compensation earners in 'HR' and 'Admin' who received at least 4,000 in total bonuses, utilizing the complete 8-stage execution pipeline (FROM -> JOIN -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY -> LIMIT).

**Solution:**

```sql
SELECT 
    W.FIRST_NAME,
    W.DEPARTMENT,
    SUM(B.BONUS_AMOUNT) AS Total_Bonus,
    (W.SALARY + SUM(B.BONUS_AMOUNT)) AS Total_Comp
FROM Worker W
INNER JOIN Bonus B ON W.WORKER_ID = B.WORKER_REF_ID
WHERE W.DEPARTMENT IN ('HR', 'Admin')
GROUP BY W.WORKER_ID, W.FIRST_NAME, W.DEPARTMENT, W.SALARY
HAVING SUM(B.BONUS_AMOUNT) >= 4000
ORDER BY Total_Comp DESC
LIMIT 2;
```
