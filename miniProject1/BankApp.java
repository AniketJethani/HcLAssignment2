package miniProject1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankApp {

	
		static final String FILE_NAME = "accounts.txt";

	    public static void saveToFile(BankAccount acc) throws IOException {
	        FileWriter fw = new FileWriter(FILE_NAME, true);
	        fw.write(acc.toFileString() + "\n");
	        fw.close();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BankAccount account = null;

	        try {
	            System.out.print("Enter Account No: ");
	            int accNo = sc.nextInt();

	            sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Initial Balance: ");
	            double bal = sc.nextDouble();

	            System.out.print("1. Savings  2. Current : ");
	            int type = sc.nextInt();

	            
	            if (type == 1)
	                account = new SavingAccount(accNo, name, bal);
	            else
	                account = new CurrentAccount(accNo, name, bal);

	            saveToFile(account);

	            while (true) {
	                System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Details 5.Interest 6.Exit");
	                int choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Amount: ");
	                        account.deposit(sc.nextDouble());
	                        break;

	                    case 2:
	                        System.out.print("Amount: ");
	                        account.withdraw(sc.nextDouble());
	                        break;

	                    case 3:
	                        account.showBalance();
	                        break;

	                    case 4:
	                        account.displayDetails();
	                        break;

	                    case 5:
	                        account.calculateInterest();
	                        break;

	                    case 6:
	                        System.out.println("Thank you!");
	                        sc.close();
	                        return;
	                }
	            }

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	    }
}


