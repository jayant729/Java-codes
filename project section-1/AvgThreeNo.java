import java.util.Scanner;
public class AvgThreeNo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double average;

        System.out.println("Enter the first number ");
        n1=input.nextDouble();
        System.out.println("Enter the second number");
        n2=input.nextDouble();
        System.out.println("Enter the third number");
        n3=input.nextDouble();

        average=(n1+n2+n3)/3;
        System.out.println("The average of three nos is:" +average);

    }
}
