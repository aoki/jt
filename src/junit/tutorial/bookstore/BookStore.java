package junit.tutorial.bookstore;

import java.util.Map;
import java.util.HashMap;

public class BookStore {
	Map<Book, Integer> books = new HashMap<Book, Integer>();

	public void addToCart(Book book, int i) {
		books.put(book, i);
	}

	public int getTotalPrice() {
		int total = 0;
		for (Map.Entry<Book, Integer> b: books.entrySet()) {
			total += (b.getValue() * b.getKey().getPrice());
		}
		return total;
	}

}
