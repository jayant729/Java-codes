import java.util.Random;
public class Practice2DArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        fill2DArray(array);
        print2DArray(array);
    }//end main

    public static void fill2DArray(int[][] myarray) {
        Random rand = new Random();

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                myarray[i][j] = rand.nextInt(100);
            }
        }
    }// end fill2DArray

    public static void print2DArray(int[][] myarray) {
        for (int arr[] : myarray) {
            for (int num : arr) {

                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}