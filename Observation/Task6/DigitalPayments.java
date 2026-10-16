interface PaymentService {
  
    void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException;

    double checkBalance();
}

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {

    InvalidUPIException(String message) {
        super(message);
    }
}


class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}


class Wallet {

    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    Wallet(String name, String mobile, String upi, double balance) {
        this.userName = name;
        this.mobileNumber = mobile;
        this.upiId = upi;
        this.balance = balance;
    }

    void addMoney(double amount) {
        if (amount > 0)
            balance += amount;
    }

    double getBalance() {
        return balance;
    }

    void deduct(double amount) {
        balance -= amount;
    }

    String getUpiId() {
        return upiId;
    }

    void displayWalletDetails() {
        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name  : " + userName);
        System.out.println("Mobile     : " + mobileNumber);
        System.out.println("UPI ID     : " + upiId);
        System.out.println("Balance    : ₹" + balance);
    }
}

class UPIPayment implements PaymentService {

    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {

        if (!upiId.contains("@") || !upiId.equals(wallet.getUpiId()))
            throw new InvalidUPIException("Invalid UPI ID!");

        if (amount <= 0)
            throw new InvalidAmountException("Invalid payment amount!");

        if (amount > wallet.getBalance())
            throw new InsufficientBalanceException(
                    "Insufficient wallet balance!");

        wallet.deduct(amount);

        System.out.println("Payment of ₹" + amount + " successful!");
    }

    @Override
    public double checkBalance() {
        return wallet.getBalance();
    }
}


public class DigitalPayment {

    public static void main(String[] args) {

        Wallet wallet = new Wallet(
                "Bharath",
                "9391866898",
                "bharath@upi",
                2000
        );

        PaymentService payment = new UPIPayment(wallet);

        wallet.addMoney(1000);

        try {
            payment.pay("mohana@upi", 1500);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {

      
            System.out.println("Transaction process completed.");
        }

        wallet.displayWalletDetails();
        System.out.println("Final Balance : ₹" + payment.checkBalance());
    }
}
