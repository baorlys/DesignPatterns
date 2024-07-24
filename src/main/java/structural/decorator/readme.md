# Decorator 
**Also known as:** Wrapper.

The Decorator design pattern is a structural pattern used to dynamically add behavior to objects without affecting the behavior of other objects from the same class. It’s particularly useful when you need to add responsibilities to objects in a flexible and reusable manner.

## Key Components

- Component: Defines the interface for objects that can have responsibilities added to them dynamically.
- ConcreteComponent: The base object to which additional responsibilities can be attached.
- Decorator: Maintains a reference to a Component object and defines an interface that conforms to the Component's interface.
- ConcreteDecorator: Adds responsibilities to the component by extending the Decorator class.

## Benefits

- Flexibility: You can add responsibilities to objects at runtime.
- Single Responsibility Principle: You can extend functionality by adding new decorators without changing existing code.
- Open/Closed Principle: Systems are open for extension but closed for modification.

## Drawbacks

- Complexity: The pattern can be complex, especially when you have multiple decorators.
- Order of decorators: The order in which decorators are applied can affect the behavior of the system.

## Use cases

- Extending functionality of classes without modifying existing code.
- Adding responsibilities to objects dynamically.
- Implementing multiple optional behaviors.


