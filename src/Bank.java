abstract class Bank {
    abstract void getBlance();
    public static void main(String args[]){
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBlance();
        bankB.getBlance();
        bankC.getBlance();

    }
}

class BankA extends Bank{
    private double balance = 100.00;
    @Override
    void getBlance() {
        System.out.println("Your current balance is $" + balance);
    }
}
class BankB extends Bank{
    private double balance = 150.00;
    @Override
    void getBlance() {
        System.out.println("Your current balance is $" + balance);
    }
}
class BankC extends Bank{
    private double balance = 200.00;
    @Override
    void getBlance() {
        System.out.println("Your current balance is $" + balance);
    }
}


//