
class Point {
    int x, y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display coordinates
    void display() {
        System.out.println("X Coordinate: " + x);
        System.out.println("Y Coordinate: " + y);
    }
}

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);

        p1.display();
    }
}

