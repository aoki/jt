package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void assertion() {
		String actual = "Hello" + " " + "World";
		assertThat(actual, is("Hello World"));
	}

}
