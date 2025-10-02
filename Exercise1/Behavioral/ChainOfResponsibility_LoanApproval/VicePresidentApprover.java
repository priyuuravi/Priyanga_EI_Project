public class VicePresidentApprover extends Approver {
    @Override
    public void processRequest(LoanRequest request) {
        if (request.getAmount() > 200000) {
            System.out.println("Vice President approves the loan of $" + request.getAmount() + " for " + request.getPurpose());
        } else {
            System.out.println("Loan request processed.");
        }
    }
}
