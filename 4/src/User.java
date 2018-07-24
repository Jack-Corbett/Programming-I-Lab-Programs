public class User {

    private String username;
    private Type userType;
    private String name;

    //User constructor that sets the class variables
    public User(String inputUsername, Type inputUserType, String inputName) {
        username = inputUsername;
        userType = inputUserType;
        name = inputName;
    }

    //Getter method for the users username
    public String getUsername() {
        return username;
    }

    //Getter method for the users type
    public String getUserType() {
        return userType.name();
    }

    //Getter method for the users name
    public String getName() {
        return name;
    }

    //Setter to change the users type
    public void setUserType(Type inputUserType) {
        userType = inputUserType;
    }

    //Using an enum means a new user can ONLY be assigned the user, editor or admin type
    public enum Type {
        user, editor, admin
    }

}
