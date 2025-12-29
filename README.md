# **Student Management System (Assignment 1)**


## **A. Project Overview**

This project is a Java-based Vehicle Management System designed to demonstrate core Object-Oriented Programming (OOP) concepts. It manages different types of vehicles and their assigned drivers, ensuring a structured approach to code through:
- **Inheritance:** Creating specialized vehicle types from a common base.
- **Abstraction:** Using an abstract Vehicle class to define mandatory behaviors (startEngine, stopEngine) without dictating implementation.
- **Composition/Aggregation:** Modeling the relationship between Vehicle and Driver objects.


## **B. Class Hierarchy**

- **Superclass:** Vehicle (Abstract) - Defines common fields like brand and year and abstract methods for engine control.
- **Subclasses:**
  - **Car:** Adds doors and fuelType.
  - **Motorcycle:** Adds hasSidecar status.
  - **Truck:** Adds cargo capacity and numAxles
- **Overridden Methods:** Each subclass provides a unique implementation of startEngine() and stopEngine() to reflect the specific sounds and behaviors of that vehicle type.
- **Access Modifiers:** protected is used for superclass fields to allow direct access by subclasses while keeping them hidden from external classes, maintaining encapsulation.


## **C. Instructions to Compile and Run**

To run this program, ensure you have the Java Development Kit (JDK) installed.
### 1. Open your terminal or command prompt.
### 2. Navigate to the src/ directory.
### 3. Compile the code:
```
javac *.java
```

### 2. Run the program:
```
java Main
```


## **D. Screenshots**
![alt text](https://github.com/Kuman37/assignment2-vehicle-system/blob/master/docs/screenshots/output.png)


## **E. Reflection**
Inheritance significantly simplified the system's design by allowing me to define a single, robust blueprint in the abstract Vehicle class. By centralizing common attributes like brand and year in the superclass, I eliminated the need to rewrite basic logic for every new vehicle type. Method overriding was equally vital, as it provided the flexibility to customize engine behaviors for the Car, Motorcycle, and Truck subclasses while maintaining a consistent interface. This enabled the use of a single Vehicle array to process diverse objects through polymorphism, ensuring that calling startEngine() triggered the correct, specialized output for each specific vehicle type.

One of the primary challenges faced during implementation involved balancing encapsulation with accessibility through the use of protected and default access modifiers. While protected fields allow subclasses to access superclass data directly without needing public getters, it also risks exposing internal data more broadly than intended within the same package. Finding the right balance required careful thought to ensure that fields like brand were accessible for constructor chaining and method overriding, while still being protected from unrelated classes in the system. This process highlighted the importance of a well-structured class hierarchy in maintaining clean, secure code.
