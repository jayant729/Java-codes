import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String adjective1;
        String girl_name;
        String adjective2_occupation;
        String place;
        String clothing;
        String hobby;
        String adjective3_occupation;
        String boy_name;
        String man_name;

        System.out.println("Enter the adjective1:");
        adjective1=input.nextLine();

        System.out.println("Enter the girl name::");
        girl_name=input.nextLine();

        System.out.println("Enter the adjective2 occupation:");
        adjective2_occupation=input.nextLine();

        System.out.println("Enter the place:");
        place=input.nextLine();

        System.out.println("Enter the clothing:");
        clothing=input.nextLine();

        System.out.println("Enter the hobby:");
        hobby=input.nextLine();

        System.out.println("Enter the adjective3 occupation:");
        adjective3_occupation=input.nextLine();

        System.out.println("Enter the boy name:");
        boy_name=input.nextLine();

        System.out.println("Enter the man name:");
        man_name=input.nextLine();
        input.nextLine();

        System.out.print("There once was a " + adjective1);
        System.out.print(" girl named "+ girl_name);
        System.out.print(" who was a " + adjective2_occupation);
        System.out.print(" in the kingdom of " + place);
        System.out.print(" .She loved to wear " + clothing);
        System.out.print(" and to "+ hobby);
        System.out.print(" .She wanted to marry the " +adjective3_occupation);
        System.out.print(" named "+boy_name);
        System.out.print(" but her father,King "+man_name);
        System.out.print(" forbid her from seeing him.");

    }
}
