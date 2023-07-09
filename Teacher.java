import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int no, String na, double sal, String add) {
        this.empid = no;
        this.name = na;
        this.salary = sal;
        this.address = add;
    }
}

public class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub) {
        super(no, na, sal, add);
        this.department = dep;
        this.subject = sub;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of employees: ");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();

        Teacher[] arr = new Teacher[num];

        for (int i = 0; i < num; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Employee ID: ");
            int empid = sc.nextInt();
            System.out.print("Enter Employee Name: ");
            String name = sc.next();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Address: ");
            String address = sc.next();
            System.out.print("Enter Department: ");
            String department = sc.next();
            System.out.print("Enter Subject: ");
            String subject = sc.next();

            arr[i] = new Teacher(empid, name, salary, address, department, subject);
        }

        System.out.println("\n********Information of all employees************");
        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.println("\n" + j + ").");
            arr[i].display();
        }

        sc1.close();
    }
}
