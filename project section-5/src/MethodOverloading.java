public class MethodOverloading {
    public static void main(String[] args){
        int getresult=result(10);
        System.out.println(getresult);

        getresult=result(2,3);
        System.out.println(getresult);

        getresult=result(5,"12");
        System.out.println(getresult);

        String getresult2=result("Jayant","More");
        System.out.println(getresult2);
    }//end main

    public static int result(int num){
        return num*2;
    }

    public static int result(int num1,int num2){
        return num1*num2;
    }

    public static int result(int num1,String num2){
        return num1*Integer.parseInt(num2);
    }

    public static String result(String name1,String name2){
        return name1+ " "+name2;
    }

}
