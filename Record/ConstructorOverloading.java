class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1: No arguments
    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Available";
    }

    // Constructor 2: Name and ID
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Available";
    }

    // Constructor 3: Name, ID, Designation and Salary
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Pending";
    }

    // Constructor 4: All parameters
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name              : " + name);
        System.out.println("ID                : " + id);
        System.out.println("Designation       : " + designation);
        System.out.println("Salary            : " + salary);
        System.out.println("Promotion Status  : " + promotionStatus);
        System.out.println("----------------------------------");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        // Calling different overloaded constructors
        Employee e1 = new Employee();

        Employee e2 = new Employee("Ravi", 101);

        Employee e3 = new Employee(
            "Sita", 102, "Manager", 60000
        );

        Employee e4 = new Employee(
            "Kiran", 103, "Senior Developer", 75000, "Promoted"
        );

        // Display employee details
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}