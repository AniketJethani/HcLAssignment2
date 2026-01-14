package project;

public class Student {
	int eno;
    String name;
    String branch;
    int sem;
    double percentage;

    Student(int eno, String name, String branch, int sem, double percentage) {
        this.eno = eno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
        this.percentage = percentage;
    }

    public String toString() {
        return eno + "\t" + name + "\t" + branch + "\t" + sem + "\t" + percentage;
    }
}
