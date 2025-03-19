- Namespaces provide a hierarchical means of organizing C# programs and libraries.
- It's not necessary or possible to explicitly deallocate objects in C#

Two kinds of types in c# values type and reference type
#### Value Type
- simple types, enum types, struct types, nullable value types, and tuple value types
- a struct is like a lightweight class; it's a stack-allocated type that can implement interfaces but doesn't support inheritance
#### Reference Type
- class types, interface types, array types, and delegate types
- A delegate type represents reference to methods of a specific parameter list and return type

# OOPS
## Encapsulation
The concept of securing state and behavior from uuauthorized access. In C#, classes hold state and behavior behaviour together and secure them with permissions.
- public: Access isn't limited.
- private: Access is limited to this class.
- protected: Access is limited to this class or classes derived from this class.
- internal: Access is limited to the current assembly (.exe or .dll).
- protected internal: Access is limited to this class, classes derived from this class, or classes within the same assembly.
- private protected: Access is limited to this class or classes derived from this type within the same assembly.
## Polymorphism
## Inheritance
A class can inherit from one parent class and can implement any number of interfaces.