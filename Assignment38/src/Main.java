
class Employee {
    int employeeId;
    String name;
    double basicSalary;

    // Parent class constructor
    Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.basicSalary = salary;
    }

    // Method to calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Permanent Employee
class PermanentEmployee extends Employee {
    double allowance;
    double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {
        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

// Contract Employee
class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hours, double rate) {
        super(id, name, salary);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new PermanentEmployee(
                101, "Rahul", 30000, 5000, 3000);

        employees[1] = new ContractEmployee(
                102, "Arun", 0, 160, 200);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: "
                    + e.calculateSalary());
            System.out.println("--------------------");
        }
    }
}
