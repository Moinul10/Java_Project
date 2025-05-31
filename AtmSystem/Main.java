
package AtmSystem;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount acc = new SavingsAccount("101", "Alice", 1000.0);

        // Create an ATM
        ATM atm = new ATM("Downtown Branch");

        // Perform a withdrawal
        atm.performTransaction(acc, "withdraw", 200.0);

        // Perform a deposit
        atm.performTransaction(acc, "deposit", 300.0);

        // Create a transaction object (for demo)
        Transaction t = new Transaction("TXN001", "deposit", 300.0);
        t.displayTransaction();
    }
}
