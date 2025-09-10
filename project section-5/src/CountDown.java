public class CountDown {
    public static void main(String[] args){
        countdown(10);

        countupto(10,20);
    }

    public static void countdown(int num){
        if(num>0){
            System.out.println(num);
            countdown(num-1);
            System.out.println();
        }//end if
    }//end countdown

    public static void countupto(int num1,int num2){
        if(num1<=num2){
            System.out.println(num1);
            countupto(num1+1,num2);
        }
    }
}
