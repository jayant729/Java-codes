import java.util.Scanner;
public class KeyboardInput{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String name;
        String city;
        int age;
        int product;

        System.out.println("Enter an input number:");
        product=keyboard.nextInt();
        product *=2;
        keyboard.nextLine();
        System.out.println("what is your name?");
        name=keyboard.nextLine();
        System.out.println("What is your age?");
        age=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("what is your city?");
        city=keyboard.nextLine();

        System.out.println("The product is: " + product);
        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your city is " + city);
    }
}