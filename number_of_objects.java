class Author {
    String name;
    int age;
    
    // Static counter to keep track of instances
    static int objectCount = 0;

    // Constructor: runs every time 'new Author()' is called
    Author(String name, int age) {
        this.name = name;
        this.age = age;
        // Increment the shared counter
        objectCount++;
    }
}

class Test {
    public static void main(String[] args) {
        // Creating objects
        Author a1 = new Author("George Orwell", 46);
        Author a2 = new Author("J.K. Rowling", 58);
        Author a3 = new Author("Ernest Hemingway", 61);

        // Accessing the static variable via the class name
        System.out.println("Total Author objects created: " + Author.objectCount);
    }
}