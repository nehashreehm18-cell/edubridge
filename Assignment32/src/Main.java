
class Complex {
    double real, imaginary;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Addition of two complex numbers
    Complex add(Complex c) {
        return new Complex(real + c.real,
                imaginary + c.imaginary);
    }

    // Multiplication of two complex numbers
    Complex multiply(Complex c) {
        double r = real * c.real - imaginary * c.imaginary;
        double i = real * c.imaginary + imaginary * c.real;

        return new Complex(r, i);
    }

    // Compare magnitude
    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First number is greater");
        else if (m1 < m2)
            System.out.println("Second number is greater");
        else
            System.out.println("Both are equal");
    }

    // Copy method
    Complex copy() {
        return new Complex(real, imaginary);
    }

    // Display method
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {

        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 5);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        System.out.print("Magnitude Comparison: ");
        c1.compareMagnitude(c2);

        // Copy object
        Complex c3 = c1.copy();

        // Modify original object
        c1.real = 10;

        System.out.print("Modified Original: ");
        c1.display();

        System.out.print("Copied Object: ");
        c3.display();
    }
}

