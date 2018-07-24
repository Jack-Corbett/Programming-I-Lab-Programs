public class Parrot extends Omnivore {

    //Constructor for the Parrot which calls the Omnivore constructor
    public Parrot(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Outputs the parrot's call to the terminal
    public void makeNoise() {
        System.out.println("Squawk");
    }
}
