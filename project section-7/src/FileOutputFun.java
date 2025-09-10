import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileOutputFun {
    public static void main(String[] args){

        try{
            PrintWriter pw= new PrintWriter("output.txt");
            pw.println("Hello there!");
            pw.println("My name is Jayant More");
            pw.close();
        }//end try

        catch(FileNotFoundException ex){
            System.out.println("Could not write the file!");
        }
    }
}
