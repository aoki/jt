package junit.tutorial.rule;

import junit.tutorial.Timeout;

import org.junit.Test;

public class TimeoutTest {

  @Test(timeout = 10L)
  public void アノテーションを使ったタイムアウト() throws Exception {
    new Timeout().doLongTask();
  }

}
