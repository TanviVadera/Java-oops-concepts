abstract class Account {

    protected int accountNo;
    protected double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount : " + amount);
    }

    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public void display() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Balance        : " + balance);
    }
}

class Savings extends Account {

    private double interestRate;

    public Savings(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;

        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest      : " + interest);
        System.out.println("Balance After Interest : " + (balance + interest));
    }

    @Override
    public void display() {
        System.out.println("\n------ Savings Account ------");
        super.display();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class Current extends Account {

    private double overdraftLimit;

    public Current(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Overdraft Limit Exceeded.");
        }
    }

    @Override
    public void display() {
        System.out.println("\n------ Current Account ------");
        super.display();
        System.out.println("Overdraft Limit : " + overdraftLimit);
    }
}

public class Bank {

    public static void main(String[] args) {

        Savings s = new Savings(101, 10000, 5);

        s.display();
        s.deposit(2000);
        s.withdraw(5000);
        s.checkBalance();
        s.calculateInterest();

        Current c = new Current(201, 5000, 3000);

        c.display();
        c.deposit(1000);
        c.withdraw(7000);
        c.checkBalance();
    }
}