package junit.tutorial.registration;

public class Registration {
  /**
   * 年齢を指定して、会員制サイトへ登録できるか返す
   * @param age 年齢
   * @return 18歳以上ならばtrueを、18歳未満ならばfalse
   */
  public static boolean canRegister(int age) {
    return 18 <= age;
  }

  /**
   * 優待会員かどうかを返す
   * @param age 年齢
   * @param isRegisterMailMagazine メールマガジンに登録している場合にtrue
   * @param usePastMonth 前月の利用回数
   * @return 20歳位上であり、メールマガジンに登録してあり、かつ先月の利用回数が1回以上ならtrue
   */
  public static boolean isSpecialMember(int age, boolean isRegisterMailMagazine, int usePastMonth) {
    if (age < 20) return false;
    if (!isRegisterMailMagazine) return false;
    if (usePastMonth < 1) return false;
    return true;
  }
}
