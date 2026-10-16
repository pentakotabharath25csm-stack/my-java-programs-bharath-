class Account {
    String accountNumber;
    String holderName;
    double balance;
    String accountType;
    // Constructor initializes account details
    Account(String number, String name, double balance, String type) {
        this.accountNumber = number;
        this.holderName = name;
        this.balance = balance;
        this.accountType = type;
    }
    // Adds the given amount to the account
    void deposit(double amount) {
        balance += amount;
    }
    // Withdraws only when enough balance is available
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }
    // Transfers money from this account to another account
    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }
    }
    // Displays basic account information
    void displayAccountDetails() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}
// SavingsAccount inherits all features of Account
class SavingsAccount extends Account {
    double interestRate;
    // Constructor initializes savings account with interest rate
    SavingsAccount(String number, String name, double balance, double interestRate) {
        super(number, name, balance, "Savings");
        this.interestRate = interestRate;
    }
    // Calculates simple interest on current balance
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added : " + interest);
    }
}
// CurrentAccount inherits Account and supports overdraft
class CurrentAccount extends Account {
    double overdraftLimit;
    // Constructor initializes current account with overdraft limit
    CurrentAccount(String number, String name, double balance, double overdraftLimit) {
        super(number, name, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }
    // Overriding withdraw() to allow overdraft
    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded!");
    }
}
// Main class: creates objects and performs transactions
public class BankDemo {
    public static void main(String[] args) {
        // Creating Savings and Current account objects
        SavingsAccount savings =
                new SavingsAccount("S101", "Bharath", 20000, 5);
        CurrentAccount current =
                new CurrentAccount("C201", "Bunny", 15000, 3000);
        // Displaying initial account details
        System.out.println("===== BEFORE TRANSACTIONS =====");
        savings.displayAccountDetails();
        current.displayAccountDetails();
        // Performing deposit and withdrawal operations
        savings.deposit(2000);
        savings.withdraw(1000);
        current.deposit(3000);
        current.withdraw(9000);   // Uses overdraft facility
        // Adding interest to savings account
        savings.calculateInterest();
        // Transferring money from savings to current account
        savings.transfer(current, 2000);
        // Displaying final account details
        System.out.println("\n===== AFTER TRANSACTIONS =====");
        savings.displayAccountDetails();
        current.displayAccountDetails();
        // Showing final balances
        System.out.println("\nFinal Savings Balance : " + savings.balance);
        System.out.println("Final Current Balance : " + current.balance);
    }
}                                                                                                                                                                    Make a pdf using this input.the pdf should contain question,step-by-step process, algorithm,uml diagrams,code,sample output in it 
