package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
public class UserDaoRuleTest {
	private UserDao sut;

	@Rule
	public InMemoryDBRule db = new InMemoryDBRule();

	@Before
	public void setUp() throws Exception {
		sut = new UserDao();
	}

	@Test
	public void getListは0件を返す() throws Exception {
		int actual = sut.getList().size();
		assertThat(actual, is(0));
	}

}
