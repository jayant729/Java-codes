public class Arraypractice {
    public static void main(String[] args) {
        int[] myarray;
        myarray = new int[5];
        for(int i=0;i<myarray.length;i++){
            myarray[i]=i+1;
        }
        for(int num:myarray){
            System.out.println(num);
        }
    }
}
