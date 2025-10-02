package Exercise2;

public class AddStudentCommand implements Command {
    private VirtualClassroomManager manager;

    public AddStudentCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException, ClassroomNotFoundException {
        if (args.length < 2) {
            throw new InvalidCommandException("Usage: add_student <student_id> <class_name>");
        }
        manager.addStudent(args[0], args[1]);
    }
}
