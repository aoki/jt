package junit.tutorial.rule;

public class VerifierExample {

  protected int value;

  public void set(int i) {
    value = i;
  }

  public void add(int i) {
    value += i;

  }

  public void minus(int i) {
    value -= i;
  }

  public int getValue() {
    return value;
  }

}
