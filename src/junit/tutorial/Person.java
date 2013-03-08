package junit.tutorial;

public class Person {

	private final String name;
	private final int age;
	private final String email;

	Person(String name) {
		this.name = name;
		age = -1;
		email = null;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
}
