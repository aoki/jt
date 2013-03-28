package junit.tutorial.parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeThat;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MemberCombinedTest {
  enum Gender {MALE, FEMALE};
  @DataPoints
  public static int[] AGES = {15, 20, 25, 30};
  @DataPoints
  public static Gender[] GENDERS = Gender.values();

  @Theory
  public void cabEntry(int age, Gender gender) throws Exception {
    System.out.println("canEntry(" + age + ", " + gender + ")");
  }

  @Test
  public void assume() throws Exception {
    assumeThat(1, is(0));
    fail("この行は実行されない");
  }
}
