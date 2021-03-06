package pl.sda.zad22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("12332", "A", "author1", 2000);
        Book book2 = new Book("12331", "B", "author1", 2000);
        Book book3 = new Book("12336", "D", "author1", 2000);
        Book book4 = new Book("12337", "C", "author1", 2000);
        Book book5 = new Book("12334", "E", "author1", 2000);

        BookRepository repo = new BookRepository();
        repo.addBook(book1);
        repo.addBook(book2);
        repo.addBook(book3);
        repo.addBook(book4);
        repo.addBook(book5);

        try {
            System.out.println(repo.searchBookByISBN("12332"));
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        repo.removeBookByISBN("12334");

        for (Book book : repo.getBooks()) {
            System.out.println(book);
        }
    }
}
