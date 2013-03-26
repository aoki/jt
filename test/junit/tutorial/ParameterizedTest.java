package junit.tutorial;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ParameterizedTest {

  @RunWith(Theories.class)
  public static class XXXの場合 {
  }
}
