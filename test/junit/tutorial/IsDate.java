package junit.tutorial;

import java.util.Date;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsDate extends BaseMatcher<Date> {

	private final int yyyy;
	private final int mm;
	private final int dd;

	IsDate(int yyyy, int mm, int dd) {
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
	}

	public static Matcher<Date> dateOf(int yyyy, int mm, int dd) {
		return new IsDate(yyyy, mm, dd);
	}

	@Override
	public boolean matches(Object actual) {
		return false;
	}

	@Override
	public void describeTo(Description arg0) {
	}

}
