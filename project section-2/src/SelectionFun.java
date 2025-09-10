import java.util.Scanner;
public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the pub and grille!");

        System.out.println("Enter your age");
        age=input.nextInt();

        if(age>=21){
            System.out.println("You can have a beer!");
        }
        else if (age>=16) {
            System.out.println("Here have a coke");
            System.out.println("Atleast you can drive!");


        }
        else{
            System.out.println("You can have a coke!");
        }
        System.out.println("Thanks for coming to the pub and grille!");

    }
}
