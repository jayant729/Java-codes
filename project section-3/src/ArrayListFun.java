import java.util.ArrayList;
public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namelist;
        namelist=new ArrayList<>();

        namelist.add("Jayant");
        namelist.add("Shradha");
        namelist.add("Jyoti");
        namelist.add("Sachin");
        namelist.add("Leo");

//        for(int i=0;i<namelist.size();i++){
//            System.out.println(namelist.get(i));
//        }
        for(String name:namelist){
            System.out.println(name);
        }
    }
}
