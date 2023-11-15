public class atmMachine {

    //obj of class accountBalance
    accountBalance obj1 = new accountBalance();

    //method to withdraw
    public static int withdraw(int amount){
        if (accountBalance.Balance<amount){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println(amount+" Successfully Withdraw");
            return accountBalance.Balance -= amount;
        }
        return accountBalance.Balance;

    }

    //method to deposit
    public static int deposit(int amount){

        return accountBalance.Balance += amount;
    }

    //method to check balance
    public static void checkBalance(){

        System.out.println("Available Balance: "+accountBalance.Balance);
    }

}
