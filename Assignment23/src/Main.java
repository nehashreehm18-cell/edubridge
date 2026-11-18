
class InternetPlan {
    String planName;
    int validity;
    double price;

    // Default constructor
    InternetPlan() {
        this("Basic", 28, 199);
    }

    // Parameterized constructor
    InternetPlan(String planName, int validity, double price) {
        this.planName = planName;
        this.validity = validity;
        this.price = price;
    }

    // Method to display details
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Validity: " + validity + " days");
        System.out.println("Price: Rs." + price);
    }
}

public class Main {
    public static void main(String[] args) {

        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium", 84, 599);

        System.out.println("Default Plan:");
        p1.display();

        System.out.println("\nCustomized Plan:");
        p2.display();
    }
}

