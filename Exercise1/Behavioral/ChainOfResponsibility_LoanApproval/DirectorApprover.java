public class DirectorApprover extends Approver {
    @Override
    public void processRequest(LoanRequest request) {
        if (request.getAmount() <= 200000) {
            System.out.println("Director approves the loan of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("Loan request denied: No approver available for $" + request.getAmount());
        }
    }
}
