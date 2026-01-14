package miniProject2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private final String FILE = "employees.txt";

    public EmployeeManager() {
        loadFromFile();
    }

    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(Employee.fromString(line));
            }
        } catch (IOException ignored) {}
    }

    private void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Employee e : employees) {
                pw.println(e);
            }
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }

    public void addEmployee(Employee e) throws ValidationException {
        for (Employee emp : employees) {
            if (emp.getId() == e.getId())
                throw new ValidationException("Employee ID must be unique");
        }
        employees.add(e);
        saveToFile();
        System.out.println("Employee added successfully");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        employees.forEach(System.out::println);
    }

    public Employee searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public void updateSalary(int id, double salary) throws ValidationException {
        if (salary <= 0)
            throw new ValidationException("Salary must be positive");

        Employee e = searchEmployee(id);
        if (e == null)
            throw new ValidationException("Employee not found");

        e.setSalary(salary);
        saveToFile();
        System.out.println("Salary updated successfully");
    }

    public void deleteEmployee(int id) throws ValidationException {
        Employee e = searchEmployee(id);
        if (e == null)
            throw new ValidationException("Employee not found");

        employees.remove(e);
        saveToFile();
        System.out.println("Employee deleted successfully");
    }

    public void displaySortedEmployees() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }

    public void displayDepartments() {
        Set<String> departments = new HashSet<>();
        for (Employee e : employees) {
            departments.add(e.getDepartment());
        }
        departments.forEach(System.out::println);
    }
}
