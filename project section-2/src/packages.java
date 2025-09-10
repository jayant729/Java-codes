import java.util.Scanner;
public class packages {
    public static void main(String[] args){
        int packages;
        int coursestaken;
        int cost;
        int additionalcourse;
        int numcourse;
        int totalcost;

        Scanner input = new Scanner(System.in);
        System.out.println("Which package do you want? 1,2 or 3? ");
        packages = input.nextInt();

        System.out.println("How many courses did you take?");
        coursestaken = input.nextInt();

        if(packages ==1){
            cost=10;
            additionalcourse=6;
            numcourse=2;
        }
        else if(packages==2){
            cost=12;
            additionalcourse=4;
            numcourse=4;

        }
        else{
            cost=15;
            additionalcourse=3;
            numcourse=6;
        }
        if(coursestaken>numcourse){
            totalcost=cost+(coursestaken-numcourse)*additionalcourse;
        }
        else{
            totalcost=cost;
        }
        System.out.println("Your Total Cost is: $"+totalcost);
    }
}
