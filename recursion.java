import java.util.Scanner;

class Recursion {

    int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
             return a * factorial(a-1);
        }
    }

    public static void main(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        number = sc.nextInt();


        Recursion r = new Recursion();
        int result = r.factorial(number);
        String formatted = String.format("factorial of %d is %d", number, result);

        System.out.println(formatted);

    }
}

/* class Recursion {
    int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int result = r.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
 */
