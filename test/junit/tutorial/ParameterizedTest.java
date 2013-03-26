package junit.tutorial;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedTest {

  @Theory
  public void testCase(int x) throws Exception {
  }
}
