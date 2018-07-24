import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Reads from a file to create an array list of flashcards with questions and answers.
 */
class FlashCardReader {

    /**
     * Buffer reader object to read from a file.
     */
    private BufferedReader reader;

    /**
     * Array list to store the flash cards.
     */
    private ArrayList<FlashCard> flashCards = new ArrayList<>();

    /**
     * Constructor which reads from the file and instantiates the flashcards while adding them to the array list.
     */
    FlashCardReader() {
        try {
            // Instantiate a new buffered reader and file reader to read the questions file
            reader = new BufferedReader(new FileReader("Questions.txt"));

            // If the file is ready to be read create the flash cards. Otherwise throw an exception.
            if (readyToRead()) {
                // Use the getLine method to read the first line of the file
                String line = getLine();

                // A string array to store the separated question and answer
                String[] splitLine;

                // Keep reading while the line read from the file isn't empty
                while (line != null) {
                    // Separate the question from the answer
                    splitLine = line.split(":");

                    // Instantiate a new flash card passing the question and answer
                    flashCards.add(new FlashCard(splitLine[0], splitLine[1]));

                    // Fetch the next line from the file
                    line = getLine();
                }
            } else throw new Exception();
        } catch (FileNotFoundException e) {
            System.err.println("Failed to find file");
        } catch (Exception e) {
            System.err.println("Failed to read from file");
        }
    }

    /**
     * Use the buffer reader to read the file.
     * @return The next line of the questions file.
     * @throws Exception If the reader cannot read the line.
     */
    private String getLine() throws Exception {
        return reader.readLine();
    }

    /**
     * Check if the file is ready to be read
     * @return True if the reader is ready, false if not.
     * @throws Exception If the reader is unable to check if the file is ready to read.
     */
    private Boolean readyToRead() throws Exception {
        return reader.ready();
    }

    /**
     * Gets the flash cards.
     * @return The array list of flash cards.
     */
    ArrayList<FlashCard> getFlashCards() {
        return flashCards;
    }
}
