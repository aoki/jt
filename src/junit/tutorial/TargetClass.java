package junit.tutorial;

// テスト対象クラス (TargetClass.java)
public class TargetClass {
  public void doSomething() {
    throw new IllegalArgumentException("引数が正しくありません．ないけど．");
  }
}
