package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Assignment {
    private String details;
    private String classroomName;
    private List<String> submittedStudents;

    public Assignment(String details, String classroomName) {
        this.details = details;
        this.classroomName = classroomName;
        this.submittedStudents = new ArrayList<>();
    }

    public String getDetails() {
        return details;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public List<String> getSubmittedStudents() {
        return submittedStudents;
    }

    public void submitByStudent(String studentId) {
        if (!submittedStudents.contains(studentId)) {
            submittedStudents.add(studentId);
        }
    }

    public boolean isSubmittedBy(String studentId) {
        return submittedStudents.contains(studentId);
    }
}
