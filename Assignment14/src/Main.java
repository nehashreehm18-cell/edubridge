
class BankAccount {
    String account_holder_name;
    double balance;

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.account_holder_name = "Ram";
        b1.balance = 5000;

        b1.deposit(2000);
        b1.withdraw(1000);
        b1.checkBalance();
    }
}

