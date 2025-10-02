import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Organization Hierarchy Builder");

        System.out.print("Enter CEO name: ");
        String ceoName = scanner.nextLine();
        System.out.print("Enter CEO position: ");
        String ceoPosition = scanner.nextLine();
        System.out.print("Enter CEO salary: ");
        double ceoSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Employee ceo = new Employee(ceoName, ceoPosition, ceoSalary);

        while (true) {
            System.out.print("Add subordinate to CEO? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
            System.out.print("Enter subordinate name: ");
            String name = scanner.nextLine();
            System.out.print("Enter subordinate position: ");
            String position = scanner.nextLine();
            System.out.print("Enter subordinate salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            Employee subordinate = new Employee(name, position, salary);
            ceo.addSubordinate(subordinate);
        }

        System.out.println("\nOrganization Hierarchy:");
        ceo.displayHierarchy("");

        scanner.close();
    }
}
