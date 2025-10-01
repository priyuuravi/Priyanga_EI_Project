<<<<<<< HEAD
# Priyanga_EI_Project
EI project
=======

>>>>>>> 4128afd (Added README.md and project files)

EXERCISE 1

BEHAVIOURAL DESIGN PATTERN

 1. E-commerce Discount Calculator – Strategy Pattern

Use Case
This console-based application allows users to calculate final prices using different discount strategies. Discounts can vary by context, such as seasonal sales, clearance offers, or loyalty rewards.

Design Pattern
The Strategy Pattern is applied to encapsulate discount algorithms. This allows the algorithm to vary independently from clients that use it.

How it Relates to the Use Case

* Context: `Cart` class uses a `DiscountStrategy`.
* Strategies: `FestivalDiscount`, `ClearanceSaleDiscount`, `LoyaltyDiscount`.
* Each strategy applies different discount logic while keeping the client code simple.

Classes

* `DiscountStrategy`: Interface for discount strategies.
* `FestivalDiscount`, `ClearanceSaleDiscount`, `LoyaltyDiscount`: Concrete strategy classes.
* `Cart`: Context class that applies discounts using a selected strategy.
* `Main`: Entry point demonstrating different strategies.

 2. Loan Approval Workflow – Chain of Responsibility Pattern

Use Case
This application simulates a loan approval process in a bank. A request is passed through a chain of handlers: Clerk → Branch Manager → Regional Manager. Each handler decides if it can approve the loan; otherwise, it forwards the request.

Design Pattern
The Chain of Responsibility Pattern allows a request to be passed along a chain of handlers, where each handler can either process the request or pass it on.

Relation to Use Case

* Handlers: `Clerk`, `BranchManager`, `RegionalManager`.
* Each handler checks the loan amount and decides if it can approve.
* Requests exceeding limits propagate up the chain.

Classes

* `LoanApprover`: Abstract handler defining request processing.
* `Clerk`, `BranchManager`, `RegionalManager`: Concrete handlers.
* `Main`: Demonstrates loan approval flow.

----------------------------------------------------------------------------------------------------

CREATIONAL DESIGN PATTERN

 1. Online Resume Builder – Builder Pattern

Use Case
A resume builder that constructs professional resumes step by step. The system creates resumes by assembling sections like personal info, education, experience, skills, and projects.

Design Pattern
The Builder Pattern separates the construction of a complex object (Resume) from its representation, enabling step-by-step creation.

Relation to Use Case

* Director (`ResumeDirector`) controls the building process.
* Concrete builder (`SoftwareEngineerResumeBuilder`) assembles resume parts.
* Product (`Resume`) is created step by step.

Classes

* `Resume`: Product class representing the final resume.
* `ResumeBuilder`: Interface defining steps to build resume.
* `SoftwareEngineerResumeBuilder`: Concrete builder.
* `ResumeDirector`: Directs building steps.
* `Main`: Demonstrates resume construction.


2. Online Learning Course Cloning – Prototype Pattern

Use Case
Universities can quickly create new course sections by cloning a base course template (course code, syllabus, professor). This avoids rebuilding courses from scratch.

Design Pattern
The Prototype Pattern creates new objects by cloning existing ones, reducing the cost of object creation.

Relation to Use Case

* Prototype: `Course` interface defines clone method.
* Concrete Prototype: `OnlineCourse` supports cloning.
* Client clones base courses for reuse.

Classes

* `Course`: Interface for cloning and showing details.
* `OnlineCourse`: Concrete prototype class.
* `Main`: Demonstrates cloning course objects.

-------------------------------------------------------------------------------------------------------

STRUCTURAL DESIGN PATTERN

1. Organizational Hierarchy – Composite Pattern

Use Case
This application models a company’s organizational hierarchy. Managers can have employees (developers, designers) or other managers reporting to them.

Design Pattern
The Composite Pattern treats individual objects (employees) and composites (managers with teams) uniformly.

Relation to Use Case

* Leaf: `Developer`, `Designer`.
* Composite: `Manager`, which holds subordinates.
* Client: Works with both uniformly through `Employee` interface.

Classes

* `Employee`: Component interface.
* `Developer`, `Designer`: Leaf implementations.
* `Manager`: Composite that manages subordinates.
* `Main`: Demonstrates hierarchy creation.


2. News Feed with Features – Decorator Pattern

Use Case
A news feed application that allows dynamically adding features like comments, sharing, and ads to a basic article.

Design Pattern
The Decorator Pattern dynamically adds responsibilities to objects without modifying their structure.

Relation to Use Case

* Component: `News` interface.
* Concrete Component: `BasicNews`.
* Decorators: `CommentFeature`, `ShareFeature`.
* Client composes objects with desired features.

Classes

* `News`: Component interface.
* `BasicNews`: Core news article.
* `NewsDecorator`: Abstract decorator.
* `CommentFeature`, `ShareFeature`: Concrete decorators.
* `Main`: Demonstrates adding features to articles.

-------------------------------------------------------------------------------------------------------

EXERCISE 2

Virtual Classroom Manager

Use Case 
The Virtual Classroom Manager is a console-based application that simulates managing classrooms in an educational platform. It supports classroom creation, student enrollment, assignment scheduling, and assignment submission.

Functionalities

* Classroom Management: Create, list, and remove classrooms.
* Student Management: Add students to classrooms and view enrolled students.
* Assignment Management: Schedule assignments and allow students to submit them.
* Notifications: Notify users when assignments are scheduled or submitted.

Design Patterns Used

1. **Singleton Pattern**

   * **Purpose**: Ensures only one global `ClassroomManager` exists to manage classrooms, students, and assignments.
   * **Relation to Use Case**: Centralizes classroom management, ensuring consistent state.

2. **Factory Pattern**

   * **Purpose**: Encapsulates creation of `Classroom`, `Student`, and `Assignment` objects.
   * **Relation to Use Case**: Simplifies object creation and makes the system extensible.

3. **Observer Pattern**

   * **Purpose**: Allows automatic notification of events like assignment scheduling or submission.
   * **Relation to Use Case**: Keeps users updated with important classroom events.

<<<<<<< HEAD


Classes and Their Responsibilities
=======
---

### 🗂️ Classes and Their Responsibilities
>>>>>>> 4128afd (Added README.md and project files)

* `Classroom`: Represents a classroom with students and assignments.
* `Student`: Represents a student enrolled in a classroom.
* `Assignment`: Represents an assignment linked to a classroom.
* `ClassroomManager`: Singleton class managing all classrooms.
* `EntityFactory`: Factory class for creating entities.
* `Observer`: Interface for observers.
* `NotificationService`: Observer implementation for notifications.
* `Main`: Console entry point to interact with the system.

 Compiling and Executing

To compile:

bash
javac -d out src/**/*.java

<<<<<<< HEAD
=======

>>>>>>> 4128afd (Added README.md and project files)
To run:

bash
java -cp out main.Main

 Tech Stack

* Language: Java
* JDK Version: 17
* Build Tools: javac, java
* Version Control: GitHub

----------------------------------------------------------------------------------------------------------


<<<<<<< HEAD

=======
>>>>>>> 4128afd (Added README.md and project files)
