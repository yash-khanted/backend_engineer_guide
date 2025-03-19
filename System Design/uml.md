Unified Modelling language become and ISO standard in 2004. UML helps put ideas into model, or many models. One model chosen for developing software becomes requirment of the design. A design is model of the system to be produced

Design process:
- Problem statement
- Identify objects
- Design classes
- Generate software


UML Model perspective
1. User's view : The first and basic view to construct
   1. use case disgram
2. Structural view: What are the classes/ how are they packaged
   1. Class diagram
   2. Object diagram
3. Behavioural view: When a user interacts with the software, how classed interact
   1. sequence diagram
   2. Collaboration diagram
   3. state chart diagram
   4. activity diagram
4. Implementation view: The way of development
   1. deployment diagram
   2. component diagram
5. Environmental view: How the hardware is related tot he software
   1. deployment diagram


## Usecase modelling
Central model, all other models depend on this stage. Decoding the external behaviour without revealing the internal structure of the system

representation:
1. A usecase represented by ellipse
2. System boundary by rectangle
3. User by stick icons
4. Communication relationship between actor and usecase with a line
5. External system by a adding a stereotype

components:
1. Actor: the users of the system
2. usecase: functionality or services provided by the system
3. Association denoted by solid line
4. Include: if a use case may contain functionality of another usecase as part of their normal processing
5. Extend: one usecase may be userd to extend the behavior of another
6. system boundary: It is used to display usecase as being inside and the actor being outside the system

## Class diagram
the static structure of the code

Components
1. Classes or other objects
2. attributes
3. assocations (inheritance, composition (filled diamond arrow), or aggregation(unfilled diamond arraow))
4. multiplicity or cardinatlity

## sequence diagram
- Shows object interaction arranged in time sequene. Depicts the sequence of messages exchenged between the object to carry out the necessary functionality
- Graphically it is table that shows objects arranged along x-axis and messages ordered in increasing time along y axis

componenets:
1. Object - instance of class participating the interaction
2. lifeline - represents the object's life during the interaction
3. activation - the time an object needs to complete a task
4. create - represensts instantiation of lifeline
5. destroy - request detroyinhg life cycle of target lifeline
6. synchronous call
7. Ashynchronous call
8. self call
9. return message
10. alt - shows the true and false logic flow
11. option - whether the sole operand happens or nothing happens
12. loop

## activity diagram
- Models the dynamic nature of the system by modelling the flow of control from activity to activity.
- An activity represents operation on some class in the system that results in a change in the state of the system
- for modellling workflow or business processes and interal ops

- initail state - the start of an activity
- final state - the end of an activity
- action state - the non interruptible actions of object


## State chart diagram
- Used to model dynamic nature of a system
- They define different stated of an object during its liftime

