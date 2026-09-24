import java.util.Scanner;

// Interface
interface Salary {
    void displaySalary();
}

// Regular Employee
class RegularEmployee implements Salary {
    int basicPay = 25000;
    int hra = 15000;
    int ta = 5000;

    public void displaySalary() {
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Contract Employee
class ContractEmployee implements Salary {
    int basicPay = 12000;
    int hra = 0;
    int ta = 3000;

    public void displaySalary() {
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Main class
public class EmployeeSalaryDetailsInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        Salary employee;

        if (id.charAt(0) == 'R' || id.charAt(0) == 'r') {
            employee = new RegularEmployee();
        }
        else if (id.charAt(0) == 'C' || id.charAt(0) == 'c') {
            employee = new ContractEmployee();
        }
        else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        employee.displaySalary();

        sc.close();
    }
}
