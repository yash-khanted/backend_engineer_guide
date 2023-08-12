# Features
1. statically typed, Object oriented
2. null safe

# Operators
1. Perform +, -, * and / division operations
2. also have corresponding methods for performing operations like a.plus(b) = a + b, minus(), multiply(), divide()
3. ?: elvis operator
4. 1/3 return 0 but 1.0/2.0 return 0.5

## is operator
**is** is used in kotlin to check the type of a variable

```kotlin
if("String" is String){
    print("This is a string")
}

val x = 10
if(x !is String){
    print(It is a number dummy")
}
```

## as operator
**as** is called a cast operator as it is used for casting a variable. There two methods of casting unsafe and safe(nullable) cast

```kotlin
//unsafe cast
val x: String = y as String
//here if y is null then it will throw an exception

//safe cast
val x: String? = y as? String
//there will be no exception if y is null. Null is returned simply
```

# Variables
Kotlin supports two types of varible declaration, changeable and unchangeable.
```kotlin
//cannot change a val variable's value
val canstant: int = 10
//can change a var variable's value
var value: int = 10
```
All primitive types are essentially object of the class Number, Which is essentially a type of wrapper for the primitive types
```kotlin
var pi: Nummber = 3.141526
//type of var is Number
pi.toDouble()
//it can be boxed as double as shown above
```
When a variable is declared but not initialized with a value then type assignment is mandatory
```kotlin
val unassignedVal: Int
unassignedVal = 10
```
## Null safety
By default all variable assigned cannot store a null object, however to represent a variable that can get a null value we use ? operator
```kotlin
var data: String = null
//the above line throws nullpointerexception
var greet: String? = null
greet = "Hello yash"
// greet can store null value and a string
```

# Basic Syntax
```kotlin
package demo.kotlin

import kotlin.text.*

fun main(args: Array<String>){
    //entry point of the a kotlin program
    //can be with or witout arguments
    println(args.ContenttoString())
}

//keyword fun is used for function
//function with two integer arguments and one integer return type
fun Sum(val1: Int, val2: Int): Int {
    return val1 + val2
}

//here return type of the function will be inferred by the compiler
fun Sum(val1: Int, val2: Int) = val1 + val2

//for functions returning nothing can have Unit as the return type or simply use or do not use return keyword
fun Sum(val1: Int, val2: Int): Unit{
    print(val1 + val2)
}
// or
fun Sum(val1: Int, val2: Int){
    print(val1 + val2)
    return
}
```
## classes and instances
classes are decalared final bby default
```kotlin
package demo.kotlin.class

//keyword to declare class
class basic{
/* 
Properties of a class can be declared inside the body or along with class declaration
*/
}
```

## Conditionals
In kotlin, **if** is an expression, which returns a value. Thus there is no ternary operator x ? a : b
```kotlin
//as expression
var max = if(a > b) a else b
var min = if(a < b && a < c) a else if(b < c) b else c
//else statement is mandatory when if is used as an expression

//as a conditional
val ordinary = 10
if(ordinary is Int){
    print(ordinary.toString())
}
else{
    print(ordinary)
}
```

## Flow controls
For loop
```kotlin
Data: Array<String>
for(data: String in Data){
    print(data)
}
```

The switch case statement in kotlin
When
```kotlin
when(obj: Any){
    
}
```
# Data structure
## Array
Array in kotlin is an object of array class. To create an array use arrayOf() method with comma seperated elements. Also another method is to specify the function for creating the array of a spectifed size.

Arrays in kotlin are invariant. You cannot assign Array\<String\> to a variable declared as type Array\<Any\>

creating an array in kolin
```kotlin
var arr = Array<Int>(5){2 * it}
//arr: {0, 2, 4, 6, 8}
//it represents the index of the array

var arr1 = arrayOf(11, 12, 13, 14, 15)
//arr1: {11, 12, 13, 14, 15}

//Kotlin supports primitive arrays for int, byte, double etc...
var arr2 = intArrayOf(5) {21}
//arrr3: {22, 22, 22, 22, 22}
//Default value is 0


```