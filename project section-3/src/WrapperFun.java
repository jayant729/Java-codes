import java.util.ArrayList;
public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> mynum;
        mynum=new ArrayList<>();

        mynum.add(10);
        mynum.add(20);

//        for(int i=0;i<mynum.size();i++){
//            System.out.println(mynum.get(i));
//        }
        for(int num:mynum){
            System.out.println(num);
        }//end for

        String n1="450";
        int myvalue=Integer.parseInt(n1);
        myvalue+=50;
        System.out.println(myvalue);

    }
}
