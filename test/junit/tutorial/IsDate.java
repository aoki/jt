package junit.tutorial;

import java.util.Date;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class IsDate extends BaseMatcher<Date> {

	@Override
	public boolean matches(Object actual) {
		return false;
	}

	@Override
	public void describeTo(Description arg0) {
	}

}
