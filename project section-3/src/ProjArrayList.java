import java.util.ArrayList;
import java.util.Scanner;
public class ProjArrayList {
  public static  void main(String[] args) {
    ArrayList<Double> mylist;
    mylist=new ArrayList<>();

    Scanner input=new Scanner(System.in);
    double number;

    System.out.print("Enter a positive number: ");
    number=input.nextDouble();

    while(number>=0){
        mylist.add(number);
        System.out.print("Enter a positive number: ");
        number=input.nextDouble();
    }
    for(int i=mylist.size()-1;i>=0;i--){
        System.out.println("Result is: ");
        System.out.println(mylist.get(i));
    }

  }
}

