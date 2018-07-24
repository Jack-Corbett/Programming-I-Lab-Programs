public class GuessingGame {

  public static void main(String[] args) {
    Integer numberToGuess;
    Integer guessedNumber;
    Integer guessingRange;
    Toolbox myToolbox = new Toolbox();

    System.out.println("Welcome to the number guessing game!");

    //Set the range of numbers for the user to guess from
    System.out.print("What is the maximum range you want to guess from? ");
    guessingRange = myToolbox.readIntegerFromCmd();
    numberToGuess = myToolbox.getRandomInteger(guessingRange);
    System.out.print("Now start guessing! ");

    //Checks the users guess and loops until correct
    do {
      //Takes input from the user
      guessedNumber = myToolbox.readIntegerFromCmd();
      if (guessedNumber > numberToGuess) {
        System.out.println("Too high!");
      } else if (guessedNumber < numberToGuess) {
        System.out.println("Too low!");
        //This could also be achieved by simply using an else statement
      } else if (numberToGuess.equals(guessedNumber)) {
        System.out.println("Well done you guessed corectly!");
      }
    } while (!numberToGuess.equals(guessedNumber));
  }
}
