package miniProject1;

public class SavingAccount extends BankAccount {

	public SavingAccount(int accountNo, String holderName, double balance) {
		super(accountNo, holderName, balance);
		
	}

	@Override
	void calculateInterest() {
		double interest = balance * 0.04;
        balance += interest;
        System.out.println("Savings Interest Added: " + interest);
		
	}

}
