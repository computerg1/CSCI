package Week3;

import java.util.Scanner;

public class BankAccountTester {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // BankAccount gregChecking = new BankAccount();
        // BankAccount bobChecking = new BankAccount(10000);

        //  System.out.println(gregChecking.getBalance());
        // System.out.println("Balance Starting");
        // System.out.println(bobChecking.getBalance());
        // bobChecking.withdraw(500);
        // System.out.println("Balance After withdraw");
        // System.out.println(bobChecking.getBalance());
        // bobChecking.deposit(100);
        // System.out.println("Balance After Deposit");
        // System.out.println(bobChecking.getBalance());

        // // gregChecking.monthlyFee();

        // System.out.println(gregChecking.getBalance());
        
        // gregChecking.deposit(50000);
        // gregChecking.calcInterest(gregChecking.getBalance(), 10, 0.40, 12);
        
        // making the object like we are used to
        //BankAccount test = new BankAccount();

        // using static in the menu method so we can call the
        // menu without creating an object
        //System.out.println(BankAccount.menu());
        // BankAccount.menu();
        System.out.println("Hello... Welcome.. How much money would you like to start an account with?");
        // collect the starting balance
        double startingBalance = keyboard.nextDouble();

        System.out.println("WOW $" + startingBalance + " Thats a great start..Let me get the account started for you");
        // creating a bank account object with the starting balance collected above 
        BankAccount userBank = new BankAccount(startingBalance);

        System.out.println("Great the account is started");

        int menuSelection = BankAccount.menu();
        
        if (menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+userBank.getBalance());
        } else if (menuSelection == 2) {
            System.out.println("Please enter the amount to Deposit:\n");
            double depositAmount = keyboard.nextDouble();
            userBank.deposit(depositAmount);
            System.out.println("Amount: $" + depositAmount + " Was Deposited");
            System.out.println("Total Balance: $"+userBank.getBalance());
        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to Withdraw:\n");
            double withdrawAmount = keyboard.nextDouble();
            userBank.withdraw(withdrawAmount);
            System.out.println("Amount: $" + withdrawAmount + " Was Withdrew");
            System.out.println("Total Balance: $"+userBank.getBalance());
        }else if (menuSelection == 0){
            System.out.println("Have a good day...");
        }else{
            System.out.println("Error: NO VALID SELECTION");
        }
    }
}
