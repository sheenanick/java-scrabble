class Scrabble {
  public Integer mScore = 0;

  public Integer calculateScore(String word) {
    String[] wordArray = word.split("(?!^)");
    for (String individualLetter : wordArray) {
      if(individualLetter.equals("a") || individualLetter.equals("e") || individualLetter.equals("i") || individualLetter.equals("o") || individualLetter.equals("u") || individualLetter.equals("l") || individualLetter.equals("n") || individualLetter.equals("r") || individualLetter.equals("s") || individualLetter.equals("r")) {
        this.mScore += 1;
      } else if(individualLetter.equals("d") || individualLetter.equals("g")){
        this.mScore += 2;
      }
    }
    return this.mScore;
  }
}
