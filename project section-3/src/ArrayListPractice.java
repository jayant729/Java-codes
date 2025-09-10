import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> namelist;
        namelist=new ArrayList<>();

        namelist.add("jayant");
        namelist.add("pratik");
        namelist.add("shreyas");

//        for(int i=0;i<namelist.size();i++){
//            System.out.println(namelist.get(i));
//        }
        for(String name:namelist){
            System.out.println(name);
        }
    }
}
