import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordPuzzleTest {
  @Test
  public void stringToWordPuzzle_Replace_a_WithDash_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l", testWordPuzzle.stringToWordPuzzle("lal"));
  }
  @Test
  public void stringToWordPuzzle_Replace_ae_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l", testWordPuzzle.stringToWordPuzzle("lalel"));
  }
  @Test
  public void stringToWordPuzzle_Replace_aei_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l-l", testWordPuzzle.stringToWordPuzzle("lalelil"));
  }
  @Test
  public void stringToWordPuzzle_Replace_aeio_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l-l-l", testWordPuzzle.stringToWordPuzzle("lalelilol"));
  }
  @Test
  public void stringToWordPuzzle_Replace_aeiou_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l-l-l-l", testWordPuzzle.stringToWordPuzzle("lalelilolul"));
  }
  @Test
  public void stringToWordPuzzle_Replace_AEIOU_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l-l-l-l", testWordPuzzle.stringToWordPuzzle("lAlElIlOlUl"));
  }
}
