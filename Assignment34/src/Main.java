
class   Student {

    private String usn;
    private String name;
    private int m1, m2, m3;

    static int count = 0;
    final int MAX_MARKS = 100;

    // Constructor
    Student(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        if (validate(m1) && validate(m2) && validate(m3)) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        count++;
    }

    // Validation method
    boolean validate(int marks) {
        return marks >= 0 && marks <= MAX_MARKS;
    }

    // Getter methods
    String getUSN() {
        return usn;
    }

    String getName() {
        return name;
    }

    int getM1() {
        return m1;
    }

    int getM2() {
        return m2;
    }

    int getM3() {
        return m3;
    }

    // Calculate total
    int calculateTotal() {
        return m1 + m2 + m3;
    }

    // Calculate average
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display basic details
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    // Overloaded display method
    void display(boolean result) {
        display();
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    // Return a new object containing result summary
    Student getResultSummary() {
        return new Student(usn, name, m1, m2, m3);
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Students: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("1AB23CS001", "Ram", 85, 90, 80);

        System.out.println("Student Details:");
        s1.display();

        System.out.println("\nStudent Result:");
        s1.display(true);

        Student s2 = s1.getResultSummary();

        System.out.println("\nCopied Result:");
        s2.display(true);

        System.out.println();
        Student.displayCount();
    }
}

//Challenge: Why use static and final?
//
//1. Why is static suitable for student count?
//
//Static variables are shared by all objects.
//Only one copy of count is maintained.
//It keeps track of the total number of students created.
//
//2. Why is final used for maximum marks?
//
//The final keyword makes a variable constant after initialization.
//Maximum marks should always remain 100.
//It prevents accidental modification.