public abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(LoanRequest request);
}
