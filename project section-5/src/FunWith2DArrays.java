import java.util.Random;
public class FunWith2DArrays {
    public static void main(String[] args){
        int[][] myarray=new int[2][3];
        fill2DArray(myarray);
        print2DArray(myarray);

    }//end main

    public static void fill2DArray(int[][] my2DArray){
        Random random=new Random();
        for(int i=0;i<my2DArray.length;i++){
            for(int j=0;j<my2DArray[i].length;j++){
                my2DArray[i][j]=random.nextInt(100);
            }
        }

    }//end fill2DArray

    public static void print2DArray(int[][] my2DArray){
        for(int[]arr:my2DArray){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
