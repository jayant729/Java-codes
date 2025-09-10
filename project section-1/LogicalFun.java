public class LogicalFun {
    public static void main(String[] args) {
        boolean israining=false;
        boolean iswarm=false;

        boolean combined=israining&&iswarm;
        System.out.println("Is it raining and warm?: " + combined);

        combined=israining||iswarm;
        System.out.println("Is it raining or warm?: " + combined);

        combined= !israining;
        System.out.println("Is it Not raining outside?: " + combined);


    }
}
