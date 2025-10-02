import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set up the chain
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();
        Approver vp = new VicePresidentApprover();

        manager.setNext(director);
        director.setNext(vp);

        System.out.println("Loan Approval System");
        System.out.print("Enter loan amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter purpose: ");
        String purpose = scanner.nextLine();

        LoanRequest request = new LoanRequest(amount, purpose);
        manager.processRequest(request);

        scanner.close();
    }
}
