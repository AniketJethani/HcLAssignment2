package miniProject1;

public abstract class BankAccount {
    protected int accountNo;
    protected String holderName;
    protected double balance;
    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void deposit(double amount, String mode) {
        balance += amount;
        System.out.println("Deposited via " + mode);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance)
            throw new Exception("Insufficient Balance");
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    abstract void calculateInterest();

    public String toFileString() {
        return accountNo + "," + holderName + "," + balance + "," + this.getClass().getSimpleName();
    }
    
}
