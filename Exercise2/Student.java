package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private List<String> enrolledClassrooms;

    public Student(String id) {
        this.id = id;
        this.enrolledClassrooms = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<String> getEnrolledClassrooms() {
        return enrolledClassrooms;
    }

    public void enrollInClassroom(String classroomName) {
        if (!enrolledClassrooms.contains(classroomName)) {
            enrolledClassrooms.add(classroomName);
        }
    }

    public boolean isEnrolledIn(String classroomName) {
        return enrolledClassrooms.contains(classroomName);
    }
}
