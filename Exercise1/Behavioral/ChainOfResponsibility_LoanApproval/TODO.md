# Enhancement Plan for Chain of Responsibility Pattern Loan Approval System

## Tasks
- [x] Create LoanRequest.java class with amount and purpose fields
- [x] Create Approver.java abstract class/interface with setNext and processRequest methods
- [x] Create ManagerApprover.java for loans up to 50000
- [x] Create DirectorApprover.java for loans up to 200000
- [x] Create VicePresidentApprover.java for loans above 200000
- [x] Update Main.java to use Scanner for user inputs: enter loan amount and purpose, process approval
- [x] Test the application by compiling and running
