# Template Method

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Key Components

- AbstractClass: Defines the template method, which contains the algorithm's skeleton. It also defines abstract methods that must be implemented by subclasses.
- ConcreteClass: Implements the abstract methods defined in the abstract class and may provide specific implementations for some steps of the algorithm.

## Benefits

- Promotes code reuse by defining invariant parts of an algorithm in a base class.
- Simplifies code maintenance by encapsulating common behavior in one place.
- Enhances flexibility by allowing subclasses to override specific steps of an algorithm

## Drawbacks

- Limited Flexibility: The template method may become too rigid if subclasses need to change the algorithm's structure significantly.
- Complexity: The pattern may introduce additional complexity, especially when the number of subclasses grows.
- Maintenance: Changes to the template method may require modifications to all subclasses.

## Use cases

- Algorithms with Fixed Steps: Scenarios where an algorithm has a fixed sequence of steps with some customizable elements (e.g., document generation, cooking recipes).
- Frameworks: Providing a base class with default behavior while allowing users to extend specific methods (e.g., GUI frameworks, game engines).