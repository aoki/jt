package junit.tutorial.registration;

public class Age {
  public final int value;

  public Age(int value) {
    if (value < 0 || 150 <= value)
      throw new IllegalArgumentException();
    this.value = value;
  }
}
