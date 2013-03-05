package junit.tutorial;

public class UserForm {
	private final String userName;
	private final String password;
	
	public UserForm(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public boolean isValid() {
		return !userName.equals("") && !password.equals(""); 
	}
	
	public String getErrorMessage() {
		return "ユーザIDは必須項目です。";
	}
	
	// 副作用のないメソッド。何度実行してもオブジェクトに影響はない。
	public static boolean isEmptyOrNull(String value) {
		return value == null || value.isEmpty();
	}
}
