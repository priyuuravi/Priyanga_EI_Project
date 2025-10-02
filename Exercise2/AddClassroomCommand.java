package Exercise2;

public class AddClassroomCommand implements Command {
    private VirtualClassroomManager manager;

    public AddClassroomCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) throws InvalidCommandException {
        if (args.length < 1) {
            throw new InvalidCommandException("Usage: add_classroom <class_name>");
        }
        manager.addClassroom(args[0]);
    }
}
