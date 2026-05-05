import java.util.Scanner;

// next -> grab the first word of the input
// nextLine -> grab the whole line of the input
public class input {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Your name is: " + name);
        sc.close();
    }
}

