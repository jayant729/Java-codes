import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class FileInputFun {
    public static void main(String[] args){
        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));
            int input;
            int sum = 0;

            while (infile.hasNext()) {
                input = infile.nextInt();
                sum += input;
                System.out.println(input);
            }
            System.out.println("sum is: " + sum);
            infile.close();
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
                System.out.println(ex.getMessage());

        }
        catch (Exception e){
            System.out.println("Invalid entry in the input.txt file!");
        }
    }
}

