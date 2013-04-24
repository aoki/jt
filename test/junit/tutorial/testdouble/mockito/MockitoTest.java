package junit.tutorial.testdouble.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class MockitoTest {

  @Test
  public void Mockitoを使ってみる() {
    // モックオブジェクトの作成
    List<String> mock = org.mockito.Mockito.mock(List.class);
    assertThat(mock.get(0), is(nullValue()));
    assertThat(mock.contains("Hello"), is(false));

  }

}
