package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void インスタンス化テスト() {
		// Exercise
		Person instance = new Person("Duke");
		// Verify
		assertThat(instance.getName(), is("Duke"));
		assertThat(instance.getAge(), is(-1));
		assertThat(instance.getEmail(), is(nullValue()));
		
	}

}
