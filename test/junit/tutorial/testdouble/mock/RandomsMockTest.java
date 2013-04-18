package junit.tutorial.testdouble.mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import junit.tutorial.testdouble.stub.RandomNumberGenerator;
import junit.tutorial.testdouble.stub.Randoms;

import org.junit.Test;

public class RandomsMockTest {

  @Test
  public void choiceでAを返す() throws Exception {
    List<String> options = new ArrayList<String>();
    options.add("A");
    options.add("B");
    Randoms sut = new Randoms();

    // モックの設定
    final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);
    sut.generator = new RandomNumberGenerator() {
      @Override
      public int nextInt() {
        isCallNextIntMethod.set(true);
        return 0;
      }
    };

    assertThat(sut.choice(options), is("A"));
    assertThat(isCallNextIntMethod.get(), is(true));
  }

}
