import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public void removeSubordinate(Employee e) {
        subordinates.remove(e);
    }

    public void displayHierarchy(String indent) {
        System.out.println(indent + name + " - " + position + " - $" + salary);
        for (Employee e : subordinates) {
            e.displayHierarchy(indent + "    ");
        }
    }
}
