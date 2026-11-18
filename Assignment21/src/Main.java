
class Time {
    int seconds;

    // Default constructor
    Time() {
        seconds = 60;
    }

    // Parameterized constructor
    Time(int s) {
        seconds = s;
    }

    // Method to display time
    void display() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + sec);
    }
}

public class Main {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(3665);

        System.out.println("Default Constructor:");
        t1.display();

        System.out.println("Parameterized Constructor:");
        t2.display();
    }
}

