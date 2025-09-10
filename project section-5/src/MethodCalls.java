public class MethodCalls {
    public static void main(String[] args){
        dosomething();
    }//end main

    public static void dosomething(){
        System.out.println("Hello jayant!");
        int result=getvalue();

        System.out.println(result);
    }

    public static int getvalue(){
        return 150;
    }
}
