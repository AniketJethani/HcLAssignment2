package question3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StudentOperations manager=new StudentManager();

        Pattern rollPattern = Pattern.compile("\\d+");
        Pattern namePattern = Pattern.compile("[A-Za-z ]+");

        while (true) {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter Roll Number: ");
                        String rollInput = sc.nextLine();
                        if (!rollPattern.matcher(rollInput).matches()) {
                            throw new IllegalArgumentException("Invalid Roll Number");
                        }

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        if (!namePattern.matcher(name).matches()) {
                            throw new IllegalArgumentException("Invalid Name");
                        }

                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        manager.addStudent(new Student(Integer.parseInt(rollInput), name, age));
                        break;

                    case 2:
                        manager.displayStudent();
                        break;

                    case 3:
                        System.out.print("Enter Roll Number to search: ");
                        int searchRoll = Integer.parseInt(sc.nextLine());
                        Student s = manager.searchStudent(searchRoll);
                        System.out.println(s != null ? s : "Student not found.");
                        break;

                    case 4:
                        System.out.print("Enter Roll Number to remove: ");
                        int removeRoll = Integer.parseInt(sc.nextLine());
                        System.out.println(
                                manager.removeStudent(removeRoll)
                                        ? "Student removed successfully."
                                        : "Student not found."
                        );
                        break;

                    case 5:
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
