package question4;

public interface EmployeeOperations {
   void addEmployee(Employee e);
   void displayEmployees();
   Employee searchEmployee(String empId);
   boolean removeEmployee(String empId);
}
