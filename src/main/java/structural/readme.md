# Structure Design Patterns

The **Structural Design Pattern** is a category of design patterns that focus on how classes and objects are composed to form larger structures. The goal is to simplify the design by defining simple ways to create complex structures. Structural patterns help ensure that if one part of a system changes, the entire system doesn't need to change.

Here are some common structural design patterns:

1. [**Adapter (or Wrapper)**](adapter): Allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting one interface into another that the client expects.

2. **Bridge**: Separates abstraction from implementation, allowing both to evolve independently. It involves an interface (abstraction) and a concrete implementation that can be changed independently.

3. **Composite**: Lets you compose objects into tree-like structures to represent part-whole hierarchies. It allows you to treat individual objects and compositions of objects uniformly.

4. [**Decorator**](decorator): Adds new functionality to objects dynamically without altering their structure. It provides a flexible alternative to subclassing for extending functionality.

5. **Facade**: Provides a simplified interface to a complex subsystem, making it easier to use. It encapsulates a set of interfaces in a subsystem and provides a unified interface to interact with it.

6. **Flyweight**: Reduces the cost of creating and managing a large number of similar objects by sharing as many data as possible. It's useful when dealing with a large number of fine-grained objects.

7. **Proxy**: Provides a surrogate or placeholder for another object to control access to it. It can be used for various purposes, such as lazy initialization, access control, or logging.

Each of these patterns addresses a different aspect of structuring code and relationships between objects, making it easier to manage and extend the system.