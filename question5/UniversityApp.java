package question5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UniversityApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        UniversityManager manager = new UniversityManager();

        Pattern idPattern = Pattern.compile("STU\\d+");
        Pattern namePattern = Pattern.compile("[A-Za-z ]+");

        while (true) {
            System.out.println("\n--- University Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Convert HashMap to TreeMap");
            System.out.println("7. Count Students Course-wise");
            System.out.println("8. Display All Courses");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Student ID (STU101): ");
                        String id = sc.nextLine();
                        if (!idPattern.matcher(id).matches())
                            throw new IllegalArgumentException("Invalid Student ID");

                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        if (!namePattern.matcher(name).matches())
                            throw new IllegalArgumentException("Invalid Name");

                        System.out.print("Course: ");
                        String course = sc.nextLine();

                        System.out.print("Marks: ");
                        int marks = Integer.parseInt(sc.nextLine());

                        manager.addStudent(new Student(id, name, course, marks));
                        break;

                    case 2:
                        manager.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        Student s = manager.searchStudent(sc.nextLine());
                        System.out.println(s != null ? s : "Student not found");
                        break;

                    case 4:
                        System.out.print("Enter Student ID: ");
                        System.out.println(manager.removeStudent(sc.nextLine())
                                ? "Student removed"
                                : "Student not found");
                        break;

                    case 5:
                        manager.sortByMarks();
                        break;

                    case 6:
                        manager.convertToTreeMap();
                        break;

                    case 7:
                        manager.countCourseWise();
                        break;

                    case 8:
                        manager.displayCourses();
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

	}

}
