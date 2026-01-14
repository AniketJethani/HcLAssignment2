package question5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class UniversityManager implements StudentOperations {
	Map<String,Student>studentMap=new HashMap<>();
	Vector<Student>studentVector=new Vector<>();
	Stack<Student> recentStudents=new Stack<>();
	Set<String>courses=new HashSet<>();
	

	@Override
	public void addStudent(Student s) {
		if(studentMap.containsKey(s.id)) {
			throw new IllegalArgumentException("Duplicate Student ID not allowed");
		}
		studentMap.put(s.id, s);
		studentVector.add(s);
		recentStudents.push(s);
		courses.add(s.course);
		System.out.println("Student added successfully");
	}

	@Override
	public void displayStudents() {
		if (studentMap.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        studentMap.values().forEach(System.out::println);
    }
		
	

	@Override
	public Student searchStudent(String id) {
		
		return studentMap.get(id);
	}

	@Override
	public boolean removeStudent(String id) {
		 Student removed = studentMap.remove(id);
	        return removed != null;
		
	}
	 public void sortByMarks() {
	        List<Student> list = new ArrayList<>(studentMap.values());
	        list.sort(Comparator.comparingInt(Student::getMarks).reversed());
	        list.forEach(System.out::println);
	    }

	    // Convert HashMap to TreeMap
	    public void convertToTreeMap() {
	        TreeMap<String, Student> treeMap = new TreeMap<>(studentMap);
	        System.out.println("TreeMap (Sorted by Student ID):");
	        treeMap.values().forEach(System.out::println);
	    }

	    // Count students course-wise
	    public void countCourseWise() {
	        Map<String, Integer> countMap = new HashMap<>();
	        for (Student s : studentMap.values()) {
	            countMap.put(s.course, countMap.getOrDefault(s.course, 0) + 1);
	        }
	        countMap.forEach((k, v) -> System.out.println(k + " → " + v));
	    }

	    // Display all unique courses
	    public void displayCourses() {
	        courses.forEach(System.out::println);
	    }

}
