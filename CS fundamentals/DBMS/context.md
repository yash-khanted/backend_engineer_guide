# Introduction to DBMS
DBMS stands for database management system. It is defined as the computer program for fast, secure, efficient storage and retrieval of data. There are many type of DBMS.
1. File DBMS
2. Relational DBMS
    - The database for storing related data.
    - Rows are called tuples
    - columns are called attributes
    - There are multpile relations (tables) in each database
3. Non relational DBMS

# Schema Design
It the pictorial representation of entities, attributes and relations among the entties of a database.
Netflix schema

## entities
user
profiles
videos

# DQL statement
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