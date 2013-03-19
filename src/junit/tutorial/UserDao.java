package junit.tutorial;

import java.util.List;

/**
 * テスト用のクラス
 * 
 * @author ringo
 * 
 */
public class UserDao {

  public static List<User> dummyUserList;

  UserDao() {
    dummyUserList = DbUtils.dummyList;
  }

  public List<User> getList() {
    return dummyUserList;
  }
}
