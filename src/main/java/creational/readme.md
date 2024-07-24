# Creational Design Patterns

**Creational Design Patterns** are a category of design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. These patterns abstract the instantiation process, making it more flexible and easier to manage.

Here are some common creational design patterns:

1. [**Singleton**](singleton): Ensures that a class has only one instance and provides a global point of access to it. This pattern is often used for managing shared resources like configuration settings.

2. [**Factory Method**](factory_method): Defines an interface for creating an object but lets subclasses alter the type of objects that will be created. This pattern allows a class to delegate the responsibility of object creation to its subclasses.

3. [**Abstract Factory**](abstract_factory): Provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is used to produce products that belong to a specific family, ensuring that the objects are compatible with each other.

4. [**Builder**](builder): Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. This pattern is useful when an object needs to be created with many optional components.

5. **Prototype**: Creates new objects by copying an existing object (the prototype). This pattern is used when the cost of creating a new instance of an object is more expensive than copying an existing one, or when an object is complex to create.

Each creational pattern offers different ways to control object creation, making it easier to manage complex object creation processes and ensuring that the system remains flexible and maintainable.