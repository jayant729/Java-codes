import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        int randomnumber;
        int guessnumber;
        int counter=0;
        boolean guess=false;

        Random random=new Random();
        randomnumber=random.nextInt(100)+1;

        Scanner input=new Scanner(System.in);

        while(!guess){
            System.out.println("Enter your guess: ");
            guessnumber=input.nextInt();
            counter++;

            if(guessnumber==randomnumber){
                System.out.println("Congratulations! You guessed correctly!");
                System.out.println("Total tries taken: " + counter);
            }
            else if(guessnumber>randomnumber){
                System.out.println("Your guess was too high!");
            }
            else{
                System.out.println("Your guess was too low!");
            }
        }
    }
}