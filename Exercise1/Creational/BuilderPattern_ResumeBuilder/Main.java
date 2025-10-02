import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resume Builder");
        System.out.print("Choose builder type (1 for Simple, 2 for Detailed): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        ResumeBuilder builder;
        if (choice == 1) {
            builder = new SimpleResumeBuilder();
        } else {
            builder = new DetailedResumeBuilder();
        }

        ResumeDirector director = new ResumeDirector(builder);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter experience: ");
        String experience = scanner.nextLine();
        System.out.print("Enter education: ");
        String education = scanner.nextLine();
        System.out.print("Enter skills: ");
        String skills = scanner.nextLine();

        director.constructResume(name, email, phone, experience, education, skills);
        Resume resume = director.getResume();
        System.out.println(resume);

        scanner.close();
    }
}
