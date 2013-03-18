package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoRuleTest {
	private UserDao sut;
	private InMemoryDB db;

	@Before
	public void setUp() throws Exception {
		db= new InMemoryDB();
		db.start();
		sut = new UserDao();
	}

	@After
	public void tearDown() throws Exception {
		db.shutdownNow();
	}

	@Test
	public void getListは0件を返す() throws Exception {
		int actual = sut.getList().size();
		assertThat(actual, is(0));
	}

}
