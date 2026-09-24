import java.util.Scanner;

class Account {
  int Account_Number;
  String Account_Holder;
  double Balance;
  String Account_Type;

// Parameterized Constructor
  Account(int Account_Number, String Account_Holder, double Balance, String Account_Type) {
    this.Account_Number = Account_Number;
    this.Account_Holder = Account_Holder;
    this.Balance = Balance;
    this.Account_Type = Account_Type;
  }

// deposit method 
  void deposit(double amount) {

    if(amount>0) {
    Balance += amount;
    System.out.println(amount + "is deposited into your account\n");
    System.out.println("Current account balance is:" + Balance);

    } else {
      System.out.println("Invalid amount! Enter again.");
    }
  }

// withdraw method
  void withdraw(double amount) {

    if(amount>0 && amount<=Balance) {
    Balance -= amount;
    System.out.println(amount + "is withdrawn from your account");
    System.out.println("Current account balance is:" + Balance);
    } else {
      System.out.println("Invalid amount! Enter again.");
    }
  }

// transfer method
  void transfer(Account reciever, double amount) {

    if (amount > 0 && amount <= Balance) {
      Balance -= amount;
      reciever.Balance += amount;

      System.out.println("Amount Transferred: " + amount);
    } else {
        System.out.println("Transfer Failed!");
    }
  }

// Display Account Details
  void displayAccountDetails() {

    System.out.println("\n----- Account Details -----");
    System.out.println("Account Number : " + Account_Number);
    System.out.println("Holder Name    : " + Account_Holder);
    System.out.println("Balance        : " + Balance);
    System.out.println("Account Type   : " + Account_Type);
    }
}

// ==================== SAVINGS ACCOUNT ====================

class SavingsAccount extends Account {

  double interestRate;

  // Constructor
  SavingsAccount(int Account_Number, String Account_Holder, double Balance, double interestRate) {

    super(Account_Number, Account_Holder, Balance, "Savings");
    this.interestRate = interestRate;
    }

// Calculate Interest
  void calculateInterest() {

    double interest = Balance * interestRate / 100;
    Balance += interest;

    System.out.println("Interest Added: " + interest);
  }
}

// ==================== CURRENT ACCOUNT ====================

class CurrentAccount extends Account {

  double overdraftLimit;

  // Constructor
  CurrentAccount(int Account_Number, String Account_Holder, double Balance, double overdraftLimit) {

    super(Account_Number, Account_Holder, Balance, "Current");
    this.overdraftLimit = overdraftLimit;
  }

  // Method Overriding
  @Override
  void withdraw(double amount) {

    if (amount > 0 && amount <= Balance + overdraftLimit) {

      Balance -= amount;

      System.out.println("Amount Withdrawn: " + amount);

    } else {
      System.out.println("Overdraft Limit Exceeded!");
      }
  }
}

// ==================== MAIN CLASS ====================

public class BankAccountManagementSystem {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

// ---------- SAVINGS ACCOUNT ----------

  System.out.println("===== SAVINGS ACCOUNT =====");

  System.out.print("Enter Account Number: ");
  int sNumber = sc.nextInt();
  sc.nextLine();

  System.out.print("Enter Account Holder Name: ");
  String sName = sc.nextLine();

  System.out.print("Enter Initial Balance: ");
  double sBalance = sc.nextDouble();

  System.out.print("Enter Interest Rate: ");
  double rate = sc.nextDouble();

  SavingsAccount savings = new SavingsAccount(sNumber, sName, sBalance, rate);


// ---------- CURRENT ACCOUNT ----------

  System.out.println("\n===== CURRENT ACCOUNT =====");

  System.out.print("Enter Account Number: ");
  int cNumber = sc.nextInt();
  sc.nextLine();

  System.out.print("Enter Account Holder Name: ");
  String cName = sc.nextLine();

  System.out.print("Enter Initial Balance: ");
  double cBalance = sc.nextDouble();

  System.out.print("Enter Overdraft Limit: ");
  double overdraft = sc.nextDouble();

  CurrentAccount current = new CurrentAccount(cNumber, cName, cBalance, overdraft);

// ---------- MENU ----------

  int choice;

  do {

    System.out.println("\n===================BANK ACCOUNT MENU===================");

    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Transfer");
    System.out.println("4. Calculate Interest");
    System.out.println("5. Display Savings Account");
    System.out.println("6. Display Current Account");
    System.out.println("7. Exit");

    System.out.println("==============================");

    System.out.print("Enter your choice: ");
    choice = sc.nextInt();


// ---------- SWITCH CASE ----------

    switch (choice) {

      case 1:

        System.out.println("\n1. Savings Account");
        System.out.println("2. Current Account");

        System.out.println("Choose Account: ");
        int depositAccount = sc.nextInt();

        System.out.println("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        switch (depositAccount) {

          case 1:
            savings.deposit(depositAmount);
            break;

          case 2:
            current.deposit(depositAmount);
            break;

          default:
            System.out.println("Invalid Account!");
          }
          break;

          case 2:

            System.out.println("\n1. Savings Account");
            System.out.println("2. Current Account");

            System.out.print("Choose Account: ");
            int withdrawAccount = sc.nextInt();

            System.out.print("Enter Withdrawal Amount: ");
            double withdrawAmount = sc.nextDouble();

            switch (withdrawAccount) {

              case 1:
                savings.withdraw(withdrawAmount);
                break;

              case 2:
                current.withdraw(withdrawAmount);
                break;

              default:
                System.out.println("Invalid Account!");
              }
              break;

          case 3:

            System.out.println("\n1. Savings -> Current");
            System.out.println("2. Current -> Savings");

            System.out.print("Choose Transfer: ");
            int transferChoice = sc.nextInt();

            System.out.print("Enter Transfer Amount: ");
            double transferAmount = sc.nextDouble();

            switch (transferChoice) {

              case 1:
                savings.transfer(current, transferAmount);
                break;

              case 2:
                current.transfer(savings, transferAmount);
                break;

              default:
                System.out.println("Invalid Choice!");
              }
              break;

          case 4:

            savings.calculateInterest();
            break;

          case 5:

            savings.displayAccountDetails();
            break;

          case 6:

            current.displayAccountDetails();
            break;

           case 7:

            System.out.println("\nThank you for using the Bank System!");
            break;

          default:

            System.out.println("Invalid Choice!");
    }
  } while (choice != 7);
  
  sc.close();
  }
}
