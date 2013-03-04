package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserFormTest {

	@Test
	public void isValidはuserNameとpasswordがから出ない場合にtrueを返す() throws Exception{
		UserForm sut = new UserForm("user01", "1234");
		assertThat(sut.isValid(), is(true));
	}

}
