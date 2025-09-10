import java.util.Scanner;
public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the integer: ");
        n=input.nextInt();
        if(n%3==0){
            System.out.println("The integer is divisible by three");
        }
        else{
            System.out.println("The integer is not divisible by three");
        }
    }
}
