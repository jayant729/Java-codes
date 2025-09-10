public class BankAccountDemo {
    public static void main(String[] args) {


        BankAccount jayantaccount = new BankAccount("Jayant More", 5000);
        BankAccount pratikaccount = new BankAccount("Pratik");

        pratikaccount.deposit(1000);

        System.out.println("Pratik account balance is: " + pratikaccount.getBalance());
        System.out.println();
        jayantaccount.withdraw(2000);//warning!
        System.out.println("Jayant account balance now is: " +jayantaccount.getBalance());

        System.out.println();
        jayantaccount.deposit(3000);
        System.out.println("Jayant account balance now is: " +jayantaccount.getBalance());
    }


}
