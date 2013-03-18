package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UserTest {
	public static class インスタンス化テスト {
		@Test
		public void デフォルトコンストラクタ() throws Exception {
			User instance = new User();
			assertThat(instance.getName(), is("nobody"));
			assertThat(instance.isAdmin(), is(false));
		}
	}
}
