# Design Patterns


System design patterns are general reusable solutions to common problems encountered during the design and development of software systems. 
This project provide a list of some commonly used system design patterns along with brief definitions, examples and sample implementation. 

To run the sample implementations, start the project with:
```
./gradlew run
```

## Creational Patterns
1. **Factory Pattern:**
   - **Definition:** Defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.
   - **Example:** GUI frameworks like Swing or AWT, where a factory creates different types of UI components.
   - **Implementation:**
      - [/api/design-patterns/factory-method?variant=factory1](http://localhost:8080/api/design-patterns/factory-method?variant=factory1)
      - [/api/design-patterns/factory-method?variant=factory2](http://localhost:8080/api/design-patterns/factory-method?variant=factory2)

2. **Abstract Factory Pattern**
   - **Definition:** Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   - **Example:** In a video game, an abstract factory could create different types of enemies (e.g., monsters, robots) along with their corresponding weapons (e.g., swords, lasers).
   - **Implementation:**
      - [/api/design-patterns/abstract-factory?variant=factory1](http://localhost:8080/api/design-patterns/abstract-factory?variant=factory1)
      - [/api/design-patterns/abstract-factory?variant=factory2](http://localhost:8080/api/design-patterns/abstract-factory?variant=factory2)

3. **Builder Pattern:**
   - **Definition:** Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
   - **Example:** StringBuilder in Java, DocumentBuilder in XML parsing.
   - **Implementation:**
      - [/api/design-patterns/builder?variant=product2](http://localhost:8080/api/design-patterns/builder?variant=product2)

4. **Prototype Pattern:**
   - **Definition:** Creates new objects by copying an existing object, known as the prototype, during runtime.
   - **Example:** Cloning in Java, where you can create a new object by copying an existing one.
   - **Implementation:**
      - [/api/design-patterns/prototype?variant=proto1](http://localhost:8080/api/design-patterns/prototype?variant=proto1)
      - [/api/design-patterns/prototype?variant=proto2](http://localhost:8080/api/design-patterns/prototype?variant=proto2)

5. **Singleton Pattern:**
    - **Definition:** Ensures that a class has only one instance and provides a global point of access to that instance.
    - **Example:** Database connection managers, logging systems.
    - **Implementation:**
      - [/api/design-patterns/singleton?variant=1](http://localhost:8080/api/design-patterns/singleton?variant=1)


## Structural Patterns
1. **Adapter Pattern:**
    - **Definition:** Allows incompatible interfaces to work together by wrapping an interface around an existing class.
    - **Example:** Using adapters to connect different kinds of devices to a computer, like USB to HDMI adapter.
    - **Implementation:**
      - [/api/design-patterns/adapter?variant=variant1](http://localhost:8080/api/design-patterns/adapter?variant=variant1)
      - [/api/design-patterns/adapter?variant=variant2](http://localhost:8080/api/design-patterns/adapter?variant=variant2)

2. **Bridge Pattern**
   - **Definition:** The Bridge pattern is a structural design pattern that decouples an abstraction from its implementation so that the two can vary independently.
   - **Example:** In a drawing application, the Bridge pattern could separate the drawing tools (abstraction) from the rendering engines (implementation) allowing different tools to be used with different rendering engines.
   - **Implementation:**
      - [/api/design-patterns/bridge?variant=variant1](http://localhost:8080/api/design-patterns/bridge?variant=variant1)

3. **Composite Pattern:**
   - **Definition:** Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
   - **Example:** GUI components like containers in Swing, where a container can contain other components.
   - **Implementation:**
      - [/api/design-patterns/composite?variant=variant](http://localhost:8080/api/design-patterns/composite?variant=variant)

4. **Decorator Pattern:**
    - **Definition:** Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
    - **Example:** Adding new features to a component in GUI frameworks without altering its structure.
    - **Implementation:**
      - [/api/design-patterns/decorator?variant=variant1](http://localhost:8080/api/design-patterns/decorator?variant=variant1)

5. **Facade Pattern**
   - **Definition:** The Facade pattern is a structural design pattern that provides a simplified interface to a complex system, hiding its complexity from clients.
   - **Example:** A home theater system's remote control acts as a facade, providing a simple interface for controlling multiple devices (TV, speakers, DVD player) behind the scenes.
   - **Implementation:**
      - [/api/design-patterns/facade?variant=1](http://localhost:8080/api/design-patterns/facade?variant=1)

6. **Flyweight Pattern**
   - **Definition:** The Flyweight pattern is a structural design pattern that minimizes memory usage or computational expenses by sharing as much as possible with similar objects.
   - **Example:** In a text editor, the Flyweight pattern could be used to store and reuse common character objects (e.g., letters, digits) to reduce memory consumption.
   - **Implementation:**
      - [/api/design-patterns/flyweight](http://localhost:8080/api/design-patterns/flyweight)

7. **Proxy Pattern:**
   - **Definition:** Provides a surrogate or placeholder for another object to control access to it.
   - **Example:** Virtual proxy for lazy loading of large resources, security proxy to control access rights.
   - **Implementation:**
      - [/api/design-patterns/proxy?variant=v1](http://localhost:8080/api/design-patterns/proxy?variant=v1)

## Behavioural Patterns

1. **Chain of Responsibility Pattern**
    - **Definition:** The Chain of Responsibility pattern is a behavioral design pattern where a request is passed through a chain of handlers, and each handler decides either to process the request or to pass it to the next handler in the chain.
    - **Example:** In a customer support system, a customer complaint can be handled by different levels of support personnel (e.g., junior agent, senior agent, manager) until it's resolved, following the Chain of Responsibility pattern.
    - **Implementation:**
       - [/api/design-patterns/proxy?variant=v1](http://localhost:8080/api/design-patterns/proxy?variant=v1)

2. **Command Pattern**
    - **Definition:** Provides a surrogate or placeholder for another object to control access to it.
    - **Example:** Virtual proxy for lazy loading of large resources, security proxy to control access rights.
    - **Implementation:**
       - [/api/design-patterns/chain-of-responsibility?parameter=param1](http://localhost:8080/api/design-patterns/chain-of-responsibility?parameter=param1)

3. **Iterator Pattern**
    - **Definition:** The Iterator pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    - **Example:** Iterating over elements in a list using a for loop in programming languages like Python or Java follows the Iterator pattern, where the iteration logic is abstracted away from the underlying data structure.
    - **Implementation:**
       - [/api/design-patterns/iterator?parameter=param1](http://localhost:8080/api/design-patterns/iterator?parameter=param1)

4. **Mediator Pattern**
    - **Definition:** The Mediator pattern is a behavioral design pattern that defines an object that encapsulates how a set of objects interact with each other, promoting loose coupling by keeping objects from referring to each other explicitly.
    - **Example:** In a chat application, a mediator facilitates communication between users by relaying messages between them, without requiring the users to know each other's details, exemplifying the Mediator pattern.
    - **Implementation:**
       - [/api/design-patterns/mediator?parameter=param2](http://localhost:8080/api/design-patterns/mediator?parameter=param2)

5. **Memento Pattern**
    - **Definition:** The Memento pattern is a behavioral design pattern that allows an object's state to be captured and restored at a later time without violating encapsulation.
    - **Example:** Undo functionality in a text editor, where the editor saves snapshots of its state (e.g., text content) to allow users to revert to previous states, demonstrates the Memento pattern.
    - **Implementation:**
       - [/api/design-patterns/memento?parameter=param1](http://localhost:8080/api/design-patterns/memento?parameter=param1)

6. **Observer Pattern:**
    - **Definition:** Defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.
    - **Example:** Event handling mechanisms in GUI programming, where components register as observers to receive notifications.
    - **Implementation:**
      - [/api/design-patterns/observer?parameter=param](http://localhost:8080/api/design-patterns/observer?parameter=param)

7. **State Pattern**
    - **Definition:** The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern encapsulates state-related behavior into separate state classes and allows the object to transition between these states dynamically.
    - **Example:** A vending machine changes its behavior (e.g., dispensing items, accepting payment) based on its internal state (e.g., "ready", "waiting for payment", "out of stock"), showcasing the State pattern.
    - **Implementation:**
       - [/api/design-patterns/state?variant=variant1](http://localhost:8080/api/design-patterns/state?variant=variant1)
       - [/api/design-patterns/state?variant=variant2](http://localhost:8080/api/design-patterns/state?variant=variant2)

8. **Strategy Pattern:**
    - **Definition:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
    - **Example:** Sorting algorithms in programming languages like Java, where different strategies (e.g., bubble sort, quick sort) can be employed interchangeably.
    - **Implementation:**
      - [/api/design-patterns/strategy?variant=variant1](http://localhost:8080/api/design-patterns/strategy?variant=variant1)
      - [/api/design-patterns/strategy?variant=variant2](http://localhost:8080/api/design-patterns/strategy?variant=variant2)

9. **Template Pattern**
   - **Definition:** The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It allows subclasses to redefine certain steps of the algorithm without changing its structure.
   - **Example:** A recipe template where the overall steps are defined (e.g., prep, cook, serve) but the specific ingredients and techniques can be customized, illustrating the Template Method pattern.
   - **Implementation:**
      - [/api/design-patterns/template?variant=variant1](http://localhost:8080/api/design-patterns/template?variant=variant1)
      - [/api/design-patterns/template?variant=variant2](http://localhost:8080/api/design-patterns/template?variant=variant2)

10. **Visitor Pattern**
    - **Definition:** The Visitor pattern is a behavioral design pattern that allows adding new operations to objects without modifying their structure by separating the algorithm from the object structure.
    - **Example:** In a document processing application, a Visitor pattern can be used to implement different export operations (e.g., PDF, HTML) without modifying the structure of the document elements.
    - **Implementation:**
       - [http://localhost:8080/api/design-patterns/visitor?variant=variant1](http://localhost:8080/api/design-patterns/visitor?variant=variant1)
       - [http://localhost:8080/api/design-patterns/visitor?variant=variant2](http://localhost:8080/api/design-patterns/visitor?variant=variant2)



These patterns are foundational in software engineering and are commonly used to solve recurring design problems in a systematic and efficient manner.