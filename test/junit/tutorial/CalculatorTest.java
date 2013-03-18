package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class CalculatorTest {

	private static final Calculator sut = new Calculator();

	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Setup the CalculatorTest class.");
	}

	@Before
	public void setUp() throws Exception {
		sut.init();
	}

	@After
	public void tearDown() throws Exception {
		sut.shutdown();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("Teardown the CalculatorTest class.");
	}

	// 日本語でTestメソッド名を書くと結果などが非常に見やすいため"推奨"されている．
	@Test
	public void multiplyで3と4の乗算結果が取得できること() throws Exception {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
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
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}
	@Test
	public void divideで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test
	public void addに3と4を与えると7を返す() throws Exception {
		// SetUp - 初期化
		Calculator sut = new Calculator();
		sut.init();
		// Exercise - テストの実行
		int actual = sut.add(3, 4);
		// Verify - 検証
		assertThat(actual, is(7));
		// TearDown - 後処理
		sut.shutdown();
	}

	@Test(expected = IllegalArgumentException.class)
	public void dvideで5と0のときIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}
	@Ignore("未実装")
	@Test
	public void divideに4と2を与えると2を返す() throws Exception {
		Calculator sut = new Calculator();
		// Exercise - テストの実行
		float actual = sut.divide(3, 4);
		// Verify - 検証
		assertThat(actual, is(7F));
	}

}
