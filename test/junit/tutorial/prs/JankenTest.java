package junit.tutorial.prs;
import static junit.tutorial.prs.Janken.Hand.*;
import static junit.tutorial.prs.Janken.Result.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class JankenTest {
  private Janken sut;

  @Before
  public void setUp() throws Exception {
    sut = new Janken();
  }

  @Test
  public void グーとチョキなら勝利() throws Exception {
    assertThat(sut.judge(GU, TYOKI), is(WIN));
  }
  @Test
  public void グーとパーなら敗北() throws Exception {
    assertThat(sut.judge(GU, PA), is(LOSE));
  }
  @Test
  public void グーとグーなら引き分け() throws Exception {
    assertThat(sut.judge(GU, GU), is(DRAW));
  }

  @Test
  public void チョキとパーなら勝利() throws Exception {
    assertThat(sut.judge(TYOKI, PA), is(WIN));
  }
  @Test
  public void チョキとグーなら敗北() throws Exception {
    assertThat(sut.judge(TYOKI, GU), is(LOSE));
  }
  @Test
  public void チョキとチョキなら引き分け() throws Exception {
    assertThat(sut.judge(TYOKI, TYOKI), is(DRAW));
  }

  @Test
  public void パーとグーなら勝利() throws Exception {
    assertThat(sut.judge(PA, GU), is(WIN));
  }
  @Test
  public void パーとチョキなら敗北() throws Exception {
    assertThat(sut.judge(PA, TYOKI), is(LOSE));
  }
  @Test
  public void パーとパーなら引き分け() throws Exception {
    assertThat(sut.judge(PA, PA), is(DRAW));
  }
}
