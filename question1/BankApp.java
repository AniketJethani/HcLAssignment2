package question1;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      BankAccount account = new BankAccount(101, "Aniket", 5000);

	        try {
	            account.showCustomerDetails();
	            account.deposit(2000);
	            account.withdraw(1000);
	            account.withdraw(7000); 
	        } catch (InsufficientBalanceException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid Input: " + e.getMessage());
	        } finally {
	            System.out.println("Final Balance: ₹" + account.checkBalance());
	        }
	}

}
