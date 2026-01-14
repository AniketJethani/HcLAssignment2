package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        EmployeeManager manager = new EmployeeManager();

	        Pattern idPattern = Pattern.compile("EMP\\d+");
	        Pattern namePattern = Pattern.compile("[A-Za-z ]+");

	        while (true) {
	            System.out.println("\n--- Employee Record System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Display Employees");
	            System.out.println("3. Search Employee");
	            System.out.println("4. Remove Employee");
	            System.out.println("5. Null Key/Value Demo");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");

	            try {
	                int choice = Integer.parseInt(sc.nextLine());

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter Employee ID (EMP123): ");
	                        String id = sc.nextLine();
	                        if (!idPattern.matcher(id).matches()) {
	                            throw new IllegalArgumentException("Invalid Employee ID");
	                        }

	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();
	                        if (!namePattern.matcher(name).matches()) {
	                            throw new IllegalArgumentException("Invalid Name");
	                        }

	                        System.out.print("Enter Salary: ");
	                        double salary = Double.parseDouble(sc.nextLine());

	                        manager.addEmployee(new Employee(id, name, salary));
	                        break;

	                    case 2:
	                        manager.displayEmployees();
	                        break;

	                    case 3:
	                        System.out.print("Enter Employee ID to search: ");
	                        String searchId = sc.nextLine();
	                        Employee e = manager.searchEmployee(searchId);
	                        System.out.println(e != null ? e : "Employee not found.");
	                        break;

	                    case 4:
	                        System.out.print("Enter Employee ID to remove: ");
	                        String removeId = sc.nextLine();
	                        System.out.println(
	                                manager.removeEmployee(removeId)
	                                        ? "Employee removed successfully."
	                                        : "Employee not found."
	                        );
	                        break;

	                    case 5:
	                        manager.demonstrateNullSupport();
	                        break;

	                    case 6:
	                        System.out.println("Exiting program...");
	                        sc.close();
	                        return;

	                    default:
	                        System.out.println("Invalid choice.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter numeric values correctly.");
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }

	}

}
