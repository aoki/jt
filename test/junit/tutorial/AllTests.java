package junit.tutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * プロジェクト全体のテストを行うテストスイート
 */
@RunWith(Suite.class)
@SuiteClasses({ AssertionTest.class, CalcTest.class, CalculatorTest.class,
		CustomMatcherTest.class, PersonTest.class, SomeTests.class,
		TargetClassTest.class, TimeoutTest.class, UserFormTest.class })
public class AllTests {

}
