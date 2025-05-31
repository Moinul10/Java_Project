package BankingSystem;
public class BankingSystemMain {
    public static void main(String[] args) {
        // Create bank
        Bank bank = new Bank("City ");
        bank.welcomeMessage();

        // Create account and customer
        Account account = new Account("AC1010", 10000.0);
        Customer customer = new Customer("Shahed", "C202", account);

        // Create employee
        BankEmployee employee = new BankEmployee("Mr. Hasan", "E505", "Branch Manager");

        // Show details
        customer.showAccountDetails();
        employee.displayEmployeeInfo();

        // Operations
        employee.assistCustomer(customer);
        customer.deposit(2000);
        customer.withdraw(1500);

        // Show final account details
        customer.showAccountDetails();
    }
}
