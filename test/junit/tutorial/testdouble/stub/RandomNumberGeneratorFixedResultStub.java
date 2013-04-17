package junit.tutorial.testdouble.stub;

public class RandomNumberGeneratorFixedResultStub implements RandomNumberGenerator {

  @Override
  public int nextInt() {
    return 1;
  }

}
