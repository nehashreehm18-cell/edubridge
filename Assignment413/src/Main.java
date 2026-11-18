
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int w) {
        width = w;
    }

    public void resizeHeight(int h) {
        height = h;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        System.out.println("Original Rectangle:");
        r.display();

        r.resizeWidth(20);
        r.resizeHeight(15);

        System.out.println("Resized Rectangle:");
        r.display();
    }
}
