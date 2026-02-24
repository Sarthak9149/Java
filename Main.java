class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Rahul", 22);
        Person p2 = new Person("Vaibhav", 25);

        p1.displayInfo();
        p2.displayInfo();

        System.out.println(p1.name + " is " + p1.age + " years old.");
         System.out.println(p2.name + " is " + p2.age + " years old.");
    }
}