package Exercise2;

import java.util.List;

public class ListStudentsCommand implements Command {
    private VirtualClassroomManager manager;

    public ListStudentsCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException, ClassroomNotFoundException {
        if (args.length < 1) {
            throw new InvalidCommandException("Usage: list_students <class_name>");
        }
        List<String> students = manager.listStudentsInClassroom(args[0]);
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + args[0] + ".");
        } else {
            System.out.println("Students in " + args[0] + ":");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }
}
