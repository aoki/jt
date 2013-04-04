package junit.tutorial.rule;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameExampleTest {
  @Rule
  public TestName testName = new TestName();

  @Test
  public void テスト名() throws Exception {
    fail(testName.getMethodName() + " is unimplements yet.");
  }

}
