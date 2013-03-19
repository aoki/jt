package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import junit.tutorial.bookstore.Author;
import junit.tutorial.bookstore.Book;
import junit.tutorial.bookstore.BookStore;

import org.junit.Test;

public class BookStoreTest {

  @Test
  public void getTotalPrice() throws Exception {
    // SetUp
    Book book = new Book();
    book.setTitle("Refactoring");
    book.setPrice(4500);
    Author author = new Author();
    author.setFirstName("Martin");
    author.setLastName("Fowler");
    book.setAuthor(author);
    BookStore sut = new BookStore();
    sut.addToCart(book, 1);
    // Exercise & Verify
    assertThat(sut.getTotalPrice(), is(4500));
  }

}
