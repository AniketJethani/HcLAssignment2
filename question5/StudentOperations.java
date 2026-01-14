package question5;

public interface StudentOperations {
	void addStudent(Student s);
    void displayStudents();
    Student searchStudent(String id);
    boolean removeStudent(String id);

}
