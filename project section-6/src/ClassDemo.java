public class ClassDemo {
    public static void main(String[] args){
        Class mydata=new Class("John","DSA",18);
        Class yourdata=new Class("Kristina","CN-2",15);

//        mydata.setname("Jayant");
//        mydata.setrollno(18);
//        mydata.setsubject("DBMS");

//        yourdata.setname("Kristina");
//        yourdata.setrollno(15);
//        yourdata.setsubject("CN-1");

        printdata(mydata);
        System.out.println();
        printdata(yourdata);


    }//end main

    public static void printdata(Class data){
        System.out.println("My name is " + data.getname()+
                " and my major is " +data.getsubject()+
                " and my rollno is" + data.getrollno());
    }

}
