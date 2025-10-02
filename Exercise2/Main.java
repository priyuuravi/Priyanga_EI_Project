package Exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static VirtualClassroomManager manager = new VirtualClassroomManager();
    private static Map<String, Command> commands = new HashMap<>();

    public static void main(String[] args) {
        setupLogger();
        registerCommands();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Virtual Classroom Manager started. Enter commands:");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                continue;
            }
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting Virtual Classroom Manager.");
                break;
            }
            try {
                processInput(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                logger.log(Level.SEVERE, "Exception during command execution", e);
            }
        }
        scanner.close();
    }

    private static void setupLogger() {
        Logger rootLogger = Logger.getLogger("");
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        rootLogger.addHandler(consoleHandler);
        rootLogger.setLevel(Level.ALL);
    }

    private static void registerCommands() {
        commands.put("add_classroom", new AddClassroomCommand(manager));
        commands.put("add_student", new AddStudentCommand(manager));
        commands.put("schedule_assignment", new ScheduleAssignmentCommand(manager));
        commands.put("submit_assignment", new SubmitAssignmentCommand(manager));
        commands.put("list_classrooms", new ListClassroomsCommand(manager));
        commands.put("list_students", new ListStudentsCommand(manager));
        commands.put("remove_classroom", new RemoveClassroomCommand(manager));
    }

    private static void processInput(String input) throws Exception {
        String[] parts = input.trim().split("\\s+", 2);
        String commandKey = parts[0];
        String[] args = new String[0];
        if (parts.length > 1) {
            args = parts[1].split("\\s+");
        }

        Command command = commands.get(commandKey);
        if (command == null) {
            throw new InvalidCommandException("Unknown command: " + commandKey);
        }
        command.execute(args);
    }
}
