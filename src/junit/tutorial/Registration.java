package junit.tutorial;

public class Registration {
  /**
   * 年齢を指定して、会員制サイトへ登録できるか返す
   * @param age 年齢
   * @return 18歳以上ならばtrueを、18歳未満ならばfalse
   */
  public static boolean canRegister(int age) {
    return 18 <= age;
  }
}
