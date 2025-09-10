import java.util.ArrayList;
public class WrapperDoubleFun {
    public static void main(String[] args) {
        ArrayList<Double> mydouble;
        mydouble=new ArrayList<>();

        String mynum="3.14159";
        double myvalue=Double.parseDouble(mynum);
        myvalue+=0.85841;
        System.out.println(myvalue);
    }
}
