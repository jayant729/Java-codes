import java.util.ArrayList;
import java.util.Scanner;
public class ProjNamePermutations {
    public static void main(String[] args) {
        ArrayList<String> firstname=new ArrayList<>();
        ArrayList<String> lastname=new ArrayList<>();

        Scanner input=new Scanner(System.in);

        String name;
        String surname;
        String fullname;
        int indexofspace;
        int numname=5;

        for(int i=0;i<numname;i++){
            System.out.print("Please enter your fullname " +i+ ":");
            fullname=input.nextLine();
            indexofspace=fullname.indexOf(" ");

            name=fullname.substring(0,indexofspace);
            surname=fullname.substring(indexofspace+1);

            firstname.add(name);
            lastname.add(surname);
        }
        for(int i=0;i<firstname.size();i++){
            for(int j=0;j<lastname.size();j++){
                System.out.print(firstname.get(i)+" ");
                System.out.println(lastname.get(j));
            }
        }
    }
}
