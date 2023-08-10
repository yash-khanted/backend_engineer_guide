# Features
1. statically typed, Object oriented
2. null safe

# Operators
1. Perform +, -, * and / division operations
2. also have corresponding methods for performing operations like a.plus(b) = a + b, minus(), multiply(), divide()
3. ?: elvis operator
4. 1/3 return 0 but 1.0/2.0 return 0.5

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
```kotlin
if(){

}
else{

}
```

## Flow controls
For loop
```kotlin
Data: Array<String>
for(data: String in Data){
    print(data)
}```

When
```kotlin
when(obj: Any){
    
}```