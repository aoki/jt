package junit.tutorial;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SlowAndFastTest {
  @Test
  public void fastTest_01() throws Exception {
  }

  @Test
  @Category(SlowTests.class)
  public void slowTest_01() throws Exception {
    fail();
  }

  @Test
  @Category(SlowTests.class)
  public void slowTest_02() throws Exception {
    fail();
  }
}
