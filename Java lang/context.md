# Feature of Java
Java developed at sun microsystems. Best contibutor James Gosling. It is a high level programming language meaning could be understood by humans. features of java
- Simple : java programs are simple english like text
- Object Oriented :
- Architecture Neutral
- Portable
- Distributed
- High performance
- Multithreaded
- Robust
- Dynamic
- Secure

# Datatypes
- Every variable in java must be declared with a type before implementing it.
- A declared variable must be assigned a value before using it.
- Java is statically typed language as the datatype of a variable do not change at execution\
- Data type are od two types:
### Primitive type
- #### Numeric
    - ##### integer type
        - byte (1B)
        - short (2B)
        - int (4B) default
        - long (8B)
    - ##### floating point type
        - double (8B) default | double precision type
        - float (4B) default | single precision type
- #### Non-numeric
    - ##### char
    - ##### boolean
### Non primitive type
- string
- Arrays
- user-defined

## *points to remember:*
1. while assigning a value to integer type the compiler will by default consider every constant as an int type. In the below case if D is not added post the number then the compiler will throw **RuntimeException** saying integer value is too large.

2. Similarly this goes for float, as compiler takes every value as double type. This time the compiler throws **RuntimeException** saying possible lossy conversion from double to float.
```
double value = 2342135432320D;
float pointValue = 123113.234f;
```
3. For representing scientific notation use E value instead of power of 10.
```
double lightSpeed = 3E8;
double mole = 6.023e-23;
```
4. For better readability of large number use _ for separting them at the hundredth, thousands and so on.
```
double myWealth = 234_324_134_241_242_334d;
```
## TypeCasting
Changing the datatype of one variable to another is called typecasting. It is only possible with primitive types.
1. Widening typecasting : COnverting from small size types to large size types. Compiler handle automatically. It is also called implicit typecasting.
```
int smallSize = 2345
double largeSize = smallSize;

float singlePrecision = 21.2343f
double doublePrecision = singlePrecision;
```
2. Narrowing typecasting : converting from large size types to small size types. There is possiblilty of lossy conversion.
```
short largeSize = 128;
byte smallSize = (byte) largeSize; \\prints -128

//Since the range of byte is till 127, then the value stored in smallSize is -128. This depicts that a datatype is cyclic over its range. As the number 128 is represented as 127 + 1 --> -128
for 129 it will be 127 + 2 --> -127
```

# Operators
## Arithematic operators
1. \+ (addition)
2. \- (subraction) 
3. \* (multiplication)
4. / (integer division) if both dividend and divisor are of integer type. Otherwise normal division if any one of dividend and divisor or both are of floating point type.
5. ^ power operatort
6. % Modulo Operator
7. ++ Increment operator
8. -- decrement operator
## Relational Operator
==, <=, <, >, >=, !=
## Logical Operators

# Input/Output
Stream in java help in performing i/o operations efficiently. A stream is a data source from which data can be retreived and returned without figuring out about the underlying operations. A application just needs to use the stream, the underlying code manages how it is stored and retrieved efficiently.

## Scanner
Scanner is a class in java.util package. The scanner is constructed by passing a inputStream like System.in.
It has read methods like next, nextInt, nextShort, nextLong, nextLine etc.
```
import java.util.Scanner;

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
}
```
## BufferedReader
This a class in java.io package. The main advantage is that we can read and write to a single stream with this class object.
The BufferedReader object is constructed by passing a Reader object.

```
import java.io.BufferedReader;
import java.io.Reader;

public static void main(String[] args){
    Reader reader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(reader);
}
```

# OOPS
Objects are created by reference.

Three pillars of OOPS are 
- encapsulation
- Inheritance
- Polymorphism

Abstraction is the Principle of OOPS. 


Encapsulation in java is possible because of access modifiers. There are four type
- public
- private
- protected
- default