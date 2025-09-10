import java.util.Scanner;
public class NameParser {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String fullname;

        System.out.println("Please enter your Fullname: ");
        fullname=input.nextLine();

       int indexofspace=fullname.indexOf(" ");
       String name=fullname.substring(0,indexofspace);
       System.out.println("Your name is: " +name);

       String lastname=fullname.substring(indexofspace+1);
       System.out.println("Your last name is: " +lastname);

       String upper=name.toUpperCase();
       String lower=lastname.toLowerCase();

       System.out.println("Upper case is: " +upper);
       System.out.println("Lower case is: " +lower);



    }
}
