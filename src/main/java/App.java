import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println ("Enter a word to check its Scrabble score.");
    String word = console.readLine();
    Scrabble scrabble = new Scrabble();
    System.out.println("The scrabble score for '" + word + "' is " + scrabble.calculateScore(word) + ".");
  }
}
