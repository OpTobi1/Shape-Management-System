# Shape-Management-System
A robust Java project demonstrating core **Object-Oriented Programming (OOP)** principles through a geometric shape hierarchy.

## 🚀 Features
* **Abstract Hierarchy:** Base `Shape` class with specialized `Circle`, `Rectangle`, and `Square` subclasses.
* **Polymorphism:** Managing diverse objects within a single array and using dynamic method dispatch.
* **Automated Generation:** Random generation of 20 distinct shapes with random dimensions.
* **Data Analysis:** Efficient algorithm to find and display the largest instance of each shape type.
* **Type Safety:** Demonstration of safe Downcasting and `instanceof` checks.

## 📂 Class Structure
* **Shape (Abstract):** Defines `color`, `getArea()`, and `getPerimeter()`.
* **Circle:** Implements radial calculations.
* **Rectangle:** Implements width/length calculations.
* **Square:** A specialized `Rectangle` where `width == length`.
* **Main Programs:**
    * `MainShapeArray`: Handles bulk processing and finding maximums.
    * `MainTestShape`: Validates reference types vs object types.
