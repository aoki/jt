package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TimeoutTest {

  @Test(timeout = 100L)
  public void timeoutTest() throws Exception {
    Timeout sut = new Timeout();
    int actual = sut.doLongTask();
    assertThat(actual, is(100));
  }

}
