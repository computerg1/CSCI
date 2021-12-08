


import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance) {
        balance = initalBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public void monthlyFee(){
        withdraw(10);
    }
    // P (1 + R/n)^(nt) - P
    // P = principal
    // t = years
    // r = annual interest rate
    // n = # of times its compounded
    // PEMDAS
    public void calcInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r / n), n*t);
        double compinterest = amount - p;
        System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t + " years: "+ amount);
    }

    public void investment(double balance, double r, double targetBalance){
        int year = 0; 
        while(balance<= targetBalance){
            year++;
            double interest = balance * r / 100;
            balance = balance + interest;
        }
        System.out.println("Total Balance: $"+ balance);
        System.out.println("Investment doubled After "+ year + " years.");
    }

        public static void Overdraft(BankAccount account, double amount){

            Scanner input = new Scanner(System.in); 

            if (account.balance <= 0){ // checking if the acct balance is less than or equil to 0.

                System.out.println("Yopu have a Negative Balance, Would you liek to make a Deposit? (Y/N)"); //asking the user if they want to make a deposit. 

                String answer = input.nextLine(); 

                if (answer.equalsIgnoreCase("Y")){ //if the user answers "Y" call the deposit method. 

                    account.withdraw(amount);

                }

                account.balance = account.balance - 35; //charged the 35 dollar with drawl fee. 

            } else{

                if(account.balance - amount < 0){

                    System.out.println("yoyr account balance will be Negative after this withdraw.");

                    System.out.println("Contiune? (Y/N)");

                    String answer =  input.nextLine(); 

                    if(answer.equalsIgnoreCase("Y")){

                        account.withdraw(amount);

                    }


                }


            }






        }

    public static int menu() {
        
        int selection;
        Scanner input = new Scanner(System.in);

        /*******************************************/
        System.out.println("Please select an option:");
        System.out.println("------------------------\n");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("0: Quit");
        System.out.println("------------------------\n");

        selection = input.nextInt();

        return selection;
    }
}



