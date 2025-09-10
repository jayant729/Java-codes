import java.util.Random;
public class RandomFun {
    public static void main(String[] args) {


        Random random = new Random();
        int randomnumber;
        randomnumber=random.nextInt();
        System.out.println("Random number is: \t"+randomnumber);

        randomnumber=random.nextInt(1000);
        System.out.println("Random number between 0 -999 is: \t"+randomnumber);

        randomnumber=random.nextInt(1000) + 1;
        System.out.println("Random number between 1 -999 is: \t"+randomnumber);
    }

}
