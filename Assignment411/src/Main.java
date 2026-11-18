
import java.util.Scanner;

class Student {
    String USN, Name, Branch;
    long Phone;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.next();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Branch: ");
        Branch = sc.next();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLong();
    }

    void display() {
        System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].getDetails();
        }

        System.out.println("\nUSN\tName\tBranch\tPhone");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
