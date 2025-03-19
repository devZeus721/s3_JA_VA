# Basic Java Project

This project is a simple Java application that demonstrates the basics of Java programming, including Object-Oriented Programming (OOP) concepts.

## Project Structure

```
basic-java-project
├── src
│   ├── Main.java          # Entry point of the application
│   ├── oop
│   │   ├── Animal.java    # Base class for animals
│   │   ├── Dog.java       # Dog class extending Animal
│   │   └── Cat.java       # Cat class extending Animal
├── .gitignore             # Git ignore file
├── build.gradle           # Gradle build configuration
└── README.md              # Project documentation
```

## Getting Started

To set up and run this project, follow these steps:

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd basic-java-project
   ```

2. **Build the project**:
   Make sure you have Gradle installed. Run the following command to build the project:
   ```
   gradle build
   ```

3. **Run the application**:
   After building the project, you can run the application using:
   ```
   gradle run
   ```

## OOP Concepts Demonstrated

- **Inheritance**: The `Dog` and `Cat` classes inherit from the `Animal` class.
- **Polymorphism**: The `makeSound()` method is overridden in both `Dog` and `Cat` classes to provide specific implementations.
- **Encapsulation**: Properties like `name` and `age` in the `Animal` class are encapsulated and accessed through methods.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.