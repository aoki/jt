package junit.tutorial;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CustomMatcherTest {

	@Test
	public void 日付の比較() throws Exception {
		Date date = new Date();
		assertThat(date, is(dateOf(2011, 2, 10)));
	}

}
