package project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagementSystem {
	static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    
    static boolean login() {
        System.out.print("Enter Username: ");
        String user = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        return user.equals("admin") && pass.equals("admin123");
    }

    
    static void addStudent() {
        try {
            System.out.print("Enter Eno: ");
            int eno = sc.nextInt();

            for (Student s : students) {
                if (s.eno == eno)
                    throw new DuplicateEnoException("❌ Student Eno must be unique");
            }

            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();
            if (branch.isEmpty())
                throw new InvalidDataException("❌ Branch cannot be empty");

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();
            if (per <= 0)
                throw new InvalidDataException("❌ Percentage must be positive");

            students.add(new Student(eno, name, branch, sem, per));
            System.out.println("✅ Student Added Successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found");
            return;
        }
        System.out.println("Eno\tName\tBranch\tSem\tPercentage");
        for (Student s : students)
            System.out.println(s);
    }

  
    static void searchStudent() {
        System.out.print("Enter Eno to Search: ");
        int eno = sc.nextInt();
        for (Student s : students) {
            if (s.eno == eno) {
                System.out.println("Student Found:");
                System.out.println(s);
                return;
            }
        }
        System.out.println("❌ Student not found");
    }

   
    static void updateBranch() {
        System.out.print("Enter Eno: ");
        int eno = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.eno == eno) {
                System.out.print("Enter New Branch: ");
                String branch = sc.nextLine();
                if (branch.isEmpty()) {
                    System.out.println("❌ Branch cannot be empty");
                    return;
                }
                s.branch = branch;
                System.out.println("✅ Branch Updated Successfully");
                return;
            }
        }
        System.out.println("❌ Student not found");
    }

    
    static void deleteStudent() {
        System.out.print("Enter Eno to Delete: ");
        int eno = sc.nextInt();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().eno == eno) {
                it.remove();
                System.out.println("✅ Student Deleted");
                return;
            }
        }
        System.out.println("❌ Student not found");
    }

  
    static void sortStudents() {
        students.sort(Comparator.comparingInt(s -> s.eno));
        System.out.println("✅ Students Sorted by Eno");
        displayStudents();
    }

    
    public static void main(String[] args) {

        System.out.println("===== LOGIN =====");
        if (!login()) {
            System.out.println("❌ Invalid Login. Access Denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Eno");
            System.out.println("4. Update Student Branch");
            System.out.println("5. Delete Student by Eno");
            System.out.println("6. Display Sorted Students");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> updateBranch();
                case 5 -> deleteStudent();
                case 6 -> sortStudents();
                case 7 -> System.out.println("🚪 Exiting Program...");
                default -> System.out.println("❌ Invalid choice");
            }
        } while (choice != 7);
    }
	
}
