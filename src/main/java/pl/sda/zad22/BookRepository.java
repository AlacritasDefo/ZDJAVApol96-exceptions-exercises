package pl.sda.zad22;

public class BookRepository {

    private Book[] books = new Book[0];

    public void addBook(Book book) {
        int idx = books.length;
        books = new Book[idx + 1];
        books[idx] = book;
    }

    public Book[] getBooks() {
        return books;
    }

    public void removeBook(Book book) {
        Book[] temp = new Book[books.length - 1];
        for (int i = 0, k = 0; i < books.length; i++) {
            if (!books[i].equals(book)) {
                temp[k] = books[i];
                k++;
            }
        }
        books = temp;
    }

    public Book searchBookByName(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                return book;
            }
        }
        throw new NoBookFoundException("Not book with name " + name);
    }

    public Book searchBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException("Not book with isbn " + isbn);
    }

    public void removeBookByISBN(String isbn) {
        Book[] temp = new Book[books.length - 1];
        for (int i = 0, k = 0; i < books.length; i++) {
            if (!books[i].getIsbn().equals(isbn)) {
                temp[k] = books[i];
                k++;
            }
        }
        books = temp;
    }
}
