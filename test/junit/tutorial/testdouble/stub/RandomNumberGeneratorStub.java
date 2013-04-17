package junit.tutorial.testdouble.stub;

public class RandomNumberGeneratorStub implements RandomNumberGenerator {
  private final int num;

  public RandomNumberGeneratorStub(int num) {
    this.num = num;
  }

  @Override
  public int nextInt() {
    return num;
  }

}
