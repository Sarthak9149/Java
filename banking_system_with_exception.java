import java.util.Scanner;

/* 
Write a  program that simulates a simple bank account system with the following requirements:
Create a custom exception class named InsufficientBalanceException.
Create a method withdraw(double amount) that:
Throws InsufficientBalanceException if the withdrawal amount is greater than the current balance.
Otherwise, deducts the amount from the balance.
Use the throws keyword in the method declaration.
In the main method:
Call the withdraw method inside a try block.
Catch the custom exception using a catch block and print the error message using getMessage().
Use a finally block to print "Transaction attempt completed" regardless of success or failure.
Also demonstrate the use of throw inside the method.
 */


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}

// sc = new Scanner(System.in);
// System.out.println("Enter the money to deposit");
// money_to_deposit = sc.nextInt()

class NewBank {
    int Balance = 1000;

    void deposit(int money_to_deposit) {
        Balance += money_to_deposit;
    }

    void withdraw(int money_to_withdraw) throws InsufficientBalanceException {
        if (Balance < money_to_withdraw){
            throw new InsufficientBalanceException();
        }

        else {
            Balance -= money_to_withdraw;
        }
    }
}

class Main {
    public static void main(String[] args){
        Bank bank = new Bank();
        try {
            bank.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction attempt completed");
        }
    }
}