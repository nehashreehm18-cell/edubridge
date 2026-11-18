
class Person {

    private String name;
    private int age;

    static int count = 0;

    static final String COLLEGE_NAME = "ABC College";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getCount() {
        return count;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method overloading
    public void displayDetails(String heading) {
        System.out.println("\n" + heading);
        displayDetails();
    }
}

// Student class
class Student extends Person {

    private int rollNo;
    private String course;

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Faculty class
class Faculty extends Person {

    private int facultyId;
    private String subject;

    Faculty(String name, int age, int facultyId, String subject) {
        super(name, age);
        this.facultyId = facultyId;
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Faculty Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}

// Administrator class
class Administrator extends Person {

    private int adminId;
    private String office;

    Administrator(String name, int age, int adminId, String office) {
        super(name, age);
        this.adminId = adminId;
        this.office = office;
    }

    @Override
    public void displayDetails() {
        System.out.println("Administrator Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Admin ID: " + adminId);
        System.out.println("Office: " + office);
    }
}

// College class with nested class
class College {

    static class Department {
        private String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Student("Rahul", 20, 101, "CSE");
        people[1] = new Faculty("Arun", 35, 201, "Java");
        people[2] = new Administrator("Ravi", 40, 301, "Office");

        System.out.println("College: " + Person.COLLEGE_NAME);

        // Runtime polymorphism
        for (Person p : people) {
            p.displayDetails();
            System.out.println("-------------------");
        }

        // Method overloading
        people[0].displayDetails("Student Information");

        // Nested class object
        College.Department d =
                new College.Department("Computer Science");

        d.displayDepartment();

        // Display total people
        System.out.println("Total People: " + Person.getCount());
    }
}
