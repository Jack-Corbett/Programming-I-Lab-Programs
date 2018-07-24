import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Runs the quiz by outputting the flashcard questions and checking the users answer.
 */
public class Quiz {

    /**
     * Array list to store the flashcards to test the user on.
     */
    private ArrayList<FlashCard> quizFlashCards = new ArrayList<>();

    /**
     * Scanner object for reading user input from the command line.
     */
    private Scanner in = new Scanner(System.in);

    /**
     * String builder to construct the string to be written to the save file.
     */
    private StringBuilder builder = new StringBuilder();

    /**
     * Cold starts the program by instantiating a new quiz object.
     */
    public static void main(String[] args) {
        new Quiz();
    }

    /**
     * Quiz constructor which instantiates a flash card reader, gets the flash cards and starts the quiz.
     */
    private Quiz() {
        FlashCardReader cardReader = new FlashCardReader();
        // Get the flash cards array list using the method in FlashCardReader.
        quizFlashCards = cardReader.getFlashCards();
        play();
    }

    /**
     * Outputs the questions and checks the users answer.
     */
    private void play() {
        String userAnswer;
        // Stores the number of correct answers the user has given.
        Integer numCorrect = 0;

        // Loop for each flashcard in the array list
        for (FlashCard card : quizFlashCards) {
            // Output the question to the console
            System.out.println(card.getQuestion());
            // Add the question to the save file string
            builder.append(card.getQuestion()).append(", ");

            // Read the users answer from the command line
            userAnswer = in.nextLine();
            // Add it to the save file string
            builder.append(userAnswer).append(", ");

            /* If their answer matches the flashcard answer write correct and add this to the save file string.
             * Also increment the number of correct answers.
             * Otherwise output incorrect, add this to the save file string and output the correct answer. */
            if (userAnswer.equals(card.getAnswer())) {
                System.out.println("Correct!");
                builder.append("Correct");
                numCorrect ++;
            } else {
                System.out.println("Incorrect!");
                builder.append("Incorrect");
                System.out.println("The correct answer was: " + card.getAnswer());
            }

            // Add a new line character to the save file string
            builder.append(System.lineSeparator());
            System.out.println();
        }

        /* Ask the user if they want to save their score.
         * If so call the save method passing the number of correct answers. */
        System.out.println("Do you want to save your score? Y/N");
        if (in.nextLine().equals("Y")) {
            save(numCorrect);
        }
    }

    /**
     * Write the quiz result to a file called Save.txt including calculating their percentage score.
     * @param numCorrect Stores the number of correct answers given by the user.
     */
    private void save(Integer numCorrect) {
        try {
            // Instantiate a PrintWriter object to write to the save file
            PrintWriter writer = new PrintWriter("Save.txt", "UTF-8");

            // Use the writer to write the string builder object containing the questions, user answer and results
            writer.println(builder);

            writer.println("SUMMARY:");
            // Write the number of correct answers, the number of questions and the percentage correct
            writer.println("You scored " + numCorrect + " out of " + quizFlashCards.size() +
                    " which is " + (((double)numCorrect / (double)quizFlashCards.size()) * 100) + "%");
            writer.close();
        } catch (Exception e) {
            System.err.println("Failed to save result to file.");
        }
    }
}
