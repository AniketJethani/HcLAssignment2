package question5;

public class Student {
    String id;
    String name;
    String course;
    int marks;

    public Student(String id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return id + " | " + name + " | " + course + " | Marks: " + marks;
    }
}
