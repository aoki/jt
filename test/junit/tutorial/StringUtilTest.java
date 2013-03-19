package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringUtilTest {

  @Test
  public void isEmptyOrNullは空文字列でtrueを返す() throws Exception {
    // SetUp
    String input = "";
    boolean expected = true;
    // Exercise
    boolean actual = StringUtil.isEmptyOrNull(input);
    // Verify
    assertThat(actual, is(expected));
  }

  @Test
  public void isEmptyOrNillはAAAでfalseを返す() throws Exception {
    // SetUp
    String input = "AAA";
    boolean expected = false;
    // Exercise
    boolean actual = StringUtil.isEmptyOrNull(input);
    // Verify
    assertThat(actual, is(expected));
  }

}