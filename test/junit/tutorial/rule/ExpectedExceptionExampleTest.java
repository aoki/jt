package junit.tutorial.rule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionExampleTest {

  @Test(expected = IllegalArgumentException.class)
  public void 例外の発生を検証する標準的なテスト() throws Exception {
    throw new IllegalArgumentException();
  }

  @Test
  public void 例外の発生とメッセージを検証する標準的なテスト() throws Exception {
    try{
      throwNewIllegalArgumentException();
      fail("例外が発生しない");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), is("argument is null."));
    }
  }

  private void throwNewIllegalArgumentException() {
    throw new IllegalArgumentException("argument is null.");
  }

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Test
  public void 例外の発生とメッセージを検証するテスト() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("argument is null.");
    throw new IllegalArgumentException("argument is null.");
  }

}
