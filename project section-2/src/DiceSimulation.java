import java.util.Random;
public class DiceSimulation {
    public static void main(String[] args){
        Random random=new Random();
        int dice;
        System.out.println("The 10 random rools of dice are:");
        for(int i=1;i<=10;i++){
            dice=random.nextInt(6) +1;
            System.out.println(" "  + dice);
        }
    }
}
