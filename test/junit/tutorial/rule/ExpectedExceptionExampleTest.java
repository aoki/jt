package junit.tutorial.rule;

import org.junit.Test;

public class ExpectedExceptionExampleTest {

  @Test(expected = IllegalArgumentException.class)
  public void 例外の発生を検証する標準的なテスト() throws Exception {
    throw new IllegalArgumentException();
  }

}
