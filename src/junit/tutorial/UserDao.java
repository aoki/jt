package junit.tutorial;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private List<User> dummyUserList = new ArrayList<User>();

	public List<User> getList() {
		return dummyUserList;
	}
}
