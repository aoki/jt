package junit.tutorial.bookstore;

public class BookStoreTestHelper {

  public static Book Bookオブジェクトの作成_MartinFlowlerのRefactoring() {
    return new Book() {
      {
        setTitle("Refactoring");
        setPrice(4500);
        setAuthor(new Author() {
          {
            setFirstName("Martin");
            setLastName("Fowler");
          }
        });
      };
    };
  }
}
