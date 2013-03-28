package junit.tutorial.parameterized;

enum Gender {MALE, FEMALE};

public class Member {
  public static boolean canEntry(int age, Gender gender) {
    if (age <= 25 && gender == Gender.FEMALE) return true;
    else return false;
  }
}
