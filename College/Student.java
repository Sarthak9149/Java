package college;

public class Student {
    String name;
    String branch;

    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String toString() {
        return "Name: " + name + ", Branch: " + branch;
    }

    public showName() {
        System.out.println("Name: " + name);
    }

    public void display() {
        System.out.println(this.toString());
    }
}
