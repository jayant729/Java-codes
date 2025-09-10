import java.util.Scanner;
public class SumFun {
    public static void main(String[] args){
        int number;
        int sum=0;


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a non-negative number to enter the loop!:");
        System.out.println("Or a negative number to exit the program!:");
        number=input.nextInt();

        while(number>=0){
            sum+=number;
            System.out.println("Enter a non-negative number:");
            System.out.println("Or a negative number to exit:");
            number=input.nextInt();




        }
        System.out.println("Sum is: "+sum);


    }
}
