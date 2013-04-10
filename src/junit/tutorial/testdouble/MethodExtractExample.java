package junit.tutorial.testdouble;

import java.util.Date;

public class MethodExtractExample {
  Date date = new Date();

  public void doSomething() {
     this.date = newDate();
  }

  Date newDate() {
    return new Date();
  }
}
