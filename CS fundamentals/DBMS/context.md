# Content
- Introduction
  - Need for DBMS
  - Features of DBMS over File based system
  - Types of DBMS
  - Relational DB terminology
- Schema Design
  - What is schema
  - Level of abstraction
  - SQL Datatypes
  - Process of Schema Design
  - ACID property / DB normalization
  - Keys
  - Database Indexing
- Database objects
  - Table
  - View
  - Index
  - Sequence
  - Synonym
- SQL
  - Data definition commands
    - CREATE, ALTER, TRUNCATE, DROP, CONSTRAINT
  - Data manipulation commands
    - UPDATE, DELETE, MODIFY, SELECT
    - Joins
    - Subqueries
  - Data control commands
    - GRANT, REVOKE
  - Transactional Control commands
    - COMMIT, ROLLBACK
  
# Data
Data is a raw form of information. It needs to processed, stored and analyzed for infering results.

Persistent storage of information can be done in many ways
1. File based system
   1. Our computers store files in memory in this format
   2. Here information is stored in flat files and these file are managed by a file system.
   3. sorting, processing and filtering data is not a simple task.
   4. Data retrieval is also difficult as there is index of storage.
   5. data redundancy and isolation is a very easy.
2. Database management system
   1. For structured storage of atomic data. we use database management system
# Introduction to DBMS
Database is a shared collection of logically related data, designed to meet the needs of organisation

DB should have ACID property (Atomicity, Consistency, Integrity and Durability)

Database management system is defined as the computer program for fast, secure, efficient storage and retrieval of data. 

Data model is away of explaining the logical layout of the data and the relationship of various parts of each other on the whole
There are three types
1. Hierarchical
   1. A tree structure model
2. network
   1. A graph structure model
3. relational
   1. data in tabular format
   2. every table is called a relation
   3. It works on the mathematical foundation of relational algebra (sets, relation etc)

There are many type of DBMS.
1. File DBMS (As discused above)
2. Relational DBMS
    - The database for storing related data.
    - Rows are called tuples
    - columns are called attributes
    - There are multpile relations (tables) in each database
3. Non relational DBMS

Advantages over File system
1. centralization of information management
2. Data shared by different group of users and application programs
3. representation of complex relationships between data
4. Integrity contraint handling
5. Advanced facility for backup and recovery
6. quick sharing of data
7. security and maintanace standards enforcement
8. data redundancy protection
9. data independence

# Schema Design
It the pictorial representation of entities, attributes and relations among the entties of a database.
Netflix schema

## entities
user
profiles
videos

# SQL
1. it is not case sensitive
2. used to for data update and retrieve
3. Is an ANSI standard language
4. Use pascal notation (first letter capital of every word)
5. nouns for column name
6. each table must have a primary key
7. Uppercase for sql keywords
8. do not use whitespace in idenfiers
9. use parentheses, indenetation for readabitlty
10. Use ANSI joins instead of old joins
11. do not use * in select statements
12. always use table aliases
13. do not use column number in order by clause
14. alway s use a columnm list in insert statements


## Data definition statements
### create

### Sql DAta types
### Constraints
These are rules enforced on a data columns. They limit the type of data that can go into a the columns. Helps ensuring accuracy and reliability of the database

1. primary key
2. foreign key
3. unique
4. not null
5. check

## Data manipulation statements
## Transactional control statements
## data control statements
## Data query statement
Select is used for querying tuples from a database
Examples:

SELECT * FROM countries;
//prints out all the attribute in the countries table

SELECT name, population FROM countries;
//prints only name and population attributes of all records

## WHERE clause
This clause is used to select only those records that match the specified condition on attributes.

SELECT * FROM countries
WHERE population > 10000000;
//prints all the countries that have population greater than 10000000

< (less than), = (is equal to) - These two mathematical operation can also be used for numerical values

When comparing strings, use the following clauses
### LIKE clause

SELECT name FROM countries
WHERE name LIKE 'a%';
//Prints the name of all the countries that start with 'a' character

SELECT name FROM countries
WHERE name LIKE '%a%a%a%';
//prints coutries that have 3 a's in their name like bahamas, saudi arabia etc...

SELECT name FROM countries
WHERE name LIKE '%o_o%';
//prints countries that includes name with 2 o's seperated by one character like colombia etc...

%______is a multi character wildcard symbol
_ (underscore) is a single character wildcard symbol
# Database Objects

## View
It is a virtual table that provides a window through which one can see data, contains no data of their own but can be operated on as real relations. Simplifies data access. 

To create a view use CREATE VIEW table_name AS (select query)clause

Types
- Simple view - derives data from only one table
- Complex view - from many tables
- 
## Index
created for faster data retrieval. Reduce disk I/O by using a rapid path access method to locate data quickly.

Database index is a hidden tree data structure that stores the column of a data in an ordered fashion, so that the count of read operations is minimized for a search query.

Index should be created if:
- A column contains a wider range of values
- A column contains a large number of null values
- One or more columns are frequently used together in a WHERE clause or a JOIN condition
- The table is large

Types:
1. Clustered Index - applied for integer type values
2. Non clustered index - applied for non-integer type values
3. Unique index - This does not allow duplicate values
4. Function based index

```sql
CREATE NONCLUSTERED INDEX idx_customerId
ON customer(customer_id);
```
## Sequence
A schema object that genarates unique sequential values automatically. These values are often used for primary keys.
# SQL
## Data Manipulation commands
### SELECT
Used to retrieve data from one or more tables in a database. Also from the views.

**syntax:**\
SELECT columns_list\
FROM tables_list\
WHERE conditions\
GROUP BY column_name HAVING group_conditions \
ORDER BY columns_name ASC/DESC

1. DISTINCT select distinct feilds
2. COALESCE - Returns the first not null expression in the expression list
3. NVL function - converts a null to an actual value

```sql
SELECT *
FROM customer;

SELECT DISTINCT id, product_name, product_description, price
FROM product
WHERE product_availability > 0;
```

Operators that can be used in WHERE clause are =, <, >, <>(not equal), <=, >=
Some other function like operators are AND, OR, BETWEEN, LIKE, IN, IS, IS NOT.
Widcard characters in LIKE expressions are
- % assumes on or more characters.
- _ assumes only one character.
- [bsp]% assumes one or more characters that of b, s or p.
- [a-f]_ assumes one character between a and f.

```sql
SELECT *
FROM customer
WHERE country IN ('INDIA', 'CHINA', 'RUSSIA');

SELECT first_name, last_name
FROM customer
WHERE first_name LIKE 'S___%S';
--starts and ends with s and has atleast 6 characters--
```

### Aggregates or Group functions
GROUP BY clause splits the result set into groups of values. The HAVING clause is used to provide the condition for splitting.

An aggregate function like max, min, sum, avg, count operates on the entire set of rows and gives out a single result.

```sql

```
### Joins
A query that combines records from two or more tables. Works when there is JOIN clause after the FROM clause in the SELECT statement.
- Cross join: Also called cartesian join, formed when there is a join for each row of one table to every row of another table.
- Natural join: Compares the common columns of both the tables with each other.
  
Types of joins
1. Equi join
   - Also called simple joins or inner joins
   - Joined with "=" operator
2. Non equi JOin
   - joined without the "=" operator
3. Outer join
   - Returns rows from one table or both tables even if there is no matching column
   - Types:
     - Left outer join - returns all rows from the left, with matching rows from the right
     - Right outer join - vice versa
     - Full outer join - All row from the left and right table
4. Self join - table is joined with itself

USING clause specifies which columns to test for equality when the tables are joined. For joining N tables there should be N-1 join conditions

### Subquery
A subquery is a SELECT statement that is embedded in a clause of another SQL select statement. It is also called inner query or inner select. The statement containing the inner query is called outer query or outer select.

They can be useful for selecting rows from a table with condition that depends on the same or different table

Subquery can be placed in WHERE, HAVING, or FROM clauses.

## Transaction control commands
### what is a transaction?
Very small logical unit of work and it may contain several low level tasks ot performed in a order. A transaction must ensure data integrity.

Transaction should make a consistent data change by ending with either rollback or commit. DDL commands are by default auto commit transactions.

1. COMMIT - Ends the current transaction by making all pending data changes permanent.
2. SAVE POINT - Makes a savepoint within the current transaction
3. ROLLBACK - ends the current transaction by discarding all the current data changes
4. ROLLBACK $svepoint_name - revert the data changes back to the savepoint

### Locking
- Prevent destructive interaction between concurrent transactions when accessing shared resources
- Locing performed automatically in oracle DB and held till the duration of a transaction, i.e, untill the rollback or commit is issued.
- Helps maintain data consistent and add concurrency feature to application
- Two types
  - Explicit locking
  - Implicit locking