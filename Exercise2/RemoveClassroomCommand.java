package Exercise2;

public class RemoveClassroomCommand implements Command {
    private VirtualClassroomManager manager;

    public RemoveClassroomCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException, ClassroomNotFoundException {
        if (args.length < 1) {
            throw new InvalidCommandException("Usage: remove_classroom <class_name>");
        }
        manager.removeClassroom(args[0]);
    }
}
