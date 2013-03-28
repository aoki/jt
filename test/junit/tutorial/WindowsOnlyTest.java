package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class WindowsOnlyTest {

  @Test
  public void windows環境では改行はrn() throws Exception {
    assumeTrue(System.getProperty("os.name").contains("Windows"));
    System.out.println("OS is \"" + System.getProperty("os.name") + "\"");
    assertThat(System.getProperty("line.separator"), is("\r\n"));
  }

  @Test
  public void mac環境では改行はn() throws Exception {
    assumeTrue(System.getProperty("os.name").contains("Mac OS X"));
    System.out.println("OS is \"" + System.getProperty("os.name") + "\"");
    assertThat(System.getProperty("line.separator"), is("\n"));
  }
}
