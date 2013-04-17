package junit.tutorial.testdouble.stub;

import junit.tutorial.User;

public class UserDaoStub implements UserDao {

  @Override
  public User find(String userId) throws UserNotFoundException {
    throw new UserNotFoundException("connection error");
  }

}
