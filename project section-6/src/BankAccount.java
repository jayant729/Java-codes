public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this(owner,0);
    }
    public BankAccount(String owner, int balance){
        this.owner=owner;
        this.balance=balance;
    }

    public void deposit(int amount){
        if(amount>=0){
            balance=balance+amount;
        }
        else{
            System.out.println("Please deposit amount greater than zero");
        }

    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Please withdraw amount less than your account balance");
        }
    }

    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}// end BankAccount
