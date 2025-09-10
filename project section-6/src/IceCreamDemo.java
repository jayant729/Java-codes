
public class IceCreamDemo {
    public static void main(String[] args) {


        IceCream flavour = new IceCream("Chocolate", 25, 1);
        IceCream flavour1 = new IceCream("Strawberry", 25, 2);

        flavour.addToping("Nuts");
        flavour1.addToping("Oreo");

        printdata(flavour);
        printdata(flavour1);
    }//end main


    public static void printdata(IceCream data){
        System.out.println("Icecream flavour: " + data.getName());
        System.out.println("Cost in Rs: " + data.getCost());
        System.out.println("Number of Scoops: " + data.getNumScoops());
        System.out.print("Your Toping: ");
        data.printToppings();
        System.out.println();
    }
}