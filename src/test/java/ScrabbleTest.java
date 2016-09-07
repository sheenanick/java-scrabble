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
}
