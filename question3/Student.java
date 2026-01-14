package question3;

public class Student {
private int rollNo;
private String name;
private int age;


public Student(int rollNo,String name,int age) {
	this.rollNo=rollNo;
	this.name=name;
	this.age=age;
}

public int getRollNo() {
	return rollNo;
}

@Override
public String toString() {
	
	return "Roll No: "+rollNo+" ,Name:"+name+" ,Age: "+age;
}



}
