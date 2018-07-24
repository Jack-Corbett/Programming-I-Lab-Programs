
public class ATM {
	int bankBalance;
	Toolbox myToolbox = new Toolbox();

	public static void main(String[] args) {
		ATM myATM = new ATM();
		myATM.go();
	}

	public void go() {
		System.out.println("Welcome to online ATM banking");
		do {
			System.out.println("How much do you want in your account?");
			bankBalance = myToolbox.readIntegerFromCmd();
		} while (bankBalance < 0); //Loop to ensure they don't input a negative balance

		while (true) {
			int menuChoice;
			//Output menu choices
			System.out.println("What do you want to do?");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Inquire");
			System.out.println("4 : Quit");
			menuChoice = myToolbox.readIntegerFromCmd();

			//Run the correct method depending on the users input
			if (menuChoice == 1) {
				withdraw();
			} else if (menuChoice == 2) {
				deposit();
			} else if (menuChoice == 3) {
				inquire();
			} else if (menuChoice == 4) {
				quit();
			} else {
				System.out.println("Please choose a menu option by entering the numbers 1-4");
			}
		}
	}

	public void withdraw() {
		int withdrawAmount;
		System.out.println("*****************************************");
		System.out.println("              Withdrawal                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		withdrawAmount = myToolbox.readIntegerFromCmd();
		//Display an error if they enter a negative number
		if (withdrawAmount < 0) {
			System.out.println("Error - please input a number greater than 0");
			//Display an error if they do not have enough money to withdraw the inputted amount
		} else if (bankBalance - withdrawAmount < 0) {
			System.out.println("Error - you do not have sufficient funds to withdraw this amount");
		} else {
			bankBalance = bankBalance - withdrawAmount;
		}
	}

	public void deposit() {
		int depositAmount;
		System.out.println("*****************************************");
		System.out.println("               Deposit                   ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit?");
		depositAmount = myToolbox.readIntegerFromCmd();
		//Display an error if they try to withdraw a negative number
		if (depositAmount < 0) {
			System.out.println("Error - please input a number greater than 0");
		} else {
			bankBalance = bankBalance + depositAmount;
		}
	}

	public void inquire() {
		System.out.println("*****************************************");
		System.out.println("          Your balance is " + bankBalance);
		System.out.println("*****************************************");
	}

	public void quit() {
		System.out.println("*****************************************");
		System.out.println("               Goodbye                   ");
		System.out.println("*****************************************");
		System.exit(0);
	}
}
