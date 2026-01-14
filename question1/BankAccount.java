package question1;

public class BankAccount implements BankOperation, CustomerOperations {
 
	private int accNo;
	private String customerName;
	private double balance;
	
	public BankAccount(int accNo, String customerName,double balance) {
		this.accNo=accNo;
		this.customerName=customerName;
		this.balance=balance;
	}
	
	
	@Override
	public void showCustomerDetails() {
		System.out.println("Customer name "+customerName);
		System.out.println("Account number is" +accNo);
		System.out.println("Balance is "+balance);
		
	}

	@Override
	public void deposit(double amount) {
		if(amount <=0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}
		balance+=amount;
		System.out.println("Amount deposited "+amount);
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Withdrawl amount must be greater than zero");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("Inufficient balance ");
		}
		balance-=amount;
		System.out.println("Amount withdrawn "+amount);
		
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

	
	

}
