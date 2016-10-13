import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyfierTest {
  @Test
  public void shouldNotMommyfyEmptyString() {
    String mommyfiedString = new Mommyfier().mommyfy("");

    assertEquals("", mommyfiedString);
  }

  @Test
  public void shouldNotMommyfyAStringWithoutVowels() {
    String sky = "sky";
    String mommyfiedString = new Mommyfier().mommyfy(sky);
    assertEquals(sky, mommyfiedString);
  }

  @Test
  public void shouldMommyfySingleVowel() {
    assertEquals("mommy", new Mommyfier().mommyfy("a"));
    assertEquals("mommy", new Mommyfier().mommyfy("e"));
    assertEquals("mommy", new Mommyfier().mommyfy("i"));
    assertEquals("mommy", new Mommyfier().mommyfy("o"));
    assertEquals("mommy", new Mommyfier().mommyfy("u"));
  }

  @Test
  public void shouldReturnMommyOnceForConsecutiveVowels() {
    assertEquals("mommy", new Mommyfier().mommyfy("ae"));
  }


  @Test
  public void shouldMommyfyNonConsecutiveVowels() {
    assertEquals("mommyymommy", new Mommyfier().mommyfy("eye"));
  }
}
