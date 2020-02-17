package alextym.com.task08;
import java.util.Arrays;
import java.util.Comparator;

public class Books {

    private int countBooks = 0;
    private Book[] books;

    public Books(int i) {
        books = new Book[i];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (countBooks == books.length) {
            return;
        }
        books[countBooks++] = book;
    }

    public void printBooks() {
        if (countBooks == 0) {
            System.out.println("No results found");
        }
        for (Book elem : books) {
            System.out.println(elem);
        }
    }

    public Book[] changePrice(int x) {
        Book[] newPriceBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            int oldPrice = books[i].getPrice();
            int newPrice = oldPrice * (100 + x) / 100;
            books[i].setPrice(newPrice);
        }
        return newPriceBooks;
    }

    public Book[] searchBookAuthor(String str) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(str)) {
                search[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(search, count);
    }

    public Book[] searchBookYear(int y) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getYear() > y) {
                search[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(search, count);
    }


}
