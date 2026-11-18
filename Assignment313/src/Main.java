
class Payment {

    // Method to calculate payment amount
    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method with discount
    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

// Card Payment
class CardPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 2 / 100);
    }
}

// UPI Payment
class UPIPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 1 / 100);
    }
}

public class Main {
    public static void main(String[] args) {

        // Parent references
        Payment p1 = new CardPayment();
        Payment p2 = new UPIPayment();

        // Runtime polymorphism
        System.out.println("Card Payment: "
                + p1.calculateAmount(1000));

        System.out.println("UPI Payment: "
                + p2.calculateAmount(1000));

        // Method overloading
        Payment p3 = new Payment();

        System.out.println("Discount Amount: "
                + p3.calculateAmount(1000, 10));
    }
}
