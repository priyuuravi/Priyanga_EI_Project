import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Course Cloning System");
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter instructor: ");
        String instructor = scanner.nextLine();
        System.out.print("Enter duration (hours): ");
        int duration = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Course original = new Course(name, instructor, duration, price);
        System.out.println("Original Course: " + original);

        Course cloned = original.clone();
        System.out.println("Cloned Course: " + cloned);

        // Modify cloned to show independence
        cloned.setCourseName("Advanced " + cloned.getCourseName());
        cloned.setPrice(cloned.getPrice() * 1.2);

        System.out.println("After modification:");
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        scanner.close();
    }
}
