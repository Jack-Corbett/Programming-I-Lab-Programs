/**
 * Main method to run the program which calls the testing methods on the TestCalculator class
 * @author Jack Corbett
 */
public class Main {

	public static void main(String[] args) {
	    // Instantiate a new calculator tester object
		TestCalculator testCalculator = new TestCalculator();

		// Create boolean flags for each test
		Boolean result1, result2, result3;

		// Run each test by calling the methods on the calculator tester and store the results
		result1 = testCalculator.testParser();
		result2 = testCalculator.testAdd();
		result3 = testCalculator.testMultiplication();

		// If all the results are true, indicating all tests have passed, output congratulations message to console
		if (result1 && result2 && result3) {
		    System.out.println("Congratulations, your Calculator appears to be working.");
        }
	}
}