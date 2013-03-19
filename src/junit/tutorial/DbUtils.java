package junit.tutorial;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * テスト用に作成したクラス 本物のDbUtilsではありません
 * 
 * @author ringo
 * 
 */
public class DbUtils {
  public static List<User> dummyList = new ArrayList<User>();

  public static void drop(String str) {
    dummyList = new ArrayList<User>();
  }

  public static void insert(String string, URL resource) {
    for (int i = 0; i < 100; i++) {
      dummyList.add(new User());
    }
  }
}
