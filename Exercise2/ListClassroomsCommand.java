package Exercise2;

import java.util.List;

public class ListClassroomsCommand implements Command {
    private VirtualClassroomManager manager;

    public ListClassroomsCommand(VirtualClassroomManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) {
        List<String> classrooms = manager.listClassrooms();
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Classrooms:");
            for (String classroom : classrooms) {
                System.out.println("- " + classroom);
            }
        }
    }
}
