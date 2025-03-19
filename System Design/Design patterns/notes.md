# Design Patterns
Some common principles for solving commonly occuring problems. These do not guarantee 100 percent reliable and accurate results.

Important patterns
1. factory and abstract factory
2. singleton
3. observer
4. builder
5. decorator
6. adapter
7. strategy
8. facade


## Creational patterns
### Singleton pattern
#### Motivation: 
  When there is a requirement for object to be used in many places in the code, then it is better to have only a single instance of the object and share it
#### Implementation steps:
-Hide the constructor
- Create a static public method that calls the private constructor.
- Have a static variable reference to a single instance of the class.
#### Code
```java
public class Pencil{
    private int grade;
    private String brand;
    //2. Declaring a static vraible to store instance addresss
    public static Pencil _instance = null;

    //1. Hiding the constructor
    private Pencil(){}

    private Pencil(int grade, String brand){
        this.grade = grade;
        this.brand = brand;
    }

    //3. A method for creating and passing an instance
    public synchronized Pencil getInstance(int grade, String brand){
        if(this._instance == null){
            _instance = new Pencil(grade, brand);
        }

        return _instance;
    }
}
``` 
### Builder pattern
#### Motivation: 
For example, if you have a class that takes a large number of arguments and have long constructor, also you do not want to pass each argument for every object then use this pattern
    - Implementation steps:
        - Hide the constructor
        - create inner class that has all the class variables. As java requires inner class has to static
        - create setter to call and set values to parameters of inner class
        - to ensure method chaining, pass the same class object in the setter method.
        - code a build method that builds the object with values set
1. Prototype pattern
    - Motivation: In many scenarios it is required to have copies of multiple objects, whose properties can be different a little
    - Implementation Steps:
      - Create a IClonable interface, with clone method
      - implement the interface and return the a object with all the class varibles copied 
2. Registry pattern
   - Motivation: Here, all the objects are stored in a class object, which kind of acts like a register for all the objects
   - Implementation steps:
     - create a registry class, with hashmap variable
     - create method for register, retrive and unregister

3. Factory pattern
   - Motivation: 

## Structural patterns
1. Adapter pattern
2. Facade pattern
3. Decorator pattern
4. Flyweight pattern


## DI Pattern
Transient: Transient lifetime services are created each time they're requested from the service container. This lifetime works best for lightweight, stateless services.
Scoped: For web applications, a scoped lifetime indicates that services are created once per client request (connection).
SIngeton: Singleton lifetime services are created either:

- The first time they're requested.
- By the developer, when providing an implementation instance directly to the container. This approach is rarely needed.

Every subsequent request of the service implementation from the dependency injection container uses the same instance. If the app requires singleton behavior, allow the service container to manage the service's lifetime. Don't implement the singleton design pattern and provide code to dispose of the singleton. Services should never be disposed by code that resolved the service from the container. If a type or factory is registered as a singleton, the container disposes the singleton automatically