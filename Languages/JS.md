# Specification of JS
Variable in JS are stored as values
Functions as references

For every varible undefined is the default value

# Functions
Hoisting:
In complied languages, code execution order is not required as all the function binaries are precompiled and their references are created in the memory. This feature of languages is called hoisting. This feature is also present in JavaScript. As each function identifier holds a reference to the function itself.

## Anonymous functions
A function with no name. These are also called function as an expression
```javascript
//code hoisting will not work incase of anonymous function
add(3, 4)
// return uncaughtReferenceError

//code runs without error, even though the function is declared later
addAsFunction(5, 6)

var add = function(a, b){
    return a + b;
}

function addAsFunction(a, b){
    return a + b;
}
```
# Objects
In JS, objects are the unordered collection of key-value pairs, which are called as properties. An object is a collection of properties.

A property can be of simple name and value pair, but if the value holds the refrence to the function then that property will be called method

In js, we can create objects without declaring a class. This is done by JSON (javascript object notation)

```javascript
const person = {
    name: "yash",
    age: 24,
    profession: "developer",
    address: {
        city: "nellore",
        state: "AP"
    },

    print: function(){
                console.log(this.name + 
                    person["age"] + 
                    person.address.city + 
                    person.address.state)
            }
}

person.print()
//Output: yash24nelloreAP
```


An object is consumed in two ways,
1. Dot notaion
2. Bracket notation

# Conditionals
if, else-if, nested if else
```javascript
var myScore = 92;

if(myScore >= 92){
    if(myScore > 95){
        console.log("A grand party with gifts");

    console.log("A bicycle as gift");
    }
}
else if(myScore >= 80){
    console.log("A new book as gift");
}
else{
    console.log("Only motivation")
}
```

# Iterative statements
Basic while and do while execution of code inside the while block happens only if the condition is true

An example JS object:
```javascript
var colors = {
    primary: "Blue",
    Secondary: "Red",
    tertiary: "Green"
}
```

## for - in loop
```JavaScript
for(var color in colors){
    //when we use the in keyword, we access only the keys of the object
    console.log(colors[color]);
}
/*
Output:
Blue
Red
Green
*/
```

## for - of loop
Use of of keyword ensures the loop to run iterable object. The compiler run the loop on array of the values of the object
```javascript
for(var color of colors){
    // color varble holds the key values of the colors object
    console.log(color)
}
```

## Entries method
For accessing both key and value at the same time in for we use function called entries

```javascript
for(var [order, color] of Object.entries(colors)){
    console.log(order + "->" + color)
}

/*
output:
1->Blue
2->Red
3->Green
*/
```

# Arrays
