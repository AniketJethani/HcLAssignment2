package question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager implements StudentOperations {
     private List<Student>students=new ArrayList();
     //private List<Student>students=new Vector<>()
;	@Override
	public void addStudent(Student stu) {
		students.add(stu);
		System.out.println("Student added successfully");
		
	}

	@Override
	public void displayStudent() {
		if(students.isEmpty()) {
			System.out.println("No record found");
			return;
		}
		for(Student s:students) {
			System.out.println(s);
		}
	}

	@Override
	public Student searchStudent(int rollNo) {
		for(Student s:students) {
			if(s.getRollNo()==rollNo) {
				return s;
			}
		}
		return null;
	}

	@Override
	public boolean removeStudent(int rollNo) {
		Iterator<Student>it=students.iterator();
		while(it.hasNext()) {
			if(it.next().getRollNo()==rollNo) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	

}
