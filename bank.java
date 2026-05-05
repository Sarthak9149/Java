import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class PhonePe implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via PhonePe"); }
}

class GooglePay implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via GooglePay"); }
}

class Paytm implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Paytm"); }
}

class Server {
    // Let's assume the correct PIN is 1234
    boolean verifyPin(int pin) {
        return pin == 1234;
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Server server = new Server();
        Payment p = null;

        System.out.println("Choose Payment Method: 1. PhonePe 2. GooglePay 3. Paytm");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: p = new PhonePe(); break;
            case 2: p = new GooglePay(); break;
            case 3: p = new Paytm(); break;
            default: System.out.println("Invalid Choice"); return;
        }

        System.out.print("Enter UPI PIN: ");
        int pin = sc.nextInt();

        if (server.verifyPin(pin)) {
            p.pay(500.0);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}