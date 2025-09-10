import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class NamesAges {
    public static void main(String[] args) {
        Scanner namesfile;
        Scanner agesfile;

        try{
            namesfile=new Scanner(new File("student_names.txt"));
            agesfile=new Scanner(new File("student_ages.txt"));

            PrintWriter pw=new PrintWriter("names_ages.txt");

            String tempname;
            int tempage;

            while(namesfile.hasNext()){
                tempname=namesfile.nextLine();
                tempage=agesfile.nextInt();
                pw.println(tempname + " is " + tempage + " years old");
            }//end while
            namesfile.close();
            agesfile.close();
            pw.close();

        }//end try

        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
}
