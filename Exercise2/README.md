# Virtual Classroom Manager

This is a terminal-based Virtual Classroom Manager application implemented in Java. It manages virtual classrooms, student enrollments, assignment scheduling, and submissions.

## Features

- Add, list, and remove classrooms
- Enroll students in classrooms and list students per classroom
- Schedule assignments for classrooms and submit assignments by students
- Console-based command interface
- Logging and exception handling
- Designed with SOLID principles and Command design pattern

## Commands

- `add_classroom <class_name>`: Create a new classroom
- `add_student <student_id> <class_name>`: Enroll a student in a classroom
- `schedule_assignment <class_name> <assignment_details>`: Schedule an assignment for a classroom
- `submit_assignment <student_id> <class_name> <assignment_details>`: Submit an assignment by a student
- `list_classrooms`: List all classrooms
- `list_students <class_name>`: List students in a classroom
- `remove_classroom <class_name>`: Remove a classroom
- `exit` or `quit`: Exit the application

## How to Run

Compile all Java files in the `Exercise2` package and run the `Main` class.

Example:

```bash
javac Exercise2/*.java
java Exercise2.Main
```

## Notes

- The application uses in-memory data structures.
- Focus is on code quality, design patterns, and SOLID principles.
- Logging is done using `java.util.logging`.
