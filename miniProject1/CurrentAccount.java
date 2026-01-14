package miniProject1;

public class CurrentAccount extends BankAccount {
	 public CurrentAccount(int acc, String name, double bal) {
	        super(acc, name, bal);
	    }

	    @Override
	    void calculateInterest() {
	        System.out.println("No interest for Current Account.");
	    }
}
