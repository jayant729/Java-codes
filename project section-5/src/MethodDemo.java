public class MethodDemo {
    public static void main(String[] args){
        hello();

        number(15);

        int result=num();
        System.out.println(result);

        int result1=add(5,7);
        System.out.println(result1);

        result=square(5);
        System.out.println(result);
    }//end main

    // void,parameterless
    public static void hello(){
        System.out.println("Hello Jayant!");
    }

    //void,parameterized
    public static void number(int a){
        System.out.println("The number is: " +a);
    }

    //value return,parameterless
    public static int num(){
        return 10;
    }

    //value return,parameterized
    public static int add(int num1,int num2){
        return num1 + num2;
    }

    public static int square(int num){
        return num*num;
    }
}
