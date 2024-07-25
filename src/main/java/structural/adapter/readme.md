# Adapter 

**Also known as:** Wrapper

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

## Key Components

- Target: The interface that the client expects and interacts with.
- Adapter: Implements the Target interface and translates requests from the client into calls to the Adaptee.
- Adaptee: The class with an incompatible interface that needs to be adapted to the Target interface.

## Benefits

- Compatibility: Allows classes with incompatible interfaces to work together without changing their code.
- Flexibility: Provides a way to integrate and use legacy or third-party code.
- Single Responsibility Principle: Separates the adaptation code from the existing classes, keeping each class focused on its primary responsibility.

## Drawbacks

- Complexity: The adapter may become complex if it needs to translate many methods or properties.
- Performance: The adapter may impact performance if it needs to translate many methods or properties.
- Maintenance: The adapter may need to be updated if the Adaptee changes its interface.

## Use cases

- Legacy Code Integration: Integrating new code with legacy systems that use different interfaces.
- Third-Party Libraries: Adapting third-party libraries to fit into your system’s architecture.
- API Integration: Bridging different APIs or services with incompatible interfaces.