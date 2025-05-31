package BankingSystem;
public class Customer extends Person {
    private Account account;

    public Customer(String name, String id, Account account) {
        super(name, id);
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void showAccountDetails() {
        account.displayAccountInfo();
    }
}
