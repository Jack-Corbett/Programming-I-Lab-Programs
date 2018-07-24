/**
 * Represents a flash card which has a question and answer.
 */
class FlashCard {

    /**
     * Strings to store the question and answer
     */
    private String question, answer;

    /**
     * Constructor that sets the member variables.
     * @param setQuestion Sets the flash card question.
     * @param setAnswer Sets the flash card answer.
     */
    FlashCard(String setQuestion, String setAnswer) {
        question = setQuestion;
        answer = setAnswer;
    }

    /**
     * Gets the question.
     * @return Question as a string.
     */
    String getQuestion() {
        return question;
    }

    /**
     * Gets the answer.
     * @return Answer as a string.
     */
    String getAnswer() {
        return answer;
    }
}
