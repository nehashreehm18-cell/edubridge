
class BankAccount {

    private int accountNumber;
    private double balance;

    static int count = 0;

    final int accountId;

    // Constructor
    BankAccount(int accountNumber, double balance, int accountId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId = accountId;
        count++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Static method
    public static void displayCount() {
        System.out.println("Total Accounts: " + count);
    }
}

// Separate testing class
public class BankTest {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, 5000, 1001);

        b1.deposit(2000);
        b1.withdraw(1000);

        System.out.println("Current Balance: " + b1.getBalance());

        BankAccount.displayCount();
    }
}

