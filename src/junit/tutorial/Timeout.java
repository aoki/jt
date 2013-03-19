package junit.tutorial;

public class Timeout {

  public Timeout() {
  }

  public int doLongTask() {
    try {
      java.util.concurrent.TimeUnit.MILLISECONDS.sleep(10);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return 100;
  }
}
