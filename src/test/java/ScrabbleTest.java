import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void
  calculateScore_returnsScoreForTwoLetters_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("aa"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoLettersWorthDifferentPoints_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("do"));
  }

  @Test
  public void calculateScore_returnsScoreForWordWithLettersFromAllCategories_33() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 33;
    assertEquals(expected, testScrabble.calculateScore("adbfkjq"));
  }

  @Test
  public void calculateScore_returnsScoreForWordWithMixedCase_33() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 33;
    assertEquals(expected, testScrabble.calculateScore("AdbFkjq"));
  }

  @Test
  public void calculateScore_returnsScoreForAnyLetter_87() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 87;
    assertEquals(expected, testScrabble.calculateScore("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
  }
}
