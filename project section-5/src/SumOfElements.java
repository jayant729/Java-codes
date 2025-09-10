import java.util.ArrayList;
public class SumOfElements {
    public static void main(String[] args){
         ArrayList<Integer> mylist=new ArrayList<>();

         mylist.add(10);
         mylist.add(20);
         mylist.add(30);
         mylist.add(40);
         mylist.add(50);

         SumOfElements(mylist);


    }//end main

    public static void SumOfElements(ArrayList<Integer> list){

        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println("Sum is: " + sum);

    }


}
