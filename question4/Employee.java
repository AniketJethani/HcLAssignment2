package question4;

public class Employee {
private String name;
private String empId;
private double salary;
public Employee(String name, String empId, double salary) {
	
	this.name = name;
	this.empId = empId;
	this.salary = salary;
}
     public String getEmpId() {
    	 return empId;
     }
	 @Override
	 public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	 }
     

}
