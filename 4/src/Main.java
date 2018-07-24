import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //Instantiates the scanner class to read from the command line
        Scanner in = new Scanner(System.in);
        int choice;

        //Output the menu options to the user
        System.out.println("1. Times tables");
        System.out.println("2. Successive Integers");
        System.out.println("3. Array List Demo");
        System.out.print("Select your choice: ");
        choice = in.nextInt();

        //Part 1.1
        if (choice == 1) {
            //Stores the number that will be used to calculate the times table
            int timesTable;

            //Takes input of this number from the user using the scanner class
            System.out.print("What times table do you wish to calculate? ");
            timesTable = in.nextInt();

            //Loops 20 times to display the times table up to 20 and increments i each time
            for (int i = 1; i < 21; i++) {
                //Output the calculated value
                System.out.print(timesTable * i);

                //Conditional formatting
                //Don't output , for last outputted value
                if (i != 20) {
                    System.out.print(", ");
                }
            }

        //Part 1.2
        } else if (choice == 2) {
            int total = 0;

            /* By starting from 0 and incrementing add at the start of the loop rather than the end
            we don't need to take away one when we output the number of iterations */
            int add = 0;

            //Keep looping until the total is greater than 500
            while (total < 500) {
                //Increment add by 1
                add++;
                //Add add to the total so far
                total = total + add;
                //Output the total each time to make it easier to check
                System.out.println(total);
            }
            //Output the number of iterations taken to the command line
            System.out.println("It took: " + add + " iterations");

        //Part 2/3
        } else if (choice == 3) {

            //Part 2
            //Create a new UserGroup called users
            UserGroup users = new UserGroup();

            //Add the 10 default users to the users UserGroup
            users.addSampleData();

            //Output the names and types of the users from the users UserGroup
            users.printUsernames();

            //Part 3
            //Create a new UserGroup called administrators
            UserGroup administrators = new UserGroup();

            //Get the iterator from the users UserGroup object
            Iterator<User> it = users.getUserIterator();

            //Iterate through the array list
            while(it.hasNext()) {
                User user = it.next();

                /* If the user is of the user type admin then add them to the administrators array list
                and remove them from the users array list */
                if (user.getUserType().equals("admin")) {
                    administrators.addUser(user);
                    it.remove();
                }
            }

            System.out.println();

            //Output the list of administrators
            System.out.println("Administrators: ");
            administrators.printUsernames();
            System.out.println();

            //Change the user type of the last user in administrators array list back to user
            administrators.getLastUser().setUserType(User.Type.user);

            //Output both user groups with a line space in between
            System.out.println("Users: ");
            users.printUsernames();

            System.out.println();

            System.out.println("Administrators: ");
            administrators.printUsernames();

            /*
            This leads to inconsistency as a non admin user can still be in the admin array list even after their permissions
            have changed. There are a couple of ways to avoid this:
                * Only allow a change of user type in the same method that moves the user between array lists to ensure the
                  two cannot be done independently
                * A more elegant solution would be to scrap the user type completely and instead use the array lists as
                  their type. Therefore the array list they are currently in dictates their user type this way it isn't
                  possible for a user to be in the wrong array list.
             */
        }
    }
}
