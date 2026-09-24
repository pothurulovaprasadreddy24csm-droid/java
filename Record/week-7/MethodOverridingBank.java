import java.util.Scanner;

// Customer class
class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }
}

// Account class
class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// RBI - Base Class
class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

// SBI - Derived Class
class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI - Derived Class
class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

// PNB - Derived Class
class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

// Main class
public class MethodOverridingBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bank = sc.nextLine();

        // Dynamic polymorphism
        RBI rbi;

        if (bank.equalsIgnoreCase("SBI")) {
            rbi = new SBI();
        }
        else if (bank.equalsIgnoreCase("ICICI")) {
            rbi = new ICICI();
        }
        else if (bank.equalsIgnoreCase("PNB")) {
            rbi = new PNB();
        }
        else {
            rbi = new RBI();
        }

        System.out.println(bank + " rate of interest is : "
                           + rbi.getRateOfInterest() + "%");

        sc.close();
    }
}
