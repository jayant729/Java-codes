import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args){

        try {
            Scanner numfile=new Scanner(new File("nums.txt"));
            PrintWriter pw=new PrintWriter("twice_nums.txt");

            int n;
            while(numfile.hasNext()){
                n=numfile.nextInt();
                n=n*2;
                pw.println(n);
            }
            numfile.close();
            pw.close();
        }//end try

        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }//end main

}
