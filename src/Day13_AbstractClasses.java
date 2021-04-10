import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
    int price;
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Title: "+title+"\n"+"Author: "+author+"\n"+"Price: "+price);
    }

}

public class Day13_AbstractClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
