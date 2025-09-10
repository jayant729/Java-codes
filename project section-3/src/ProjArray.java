import java.util.Scanner;
public class ProjArray {
    public static void main(String[] args){
        int[] myarray;
        myarray=new int[5];
        Scanner input=new Scanner(System.in);

        for(int i=0;i<myarray.length;i++){
            System.out.print("Enter an integer: ");
            myarray[i]=input.nextInt();
        }
        for(int i=0;i<myarray.length;i++){
            System.out.print("Result is: ");
            int result=myarray[i]*2;
            System.out.println(result);
        }
    }
}
