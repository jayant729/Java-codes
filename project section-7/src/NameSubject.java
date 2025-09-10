import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class NameSubject {
    public static void main(String[] args) {
        Scanner namefile;
        Scanner subfile;

        try{
            namefile=new Scanner(new File("names1.txt"));
            subfile=new Scanner(new File("subject.txt"));

            PrintWriter pw=new PrintWriter("Namesub.txt");
            String tempname;
            String tempsubject;

            while(namefile.hasNext()){
                tempname=namefile.nextLine();
                tempsubject=subfile.nextLine();

                pw.println(tempname+ " is studying " +tempsubject);
            }
            pw.close();
            namefile.close();
            subfile.close();


        }//end try

        catch(FileNotFoundException ex){
            System.out.println("File Not Found!");
            System.out.println(ex.getMessage());
        }
    }
}
