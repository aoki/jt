package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

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
	@Test
	public void addで要素を追加するとサイズが1となりgetで取得できる() throws Exception {
		ArrayList<String> sut = new ArrayList<String>();
		sut.add("Hello");
		assertThat(sut.size(), is(1));
		assertThat(sut.get(0), is("Hello"));
	}
	@Test
	public void 要素が2つ追加された状態で要素をremoveするとsizeが1となる() throws Exception {
		// Setup
		ArrayList<String> sut = new ArrayList<String>();
		sut.add("Hello");
		sut.add("World");
		// Exercise
		sut.remove(0);
		// Verify
		assertThat(sut.size(), is(1));
		assertThat(sut.get(0), is("World"));
	}
	@Test
	public void Junitのアサーション() {
		UserForm sut = new UserForm("", "1234");
		Object expected = 108;
		Object actual = sut.doSomething();
		assertThat(actual, is(expected));
	}
	@Test
	public void int型のアサーション() {
		UserForm sut = new UserForm("", "1234");
		int expected = 108;
		int actual = sut.doSomething();
		assertThat(actual, is(expected));
	}
}