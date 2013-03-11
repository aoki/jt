package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Date;

import org.junit.Test;

import junit.tutorial.IsDate;

public class CustomMatcherTest {

	@Test
	public void 日付の比較() throws Exception {
		Date date = new Date();
		assertThat(date, is(IsDate.dateOf(2011, 2, 10)));
	}

}
