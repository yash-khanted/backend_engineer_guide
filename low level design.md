
# Guidelines
General guidelines/steps for clearing an low level design interview, also known as machine coding round.

## 1. Overview
Every problem needs to understood in broad point of view first, only then the system can be imagined. Here, converse with interviewer about the functionalities of the application.
Giving out minute details like memory, time complexity and platform are not the goal.
- **scenario 1**:
  - if you know about the question well
  - ask about persisting data
  - whether only entities are to be desgined
  - what interface is to be used api, CLI or else
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