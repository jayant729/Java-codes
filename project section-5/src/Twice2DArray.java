import java.util.Random;
public class Twice2DArray {
    public static void main(String[] args){
        int [][] myarray=new int[2][3];

        twice2DArray(myarray);
        print2DArray(myarray);


    }//end main

    public static void twice2DArray(int[][] my2Darray){
        Random random=new Random();

        for(int i=0;i<my2Darray.length;i++){
            for(int j=0;j<my2Darray[i].length;j++){
                my2Darray[i][j]=random.nextInt(10);
               int a1= my2Darray[i][j];
                    a1*=2;
                    System.out.print(a1+ " ");

            }
            System.out.println();
        }
    }//end twice2DArray

    public static void print2DArray(int[][] my2Darray){
        for(int[] arr:my2Darray){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

}
