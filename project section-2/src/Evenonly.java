public class Evenonly {
    public static void main(String[] args) {
        int number = 10;

        for(int i=1;i<=number;i++){

            if(i%2==0){
                if(i==8){
                    continue;
                }

                System.out.println(i);
            }
        }
    }
}
