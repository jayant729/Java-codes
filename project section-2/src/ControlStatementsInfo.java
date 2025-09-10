public class ControlStatementsInfo {
    public static void main(String[] args) {
        int age=19;

        if(age>=18){
            System.out.println("you can drive!");
        }
        else{
            System.out.println("you can't drive!");
        }//end if-else

        for(int i=1; i <=age; i++){
            System.out.println("Happy Birthday" + i);
        }
    }//end main

}
