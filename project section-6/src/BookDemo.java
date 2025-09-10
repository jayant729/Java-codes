public class BookDemo {
    public static void main(String[] args) {
        Book gameofthrones=new Book("James worth","Fictional",987);
        Book java=new Book("Charles smith", "Programming", 1084);

        gameofthrones.printbook();
        System.out.println();
        java.printbook();



    }//end main

//    public static void printbook(Book printbook){
//        System.out.println("The author is "+printbook.getAuthor());
//        System.out.println("The title is "+printbook.getTitle());
//        System.out.println("Has " + printbook.getNumberOfPages() + " pages.");
//    }
}
