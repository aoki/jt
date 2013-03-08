package junit.tutorial;

public class Calculator {

	public Calculator() {
		System.out.println("[C]Create new Calculator object.");
	}

	/**
	 * 初期化処理
	 */
	public void init(){
		System.out.println("\t[I]Initialize Calculator object.");
	}

	/**
	 * 後処理
	 */
	public void shutdown(){
		System.out.println("\t\t[S]Shutdown Calculator object.");
	}

	/**
	 * 引数で与えられた2つの値を掛けあわせた値を返す
	 * @param x 1つ目の引数
	 * @param y 2つ目の引数
	 * @return xとyを掛けあわせた値
	 */
	public int multiply(int x, int y) {
		return x * y;
	}

	/**
	 * 引数で与えられた2つの値を除算した値を返す
	 * @param x 1つ目の引数
	 * @param y 2つ目の引数
	 * @return xとyを除算した値
	 */
	public float divide(int x, int y){
		if (y == 0) throw new IllegalArgumentException("dived by zero.");
		return (float)x / (float)y;
	}

	/**
	 * 引数で与えられた2つの値を加算した値を返す
	 * @param x 1つ目の引数
	 * @param y 2つ目の引数
	 * @return xとyを加算した値
	 */
	public int add(int x, int y){
		return x + y;
	}
}