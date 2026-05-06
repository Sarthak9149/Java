package college;
import java.util.Scanner;

public class Addition {
    public int add() {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = sc.nextInt();

        System.out.println("Enter second number");
        num2 = sc.nextInt();

        return num1 + num2;
    }
}
