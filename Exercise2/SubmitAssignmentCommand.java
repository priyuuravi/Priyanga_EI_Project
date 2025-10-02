package Exercise2;

public class SubmitAssignmentCommand implements Command {
    private VirtualClassroomManager manager;

    public SubmitAssignmentCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException, ClassroomNotFoundException, StudentNotEnrolledException, AssignmentNotFoundException {
        if (args.length < 3) {
            throw new InvalidCommandException("Usage: submit_assignment <student_id> <class_name> <assignment_details>");
        }
        manager.submitAssignment(args[0], args[1], args[2]);
    }
}
