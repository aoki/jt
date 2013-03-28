package junit.tutorial.parameterized;

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

}
