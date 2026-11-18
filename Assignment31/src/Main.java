
class Calculator {

    // Returns sum of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Returns product of two double values
    double calculate(double a, double b) {
        return a * b;
    }

    // Returns largest of three integers
    int calculate(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Returns difference as double
    double calculate(int a, double b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum: " + c.calculate(10, 20));

        System.out.println("Product: " + c.calculate(5.5, 2.0));

        System.out.println("Largest: " + c.calculate(10, 25, 15));

        System.out.println("Difference: " + c.calculate(20, 5.5));
    }
}



//Java selects the correct overloaded method based on:
//
//Number of arguments.
//Data types of arguments.
//Order of arguments.
//
//Example:
//
//calculate(10, 20) → Calls the first method.
//calculate(5.5, 2.0) → Calls the second method.
//calculate(10, 25, 15) → Calls the third method.
//calculate(20, 5.5) → Calls the fourth method
