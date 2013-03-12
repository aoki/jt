package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

// TestRunnerの設定
// 省略した場合は JUnit4.class が利用される
// JUnit4.class: @Test が付いているテストケース全て収集して実行する
@RunWith(JUnit4.class)
public class CalcTest {

	@Test
	public void addに3と4を与えると7を返す() {
		Calc sut = new Calc();
		assertThat(sut.add(3,4), is(7));
	}

	// エントリーポイント
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main(CalcTest.class.getName());
	}
}
