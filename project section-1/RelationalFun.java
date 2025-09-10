
public class RelationalFun {
    public static void main(String[] args){
        boolean Mybool=true;
        boolean Yourbool=false;
        int Myage=22;
        int Yourage=18;
        int Bobage=18;
        int currentage=23;
        int hisage=21;

        String Myname="jayant";
        String Yourname="jayant";

        System.out.println("Mybool " + Mybool);
        System.out.println("Yourbool " + Yourbool);


        boolean agecomparison=Myage>Yourage;
        System.out.println("Myage> Yourage: " + agecomparison);

        agecomparison=Yourage>Bobage;
        System.out.println("Yourage> Bobage: " + agecomparison);

        agecomparison=Bobage==Yourage;
        System.out.println("Bobage==Yourage: " + agecomparison);

        agecomparison=currentage==hisage;
        System.out.println("currentage==hisage: " + agecomparison);

        boolean Namecomparison=Myname.equals(Yourname);
        System.out.println("Do names match?: " + Namecomparison);

    }//end main
}
