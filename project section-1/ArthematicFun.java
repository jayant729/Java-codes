public class ArthematicFun {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result= a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double)b / a ;
        int remainder = a % b;
        System.out.println("Result is: "+ result);
        System.out.println("Difference is: "+ difference);
        System.out.println("Product is: "+ product);
        System.out.println("Quotient is: "+ quotient);
        System.out.println("Remainder is: "+ remainder);

        result++;
        System.out.println("Result now is: "+ result);

        product *=2;
        System.out.println("Product now is: "+ product);
    }
}
