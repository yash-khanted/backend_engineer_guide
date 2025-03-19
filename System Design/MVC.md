# API's
- GET
  - GET example.com/ ---- reqyest for alll products
  - GET example.com/products&id=1
  - GET example.com/users/
  - In GET request payload should not be sent
- POST
  - POST example.com/user/
  - the above endpoint is for adding a user
- PUT
- PATCH
- DELETE
  - DELETE example.com/{PASS THE ID}
  - As best data should not be deleted from the database directly, instead there should be a layer in between that takes backup of data first [Perform soft delete]
  - SOFT DELETE: technique where a flag is placed on deleted data instaed of deleting it permanently.

# MVC
Data transfer objects exist between client and controller, controller and service.

Data Access objects exist between service and databases.
A Java persistence API implemantation converts the database records in to simple POJO's and these are essentually the DAO's.


POJO vs Model
constructor injection vs annotation injection

# Jackson
A java library for processing JSON data.