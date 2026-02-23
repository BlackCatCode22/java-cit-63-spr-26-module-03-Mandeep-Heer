package mystuff;
import java.util.Scanner;

public class Driver {
    public static void main(String [] args) {

        MyStuff mystuff = new MyStuff();
        mystuff.bookTitle = "A Game of Thrones";
        mystuff.authorName = "George R. R. Martin";
        mystuff.genre = "Fantasy Fiction";
        mystuff.rating = 4.4;
        mystuff.price = 35.99;
        mystuff.inStock = true;

        System.out.println("Title: " + mystuff.bookTitle + "\n" +
                "Author: " + mystuff.authorName + "\n" + "Genre: " +
                mystuff.genre + "\n" + "Rating: " +
                mystuff.rating + "\n" + "Price: " +
                mystuff.price + "\n" + "In Stock: " +
                mystuff.inStock);
    }
}
