package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {
	
	// 日本語でTestメソッド名を書くと結果などが非常に見やすいため"推奨"されている．
	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void multiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}

}
