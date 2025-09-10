import java.util.ArrayList;

public class Book {
    private String author;
    private String title;
    private int numberOfPages;

    public Book(String author, String title, int numberOfPages) {
        this.author=author;
        this.title=title;
        this.numberOfPages=numberOfPages;
    }//para-constructor

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void printbook(){
        System.out.println("The author is "+ author);
        System.out.println("The title is "+title);
        System.out.println("Has " + numberOfPages + " pages.");
    }

}
