import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {

    //Declare the array list
    private ArrayList<User> Users;

    //Constructor which instantiates the users array list
    public UserGroup() {
         Users = new ArrayList<User>();
    }

    //Adds 10 default users to the array list
    public void addSampleData() {
        Users.add(new User("Joh", User.Type.user, "John"));
        Users.add(new User("Rya", User.Type.user, "Ryan"));
        Users.add(new User("Nat", User.Type.user, "Nathan"));
        Users.add(new User("Dav", User.Type.editor, "David"));
        Users.add(new User("Ann", User.Type.admin, "Anna"));
        Users.add(new User("Bec", User.Type.admin, "Becky"));
        Users.add(new User("Zoe", User.Type.editor, "Zoe"));
        Users.add(new User("Meg", User.Type.user, "Megan"));
        Users.add(new User("Jam", User.Type.user, "James"));
        Users.add(new User("Ell", User.Type.admin, "Ellie"));
    }

    //Add a user to the array list
    public void addUser(User user) {
        Users.add(user);
    }

    //Fetch the name of a user given their index within the array list
    public String getUser(int index) {
        return Users.get(index).getName();
    }

    //Output each user contained within the array list to the command line
    public void printUsernames() {
        for (User i : Users) {
            System.out.println(i.getName() + "  " + i.getUserType());
        }
    }

    //Remove the first user from the ArrayList
    public void removeFirstUser() {
        Users.remove(0);
    }

    //Remove the last user from the ArrayList
    public void removeLastUser() {
        //We have to take away one as size() returns the number of elements but the index starts from 0
        Users.remove(Users.size() - 1);
    }

    //Removes a user from the ArrayList given their username
    public void removeUser(String username) {

        //Set the iterator to check each element of the Users array list
        Iterator<User> it = Users.iterator();

        //Create a boolean flag which is initially false which will become true when the searched user is found
        boolean found = false;

        //Loop for all elements in the array list until the user has been found
        while(it.hasNext() & !found) {
            User user = it.next();

            //Check if the searched username matches that of the current users
            if (username.equals(user.getUsername())) {
                //If it does remove it from the array list and set found to true to stop searching
                it.remove();
                found = true;
            }
        }
    }

    //Return an iterator object for the Users array list
    public Iterator<User> getUserIterator() {
        return Users.iterator();
    }

    //Return the last user of the Users array list
    public User getLastUser() {
        //We have to take away one as size() returns the number of elements but the index starts from 0
        return Users.get(Users.size() - 1);
    }
}
