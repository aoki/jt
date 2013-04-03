package junit.tutorial.rule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ShopInfoTest {

  public static class インスタンス化テスト {

    @Rule
    public ErrorCollector ec = new ErrorCollector();
    @Test
    public void デフォルトコンストラクタ() throws Exception {
      // Execrise
      ShopInfo instance = new ShopInfo();
      // Verify
      ec.checkThat(instance, is(notNullValue()));
      ec.checkThat(instance.id, is(notNullValue()));
      ec.checkThat(instance.name, is(""));
      ec.checkThat(instance.address, is(""));
      ec.checkThat(instance.url, is(notNullValue()));
    }

  }

}
