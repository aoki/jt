package junit.tutorial;

public class Calculator {
	/**
	 * 引数で与えられた2つの値を掛けあわせた値を返す
	 * @param x 1つ目の引数
	 * @param y 2つ目の引数
	 * @return xとyを掛けあわせた値
	 */
	public int multiply(int x, int y) {
		return x * y;
	}
	public float divide(int x, int y){
		if (y == 0) throw new IllegalArgumentException("dived by zero.");
		return (float)x / (float)y;
	}
}