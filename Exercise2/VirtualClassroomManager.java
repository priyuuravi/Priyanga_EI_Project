package Exercise2;

import java.util.*;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;
    private Map<String, Student> students;
    private Map<String, Assignment> assignments;

    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
        this.students = new HashMap<>();
        this.assignments = new HashMap<>();
    }

    public void addClassroom(String name) {
        if (!classrooms.containsKey(name)) {
            classrooms.put(name, new Classroom(name));
            System.out.println("Classroom " + name + " has been created.");
        } else {
            System.out.println("Classroom " + name + " already exists.");
        }
    }

    public void addStudent(String studentId, String classroomName) throws ClassroomNotFoundException {
        if (!classrooms.containsKey(classroomName)) {
            throw new ClassroomNotFoundException("Classroom " + classroomName + " does not exist.");
        }
        Classroom classroom = classrooms.get(classroomName);
        if (!students.containsKey(studentId)) {
            students.put(studentId, new Student(studentId));
        }
        Student student = students.get(studentId);
        if (!student.isEnrolledIn(classroomName)) {
            student.enrollInClassroom(classroomName);
            classroom.enrollStudent(studentId);
            System.out.println("Student " + studentId + " has been enrolled in " + classroomName + ".");
        } else {
            System.out.println("Student " + studentId + " is already enrolled in " + classroomName + ".");
        }
    }

    public void scheduleAssignment(String classroomName, String assignmentDetails) throws ClassroomNotFoundException {
        if (!classrooms.containsKey(classroomName)) {
            throw new ClassroomNotFoundException("Classroom " + classroomName + " does not exist.");
        }
        String key = classroomName + ":" + assignmentDetails;
        if (!assignments.containsKey(key)) {
            Assignment assignment = new Assignment(assignmentDetails, classroomName);
            assignments.put(key, assignment);
            classrooms.get(classroomName).addAssignment(assignmentDetails);
            System.out.println("Assignment for " + classroomName + " has been scheduled.");
        } else {
            System.out.println("Assignment already scheduled for " + classroomName + ".");
        }
    }

    public void submitAssignment(String studentId, String classroomName, String assignmentDetails) throws ClassroomNotFoundException, StudentNotEnrolledException, AssignmentNotFoundException {
        if (!classrooms.containsKey(classroomName)) {
            throw new ClassroomNotFoundException("Classroom " + classroomName + " does not exist.");
        }
        if (!students.containsKey(studentId) || !students.get(studentId).isEnrolledIn(classroomName)) {
            throw new StudentNotEnrolledException("Student " + studentId + " is not enrolled in " + classroomName + ".");
        }
        String key = classroomName + ":" + assignmentDetails;
        if (!assignments.containsKey(key)) {
            throw new AssignmentNotFoundException("Assignment " + assignmentDetails + " does not exist in " + classroomName + ".");
        }
        Assignment assignment = assignments.get(key);
        if (!assignment.isSubmittedBy(studentId)) {
            assignment.submitByStudent(studentId);
            System.out.println("Assignment submitted by Student " + studentId + " in " + classroomName + ".");
        } else {
            System.out.println("Assignment already submitted by Student " + studentId + ".");
        }
    }

    public List<String> listClassrooms() {
        return new ArrayList<>(classrooms.keySet());
    }

    public List<String> listStudentsInClassroom(String classroomName) throws ClassroomNotFoundException {
        if (!classrooms.containsKey(classroomName)) {
            throw new ClassroomNotFoundException("Classroom " + classroomName + " does not exist.");
        }
        return new ArrayList<>(classrooms.get(classroomName).getEnrolledStudents());
    }

    public void removeClassroom(String classroomName) throws ClassroomNotFoundException {
        if (!classrooms.containsKey(classroomName)) {
            throw new ClassroomNotFoundException("Classroom " + classroomName + " does not exist.");
        }
        Classroom classroom = classrooms.remove(classroomName);
        for (String studentId : classroom.getEnrolledStudents()) {
            if (students.containsKey(studentId)) {
                students.get(studentId).getEnrolledClassrooms().remove(classroomName);
            }
        }
        for (String assignmentDetails : classroom.getAssignments()) {
            assignments.remove(classroomName + ":" + assignmentDetails);
        }
        System.out.println("Classroom " + classroomName + " has been removed.");
    }
}
