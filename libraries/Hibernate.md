# Hibernate
A object relational mapper for java applications. A open source tool for querying data with a database. Hibernate is the implementation of Jakarta persistence API.

An Entitiy in an application denotes a state of a real world object. A car can be represented in a software as an entity with specific properties. It must have a no arguments constructor and a primary key field.

## Architecture


## Domain Model
Describing the problem domain These are also called as the persistent class. They are defined as a plain POJO or can follow java bean programming model

Each instance of the domain model class will represent a record in the database. They can be represented as the trees of java.util.Map class.

These are classes that are mapped to the database through XML or annotations. Every object of these class represent an active record of the database.

It is important that the database types are compatible with the model class attribute's datatype. That is why there are some types hibernate defines specifically that acts as a medium.

### The Hibernate type
These classes are implementations of the ```org.hibernate.type.Type``` interface.

It provides info about mapping java type to the sql type as well as how to persist and fetch the given java type to and from RDB.

There are two categories
1. Value types (persistent attributes)
   1. These type holds such data that does not have their own lifecycle. They can cannot exist independently.
   2. There are three value types
      1. basic type
      2. Embeddable type
      3. Collection type
2. Entity types
   1. These are one that can exist independently.
   2. These are made entirely of the value types
   3. Instance of each entity type domain model correlates a table in the database.
----------

| Annoation | Description | Extra information |
| --- | --- | --- |
| @Basic    |  It defines the basic types of the java. It canbe ignored as it is assigned to every field by default.|- **optional** specifies if the type can hold null values, - **Fetch** property defines the method of loading data from database, bey default the value is EAGER. It can also be menttion |
| @Column  | specifies the column name of the table | - name property to specify column name of the attribute in DB| 
| @Formula | It helps in creating a virtual column based on expression. For example interest column| - value, here specify a native SQL statement for calculation|
|@Enumerated| Use to store enum objects | enumType property can be ORDINAL or STRING specifying the storage practice in database as integer or string |
|@Converter | marks a class that handle the convertion process. The class should implement AttributeConverter<T, T> interface| converter property need to specified with converter class name |
|@ID| Specifying the id attribute of a table|
|@GeneratedValue|It has four strategies AUTO, TABLE, SEQUENCE, IDENTITY|
|@ElementCollection||


## BASIC type
There are several different predefined basic types defined in hibernate.
| categories | java type | jdbc type/ Sql type |
| --- | --- | ---|
|primitives| int, bool, etc | |


## How mapping in hibernate works
Hibernate understands the few things about the mapping first
- The capabilities of the java type
  - how it compares values
  - calculates hashcodes
  - coerce values of current type to other type
- the JDBC type to use
- Any conversion to be performed on the value to or from the DB
- Mutability of the value whether the internal state can change or not

After this hibernate's implicit basuc type resolution runs series of checks to determin the appropriate mapping to use

Only drawback is to map value to the recommended java type.
One of the worst case, if java type is serializable then hibernate will try to handle it's binary form

If a user want to tell hibernate explicitly which jdbcjavaType to use or java type to use then use the @Type annotation

Also for the above line you have to create a cutom type, that can be done in two ways
1. Compositional basic mapping (combination of two or more mappings)
2. userType contract