public class StringMethods1 {
    public static void main(String[] args) {
        String name="Jayant More";
        String name2="Jayant More";
        String name3="Cristiano Ronaldo";
        String name4="jayant";

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }

        System.out.println();

        if(name.equals(name2)){
            System.out.println("Names are equal");
        }
        else{
            System.out.println("Names are not equal");
        }
        if(name.compareTo(name4)>0){
            System.out.println("Name>name3");
        }
        else{
            System.out.println("Name<name3");
        }
    }
}
