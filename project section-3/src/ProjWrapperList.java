import java.util.Scanner;
import java.util.ArrayList;
public class ProjWrapperList {
    public static void main(String[] args) {
        ArrayList<String> myname=new ArrayList<>();
        ArrayList<Integer> myage=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        String name;
        int age;

        for(int i=0;i<5;i++){
            System.out.print("Enter your name: ");
            name=input.nextLine();
            System.out.print("Enter your age: ");
            age=input.nextInt();
            input.nextLine();
            myname.add(name);
            myage.add(age);
            System.out.println();
        }
        for(int i=0;i<myname.size();i++){
            System.out.println(myname.get(i) + " is " + myage.get(i) + " years old");
        }





        }

    }

