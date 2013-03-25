package junit.tutorial.bookstore

class BookStoreGroovyTestHelper {
  static Book Bookオブジェクトの作成_MartinFlowlerのRefactoring() {
    new Book(
      title: "Refactoring",
      price: 4500,
      author: new Author(
        firstName: "Martin",
        lastName: "Fowler",
      ),
    )
  }
}
