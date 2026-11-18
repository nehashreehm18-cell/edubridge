


class University {
    String universityName = "VTU";

    // Static Nested Class
    static class Department {
        String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    // Non-static Inner Class
    class Faculty {
        String facultyName;
        String designation;

        Faculty(String name, String desig) {
            facultyName = name;
            designation = desig;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }

    // Outer class method
    void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating University object
        University u = new University();

        // Creating static nested class object
        University.Department d =
                new University.Department("Computer Science");

        // Creating non-static inner class object
        University.Faculty f =
                u.new Faculty("Rahul", "Professor");

        // Displaying details
        u.displayUniversity();
        d.displayDepartment();
        f.displayFaculty();
    }
}
