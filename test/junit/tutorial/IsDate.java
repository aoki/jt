package junit.tutorial;

import java.util.Date;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsDate extends BaseMatcher<Date> {

	public static Matcher<Date> dateOf(int yyyy, int mm, int dd) {
		return new IsDate();
	}

	@Override
	public boolean matches(Object actual) {
		return false;
	}

	@Override
	public void describeTo(Description arg0) {
	}

}
