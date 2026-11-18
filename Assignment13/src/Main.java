
class Circle {
    double radius;

    // Method to calculate area
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate circumference
    void calculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 5;

        c1.calculateArea();
        c1.calculateCircumference();
    }
}

