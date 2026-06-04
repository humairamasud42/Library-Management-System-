# Library Management System

## Overview

This project is a simple Library Management System developed in Java using Object-Oriented Programming concepts such as Encapsulation, Inheritance, and Method Overriding.

The system allows:

* Creating library items
* Managing book availability
* Checking out and returning books
* Displaying book details

---

## Features

* Encapsulation using private fields
* Inheritance using `Book extends LibraryItem`
* Method overriding with `getDetails()`
* Availability status management
* Constructor chaining using `super()`

---

## Technologies Used

* Java
* VS Code
* OOP Concepts

---

## Project Structure

```text
LibrarySystem
│
├── LibraryItem.java
├── Book.java
└── Main.java
```

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Sample Output

```text
---- Initial Details ----
Item ID: 1
Title: Classic Shakspeare
Available: true
Author: Jackson Mike
Pages: 100

---- Checking Out ----
Item checked out

---- Returning Book ----
Item returned
```

---

## Concepts Demonstrated

* Classes & Objects
* Encapsulation
* Inheritance
* Method Overriding
* Constructors
* Polymorphism

---

## Author

Developed as part of Java OOP coursework.
