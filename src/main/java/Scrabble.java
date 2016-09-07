class Scrabble {
  public Integer mScore = 0;

  public Integer calculateScore(String word) {
    String lowerCaseWord = word.toLowerCase();
    String[] wordArray = lowerCaseWord.split("(?!^)");
    for (String individualLetter : wordArray) {
      if(individualLetter.equals("a") || individualLetter.equals("e") || individualLetter.equals("i") || individualLetter.equals("o") || individualLetter.equals("u") || individualLetter.equals("l") || individualLetter.equals("n") || individualLetter.equals("r") || individualLetter.equals("s") || individualLetter.equals("t")) {
        this.mScore += 1;
      } else if(individualLetter.equals("d") || individualLetter.equals("g")){
        this.mScore += 2;
      } else if(individualLetter.equals("b") || individualLetter.equals("c") || individualLetter.equals("m") || individualLetter.equals("p")) {
        this.mScore += 3;
      } else if(individualLetter.equals("f") || individualLetter.equals("h") || individualLetter.equals("v") || individualLetter.equals("w") || individualLetter.equals("y")) {
        this.mScore += 4;
      } else if(individualLetter.equals("k")) {
        this.mScore += 5;
      } else if(individualLetter.equals("j") || individualLetter.equals("x")) {
        this.mScore += 8;
      } else {
        this.mScore += 10;
      }
    }
    return this.mScore;
  }
}
