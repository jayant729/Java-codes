public class ArrayMoreFun {
    public static void main(String[] args){
        int[] myarray=new int[10];

        for(int i=0;i<myarray.length;i++){
            myarray[i]=i+1;
        }
        for(int num:myarray){
            System.out.println(num);
        }
    }
}
