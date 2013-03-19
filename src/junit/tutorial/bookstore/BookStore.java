package junit.tutorial.bookstore;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class BookStore {
  private Map<Book, Integer> books = new HashMap<Book, Integer>();
  private ArrayList<Book> bookList = new ArrayList<Book>();

  public void addToCart(Book book, int i) {
    books.put(book, i);
    bookList.add(book);
  }

  public int getTotalPrice() {
    int total = 0;
    for (Map.Entry<Book, Integer> b : books.entrySet()) {
      total += (b.getValue() * b.getKey().getPrice());
    }
    return total;
  }

  public Book get(int i) {
    return bookList.get(i);
  }

}
