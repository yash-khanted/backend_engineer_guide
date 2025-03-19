
# Guidelines
General guidelines/steps for clearing an low level design interview, also known as machine coding round.

## 1. Overview
Every problem needs to understood in broad point of view first, only then the system can be imagined. Here, converse with interviewer about the functionalities of the application.
Giving out minute details like memory, time complexity and platform are not the goal.
- **scenario 1**:
  - if you know about the question well
  - ask about persisting data
  - whether only entities are to be desgined or the whole system is to be build
  - what interface is to be used api, CLI or else
  - The given application has a vast system, what feature are you requesting to build?
- **scenario 2**:
  - if you do not know what is asked
  - persist on asking what all working are around
  - what will all the enties be

entites will cover everything except the interaction btween the entities,
management system will cover both

1. Requirements gathering
    - be suggestive about the requirements with the interviewer. Ask for some and explain your visualization
    - be precise in asking every edge case
2. UML diagrams
    - class - entity diagram
    - schema design
      - For representing inheritance, you need to put all the base class properties in one table and all the specific child class have each one table
    - and more
3. Code
   - Create the models package and create entity classes, extend all entities to a BaseModel class
   - Note down all the behaviour of the application. These will be part of the controllers
   - **CONTROLLERS**
     - find out which model is used for the CRUD operation/behavior.
     - Create the controller class for that model class, then create the method for that usecase

Programming Practices
- Meaning full varaible names that help readability of the code
- Liberal use of comments that help the user to understand
- If the code is itself readable then do not use comments
- keep your code KISS 
- also use indentation

## Coupling and Cohesion
MOdules are designed to have less coupling and high cohesion

Coupling in modules means that dependence of one module on one or many modules. It is favaourable that a module has limited coupling that it is less dependent on other modules.

Cohesion is the is the inter relationships among the module classes. It is favourable that there are many relationships among classes of a module

Coupling is relationships between modules, Cohesion is relationships among modules.

Coupling is the degree of interaction between modules. There are tightly, loosed and uncoupled levels

Types of coupling: The level keeps decreasing as we go down (tightly coupled to uncoupled)
1. Content coupling
   1. Occurs when one component modifies and internal data item in another component. Data hiding prevents this
2. common coupling
   1. Tw modules have write access to the common global data
3. control coupling
   1. One module passes an element of control to the other only then it start to work
4. stamp coupling
   1. A whole data structure is passed but the module uses only part of it
5. Data coupling
   1. Every argument is simple argument or a data structure. However all the DS content is used

Cohesion
It refers to the dependence within and among a module's internal elements

Types: Cohesion keeps geeting good as we go down
1. Coincidental
   1. modules peforms completwly unrelated actions
2. logical
   1. elements perform similar tasks and activities to be executed are chosen outside of the module
3. Temporal
   1. Data and functionss are related because they are used at the same time in an execution.
4. Procedural
   1. similar to temporal, and funcions pertain to some related action ot purpose
5. Communication
   1. modules which have activites executed sequentially and work on same data
6. Sequential
   1. activities perform such that o/p of one activity becomes i/p of the next activity
7. Functional
   1. modules performs exactly one action