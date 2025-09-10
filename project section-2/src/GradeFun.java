import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        System.out.println("Enter your grade");
        grade = input.nextLine();
        switch(grade){
            case "A":
                System.out.println("Great Job!");
                break;
            case "B":
                System.out.println("Good Job!");
                break;
            case "C":
                System.out.println("You can do better!");
                break;
            case "D":
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("You have entered the invalid grade!");
                break;

        }
    }
}
