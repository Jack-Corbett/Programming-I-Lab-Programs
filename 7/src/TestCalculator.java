/**
 * A test harness for the calculator class to check it functions correctly for a range of inputs
 */
class TestCalculator {

	private Calculator calculator;

    /**
     * Constructor instantiates a new calculator to test and stores it in the instance variable calculator
     */
	TestCalculator() {
		calculator = new Calculator();
	}

    /**
     * Test method to check strings are handled correctly and interpreted as a calculation
     * @return Test result: true (pass), false (fail)
     */
	Boolean testParser() {
		//Set the testPass boolean flag to true to begin with
		Boolean testPass = true;

		if (calculator.x("12 + 5") != 17) {
		    System.out.println("[FAIL] Basic parsing fails to add.");
			testPass = false;
		} else {
		    System.out.println("[ OK ] Parser adds correctly.");
        }

		if (calculator.x("12 x 5") != 60) {
		    System.out.println("[FAIL] Basic parsing fails to multiply.");
			testPass = false;
		} else {
		    System.out.println("[ OK ] Parser multiplies correctly.");
        }

		if (calculator.x("12 [ 3") != null) {
		    System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
			testPass = false;
		} else {
		    System.out.println("[ OK ] Parser returns null for operators which are not supported.");
        }

		return testPass;
	}

    /**
     * Test method to check addition is performed correctly for both positive and negative doubles
     * @return Test result: true (pass), false (fail)
     */
	Boolean testAdd() {
        //Set the testPass boolean flag to true to begin with
	    Boolean testPass = true;

	    // Adding Positive numbers
	    Double positiveNum = 5.5;
		calculator.x = 4.5;
		if (calculator.x(positiveNum) != 10) {
            System.out.println("[FAIL] Calculator adds incorrectly");
            testPass = false;
        } else {
		    System.out.println("[ OK ] Calculator can add positive numbers");
        }

		// Adding Negative numbers
        Double negativeNum = -5.5;
		calculator.x = -4.5;
		if(calculator.x(negativeNum) != -10) {
		    System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
		    testPass = false;
        } else {
		    System.out.println("[ OK ] Calculator can add a negative number");
        }

		return testPass;
	}

    /**
     * Test method to check multiplication is performed correctly for both positive and negative doubles
     * @return Test result: true (pass), false (fail)
     */
	Boolean testMultiplication() {
        //Set the testPass boolean flag to true to begin with
	    Boolean testPass = true;

	    // Multiplying Positive numbers
	    double positiveNum = 3.6;
		calculator.x = 2.5;
		if(calculator.x(positiveNum) != 9) {
		    System.out.println("[FAIL] Calculator multiplies incorrectly");
		    testPass = false;
        } else {
		    System.out.println("[ OK ] Calculator can multiply positive numbers");
        }

        // Multiplying Negative numbers
        double negativeNum = -3.6;
        calculator.x = -2.5;
        if (calculator.x(negativeNum) != 9) {
            System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
            testPass = false;
        } else {
            System.out.println("[ OK ] Calculator can multiply by a negative number");
        }

		return testPass;
	}

}