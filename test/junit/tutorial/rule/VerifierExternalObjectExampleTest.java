package junit.tutorial.rule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierExternalObjectExampleTest {
  ErrorLog log = new ErrorLog();
  @Rule
  public ErrorLogVerifier errorLogVerifier = new ErrorLogVerifier(log);

  @Test
  public void testCase() throws Exception {
  }
}

class ErrorLogVerifier extends Verifier {
  final ErrorLog log;

  ErrorLogVerifier(ErrorLog log) {
    this.log = log;
  }

  @Override
  protected void verify() throws Throwable {
    assertThat(log.size(), is(not(0)));
  }
}
