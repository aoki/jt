package junit.tutorial.yaml;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import junit.tutorial.bookstore.Book;
import junit.tutorial.bookstore.BookStore;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

public class BookStoreYamlTest {

  @Test
  public void getTotalPrice() throws Exception {
    // SetUp
    BookStore sut = new BookStore();
    Book book = (Book)new Yaml().load(getClass().getResourceAsStream("book_fixtures.yaml"));
    sut.addToCart(book, 1);
    // Exercise & Verify
    assertThat(sut.getTotalPrice(), is(4500));
  }

  @Test
  public void get_0() throws Exception {
    // SetUp
    BookStore sut = new BookStore();
    Book book = (Book)new Yaml().load(getClass().getResourceAsStream("book_fixtures.yaml"));
    sut.addToCart(book, 1);
    // Exercise & Verify
    assertThat(sut.get(0), is(sameInstance(book)));
  }

}
