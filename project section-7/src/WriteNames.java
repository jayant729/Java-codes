import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class WriteNames {
    public static void main(String[] args){
        ArrayList<String> mynames=new ArrayList<>();
        mynames.add("Jayant");
        mynames.add("Jonathan");
        mynames.add("Christopher");
        mynames.add("Sara");
        mynames.add("Maddie");

        try{
            PrintWriter pw=new PrintWriter("names.txt");
            for(String name:mynames){
                pw.println(name);
            }
            pw.close();


        }//end try

        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

    }
}
