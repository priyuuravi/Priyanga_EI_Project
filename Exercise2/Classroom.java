package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<String> enrolledStudents;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public List<String> getAssignments() {
        return assignments;
    }

    public void enrollStudent(String studentId) {
        if (!enrolledStudents.contains(studentId)) {
            enrolledStudents.add(studentId);
        }
    }

    public void addAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
    }

    public boolean isStudentEnrolled(String studentId) {
        return enrolledStudents.contains(studentId);
    }
}
