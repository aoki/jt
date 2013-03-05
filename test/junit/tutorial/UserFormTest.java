package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserFormTest {

	@Test
	public void isValidはuserNameとpasswordがから出ない場合にtrueを返す() throws Exception {
		UserForm sut = new UserForm("user01", "1234");
		assertThat(sut.isValid(), is(true));
	}
	@Test
	public void userNameが空の時にエラーメッセージが取得できる() throws Exception {
		UserForm sut = new UserForm("", "1234");
		String expected = "ユーザIDは必須項目です。";
		String actual = sut.getErrorMessage();
		assertThat(actual, is(expected));
	}

}