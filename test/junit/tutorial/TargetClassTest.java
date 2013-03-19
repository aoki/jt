package junit.tutorial;

import org.junit.Test;

//テスト対象クラス (TargetClass.java)
public class TargetClassTest {
  @Test(expected = IllegalArgumentException.class)
  public void 例外テスト() {
    TargetClass sut = new TargetClass();
    sut.doSomething();
  }
}