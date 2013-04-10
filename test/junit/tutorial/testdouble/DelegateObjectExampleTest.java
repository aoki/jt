package junit.tutorial.testdouble;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class DelegateObjectExampleTest {

  @Test
  public void doSomethingでdateに現在時刻が設定される() throws Exception {

    final Date current = new Date();
    DelegateObjectExample sut = new DelegateObjectExample();
    sut.dateFactory = new DateFactoryImpl() {
      @Override
      public Date newDate() {
        System.out.println(current);
        return current;
      }
    };
    sut.doSomething();
    // このアサーションは実行タイミングによって成功にも失敗にもなる
    assertThat(sut.date.toString(), is(new Date().toString()));
  }

}
