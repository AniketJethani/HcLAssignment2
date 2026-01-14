package question4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager implements EmployeeOperations {
 private Map<String,Employee>map=new HashMap<>();
//private Map<String, Employee> map = new Hashtable<>();
 // private Map<String, Employee> map = new TreeMap<>();
	
	public void addEmployee(Employee e) {
		map.put(e.getEmpId(), e);
		System.out.println("Employee added successfully");
		
	}


	public void displayEmployees() {
		if(map.isEmpty()) {
			System.out.println("No employee record found");
			return;
		}
		for (Map.Entry<String, Employee> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
	}

	
	public Employee searchEmployee(String empId) {
		
		return map.get(empId);
	}

	
	public boolean removeEmployee(String empId) {
		
		return map.remove(empId)!=null;
	}
	 // Demonstration of null key & value
    public void demonstrateNullSupport() {
        System.out.println("\n--- Null Support Demonstration ---");

        try {
            map.put(null, null);
            System.out.println("Null key & value allowed.");
        } catch (Exception e) {
            System.out.println("Null key/value NOT allowed: " + e);
        }
    }

}
