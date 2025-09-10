public class JayantDemo {
    public static void main(String[] args) {
        Jayant mydata=new Jayant();
        Jayant yourdata=new Jayant("Pratik","Patil",24);

        mydata.setname("Jayant");
        mydata.setlastname("More");
        mydata.setrollno(18);

//        yourdata.setname("Pratik");
//        yourdata.setlastname("Patil");
//        yourdata.setrollno(24);

        printdata(mydata);
        System.out.println();
        printdata(yourdata);

//        System.out.println("My name is "+mydata.getname() + " and my surname is "+mydata.getlastname() + " and my class rollno is "+mydata.getrollno());
//
//        System.out.println("Your name is "+yourdata.getname() + " and my surname is "+yourdata.getlastname() + " and my class rollno is "+yourdata.getrollno());
    }//end main

    public static void printdata(Jayant data){
        System.out.println("My name is "+data.getname() + " and my surname is "+data.getlastname() + " and my class rollno is "+data.getrollno());

    }
}
