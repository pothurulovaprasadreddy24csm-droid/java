package observation.exp05;
import java.util.Scanner;

// ================= CUSTOM EXCEPTIONS =================

// Insufficient Balance Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Invalid UPI Exception
class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

// Invalid Amount Exception
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}


// ================= INTERFACE =================

interface PaymentService {

    void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}


// ================= WALLET CLASS =================

class Wallet {

    // Private variables for encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    public Wallet(String userName, String mobileNumber,
                  String upiId, double balance) {

        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money
    public void addMoney(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Amount must be greater than zero."
            );
        }

        balance = balance + amount;

        System.out.println(
            "₹" + amount + " added successfully."
        );
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deduct money
    public void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Display wallet details
    public void displayWalletDetails() {

        System.out.println("\n===== WALLET DETAILS =====");

        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : ₹" + balance);
    }
}


// ================= UPI PAYMENT CLASS =================

class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Make payment
    public void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        if (upiId == null ||
            !upiId.contains("@") ||
            upiId.startsWith("@") ||
            upiId.endsWith("@")) {

            throw new InvalidUPIException(
                "Invalid UPI ID."
            );
        }

        // Validate amount
        if (amount <= 0) {

            throw new InvalidAmountException(
                "Payment amount must be greater than zero."
            );
        }

        // Check balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException(
                "Insufficient wallet balance."
            );
        }

        // Deduct amount
        wallet.deductMoney(amount);

        System.out.println("\n===== PAYMENT SUCCESSFUL =====");
        System.out.println("Paid To : " + upiId);
        System.out.println("Amount  : ₹" + amount);
    }

    // Check balance
    public void checkBalance() {

        System.out.println(
            "Available Balance: ₹" +
            wallet.getBalance()
        );
    }
}


// ================= MAIN CLASS =================

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- CREATE WALLET --------

        System.out.println("===== CREATE WALLET =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter your UPI ID: ");
        String myUpi = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create Wallet object
        Wallet wallet = new Wallet(
            name,
            mobile,
            myUpi,
            balance
        );

        // Create UPIPayment object
        UPIPayment payment = new UPIPayment(wallet);

        int choice;

        // ================= MENU =================

        while (true) {

            System.out.println("\n==============================");
            System.out.println("       DIGITAL WALLET");
            System.out.println("==============================");
            System.out.println("1. Add Money");
            System.out.println("2. Make UPI Payment");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Wallet Details");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // -------- CASE 1 --------
                case 1:

                    System.out.print(
                        "Enter amount to add: "
                    );

                    double addAmount = sc.nextDouble();

                    try {

                        wallet.addMoney(addAmount);

                    }
                    catch (InvalidAmountException e) {

                        System.out.println(
                            "Transaction Failed: " +
                            e.getMessage()
                        );
                    }

                    break;


                // -------- CASE 2 --------
                case 2:

                    sc.nextLine();

                    System.out.print(
                        "Enter receiver UPI ID: "
                    );

                    String receiverUpi = sc.nextLine();

                    System.out.print(
                        "Enter payment amount: "
                    );

                    double paymentAmount = sc.nextDouble();

                    try {

                        payment.pay(
                            receiverUpi,
                            paymentAmount
                        );

                    }
                    catch (InvalidUPIException e) {

                        System.out.println(
                            "Transaction Failed: " +
                            e.getMessage()
                        );
                    }
                    catch (InvalidAmountException e) {

                        System.out.println(
                            "Transaction Failed: " +
                            e.getMessage()
                        );
                    }
                    catch (InsufficientBalanceException e) {

                        System.out.println(
                            "Transaction Failed: " +
                            e.getMessage()
                        );
                    }
                    finally {

                        System.out.println(
                            "Transaction processing completed."
                        );
                    }

                    break;


                // -------- CASE 3 --------
                case 3:

                    payment.checkBalance();

                    break;


                // -------- CASE 4 --------
                case 4:

                    wallet.displayWalletDetails();

                    break;


                // -------- CASE 5 --------
                case 5:

                    System.out.println(
                        "\nThank you for using Digital Wallet!"
                    );

                    sc.close();

                    return;


                // -------- INVALID CHOICE --------
                default:

                    System.out.println(
                        "Invalid choice! Please enter 1 to 5."
                    );
            }
        }
    }
}
