package junit.tutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// CalclatorTest と UserFormTest を含むテストスイート
@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, UserFormTest.class })
public class SomeTests {
	// テストスイートクラスでメソッドの実装は不要
}
