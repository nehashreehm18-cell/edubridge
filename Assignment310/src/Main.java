
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        System.out.println("Person Constructor");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double basicSalary;

    // Parameterized constructor
    Employee(String name, int age, int id, double salary) {
        super(name, age);
        System.out.println("Employee Constructor");
        employeeId = id;
        basicSalary = salary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    // Parameterized constructor
    Manager(String name, int age, int id, double salary,
            String department, double bonus) {

        super(name, age, id, salary);
        System.out.println("Manager Constructor");
        this.department = department;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager(
                "Rahul", 30, 101, 40000, "IT", 10000
        );

        System.out.println("\nManager Details:");
        m.display();
    }
}
