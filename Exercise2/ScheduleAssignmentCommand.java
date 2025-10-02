package Exercise2;

public class ScheduleAssignmentCommand implements Command {
    private VirtualClassroomManager manager;

    public ScheduleAssignmentCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException, ClassroomNotFoundException {
        if (args.length < 2) {
            throw new InvalidCommandException("Usage: schedule_assignment <class_name> <assignment_details>");
        }
        manager.scheduleAssignment(args[0], args[1]);
    }
}
