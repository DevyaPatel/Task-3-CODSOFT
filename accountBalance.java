import java.util.Scanner;

public class accountBalance {
    public static int Balance = 100000;

    public static void main(String[] args) {

        int withdraw,deposit;
        Scanner sc= new Scanner(System.in);

        System.out.println("Account Balance: "+Balance);
        System.out.println();

        while(true){

            System.out.println("ATM machine Interface");
            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to Exit");
            System.out.println("Choose the operation you want to perform");

            int choice = sc.nextInt();

            switch(choice){

                //to withdraw amount
                case 1:
                    System.out.println("Enter the amount to Withdraw");
                    withdraw = sc.nextInt();
                    atmMachine.withdraw(withdraw);
                    break;

                //to deposit amount
                case 2:
                    System.out.println("Enter the amount to Deposit");
                    deposit = sc.nextInt();
                    atmMachine.deposit(deposit);
                    System.out.println("Amount Deposited Successfully");
                    break;

                //to check balance
                case 3:
                    atmMachine.checkBalance();
                    break;

                //to exit from machine
                case 4:
                    System.out.println("Successfully Exited ATM Machine");
                    System.exit(0);
                    break;

                //default for invalid input
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }
}
