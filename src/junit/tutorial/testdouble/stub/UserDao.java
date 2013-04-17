package junit.tutorial.testdouble.stub;

import junit.tutorial.User;

public interface UserDao {
  User find(String userId) throws UserNotFoundException;
}
