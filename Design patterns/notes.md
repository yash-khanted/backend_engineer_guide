# Design Patterns
Some common principles for solving commonly occuring problems. These do not guarantee 100 percent reliable and accurate results.

## Creational patterns
1. Singleton pattern
    - Motivation: When there is a requirement for object to be used in many places in the code, then it is better to have only a single instance of the object and share it
    - Implementation steps:
        - Hide the constructor
        - Create a static public method that calls the private constructor.
        - Have a static variable reference to a single instance of the class. 
2. Builder pattern
    - Motivation: For example, if you have a class that takes a large number of arguments and have long constructor, also you do not want to pass each argument for every object then use this pattern
    - Implementation steps:
        - Hide the constructor
        - create inner class that has all the class variables. As java requires inner class has to static
        - create setter to call and set values to parameters of inner class
        - to ensure method chaining, pass the same class object in the setter method.
        - code a build method that builds the object with values set
3. Prototype pattern
    - Motivation: In many scenarios it is required to have copies of multiple objects, whose properties can be different a little
    - Implementation Steps:
      - Create a IClonable interface, with clone method
      - implement the interface and return the a object with all the class varibles copied 
4. Registry pattern
   - Motivation: Here, all the objects are stored in a class object, which kind of acts like a register for all the objects
   - Implementation steps:
     - create a registry class, with hashmap variable
     - create method for register, retrive and unregister

5. Factory pattern
   - Motivation: 

## Structural patterns
1. Adapter pattern
2. Facade pattern
3. Decorator pattern
4. Flyweight pattern