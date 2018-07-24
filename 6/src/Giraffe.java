public class Giraffe extends Herbivore {

    //Constructor for the Giraffe which calls the Herbivore constructor
    public Giraffe(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Outputs the Giraffe's call to the terminal
    public void makeNoise() {
        System.out.println("Hum");
    }
}
