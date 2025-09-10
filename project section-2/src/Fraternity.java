import java.util.Scanner;
public class Fraternity {
    public static void main(String[] args){
        String gender;
        int age;
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the Fraternity Social organization!");

        System.out.println("Please enter your gender");
        gender=input.nextLine();
        System.out.println("Now please enter your age!");
        age=input.nextInt();

        if(gender.equals("M") && age>=19){
            System.out.println("You can join the Fraternity!");

        }

        else{
            System.out.println("you can not join the Fraternity!");

        }
        System.out.println("Thanks for coming!");
    }
}
