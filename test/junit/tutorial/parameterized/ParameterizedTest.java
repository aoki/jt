package junit.tutorial.parameterized;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedTest {
  @DataPoint
  public static int INT_PARAN_1 = 3;
  @DataPoint
  public static int INT_PARAN_2 = 4;

  @DataPoint
  public static String STRING_PARAM_1 = "Hello";
  @DataPoint
  public static String STRING_PARAM_2 = "World";

  public ParameterizedTest() {
    System.out.println("初期化");
  }

  @Theory
  public void 引数がint型のテストメソッド(int param) throws Exception {
    System.out.println("引数がint型のテストメソッド(" + param + ")");
  }

  @Theory
  public void 引数がString型のテストメソッド(String param) throws Exception {
    System.out.println("引数がString型のテストメソッド(" + param + ")");
  }
}
