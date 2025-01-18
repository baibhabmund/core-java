/*public class BankAccount {
    private int accNumber;
    private int balance;

    public BankAccount(int accNumber, int balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public double deposit(double d){
        if(d > 0){
            balance += d;
            return d;
        } else{
            System.out.println("Amount to be deposited cannot be negative.");
            return 0;
        }
    }
    public double withdraw(double w){
        if(w > 0 && w <= balance){
            balance -= w;
            return w;
        } else if(w > balance){
            System.out.println("Insufficient Funds.");
            return 0;
        } else{
            System.out.println("Amount must be Positive.");
            return 0;
        }
    }
    public void getBalance(){
        System.out.println("Current Balance = " + balance);
    }
    public static void main(String args[]){
        BankAccount account = new BankAccount(800123678, 1000);

        //Testing Deposit
        account.deposit(500);
        account.getBalance();

        //Testing Withdraw
        account.withdraw(1000);
        account.getBalance();

        //Testing Error
        account.deposit(-10);
        account.getBalance();

        account.withdraw(10000000);
        account.getBalance();
    }
}
*/
