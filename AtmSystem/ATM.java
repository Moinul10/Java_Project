
package AtmSystem;
public class ATM {
    private String location;

    public ATM(String location) {
        this.location = location;
    }

    public void performTransaction(BankAccount acc, String type, double amount) {
        System.out.println("\n--- Transaction Start ---");
        System.out.println("ATM Location: " + location);
        switch (type.toLowerCase()) {
            case "deposit":
                acc.deposit(amount);
                break;
            case "withdraw":
                acc.withdraw(amount);
                break;
            default:
                System.out.println("Invalid transaction type.");
        }
        acc.checkBalance();
        System.out.println("--- Transaction End ---\n");
    }
}


