# Observer
**Also known as:** Event-Subscriber, Listener.

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

## Key Components

- Subject: The object that holds the state and sends notifications to observers.
- Observer: The objects that need to be notified when the subject's state changes.
- ConcreteSubject: A subclass of Subject that maintains the state and sends notifications to its observers.
- ConcreteObserver: A subclass of Observer that implements the update method to react to state changes in the subject.

## Benefits

- Decoupling: The subject and observers are loosely coupled, allowing for easy maintenance and scalability.
- Dynamic Relationship: Observers can be added or removed dynamically.
- Single Responsibility Principle: The pattern helps in separating the subject’s state management from the way it’s displayed or processed by different observers.

## Drawbacks

- Unexpected Updates: Observers may receive updates that they don’t need, leading to performance issues.
- Memory Leaks: If observers are not removed properly, they can cause memory leaks.
- Order of Notifications: The order in which observers are notified may be unpredictable.
- Error Handling: Observers may not handle exceptions properly, leading to unexpected behavior.

## Use cases

- User Interface: Updating multiple views in a UI when the model changes (e.g., MVC pattern).
- Event Handling: Notifying multiple components about changes in a system (e.g., event listeners).
- Real-time Systems: Tracking and reacting to changes in real-time systems (e.g., stock market data, news feeds).


