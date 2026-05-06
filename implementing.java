import college.Student; 

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rakshit", "Computer Science");
        
        s1.display();

        String info = s1.toString();
        System.out.println(info);

        s1.showName();
    }
}