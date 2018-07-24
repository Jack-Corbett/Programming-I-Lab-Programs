public class GuessingGame {

  public static void main(String[] args) {
    Integer numberToGuess;
    Integer guessedNumber;
    Toolbox myToolbox = new Toolbox();

    System.out.println("Welcome to the number guessing game!");

    //Picks a random number between 1 and 10
    numberToGuess = myToolbox.getRandomInteger(10);

  	//Takes input from the user
  	guessedNumber = myToolbox.readIntegerFromCmd();
  	if (guessedNumber > numberToGuess) {
  	  System.out.println("Too high!");
  	} else if (guessedNumber < numberToGuess) {
  	  System.out.println("Too low!");
  	  //This could also be achieved by using an else statement
  	} else if (numberToGuess.equals(guessedNumber)) {
  	  System.out.println("Well done you guessed corectly!");
  	}
  }
}
