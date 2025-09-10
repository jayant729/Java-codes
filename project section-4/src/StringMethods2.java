public class StringMethods2 {
    public static void main(String[] args) {
        String name= "Jayant More";

        String upper=name.toUpperCase();
        String lower=name.toLowerCase();

        int whereis=name.indexOf("M");

        String lastname=name.substring(7);

        System.out.println("Upper is :" +upper);
        System.out.println("Lower is :" +lower);
        System.out.println("B is at index: " + whereis);
        System.out.println("Last name is :" +lastname);
    }
}
