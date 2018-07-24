package Extended_Zoo;

public class Parrot extends Omnivore {

    //Constructor for the Extended_Zoo.Parrot which calls the Extended_Zoo.Omnivore constructor
    public Parrot(String setName, Integer setAge) {
        super(setName, setAge);
    }

    public Parrot(Integer setAge) {
        super("Polly", setAge);
    }

    @Override
    //Outputs the parrot's call to the terminal
    public void makeNoise() {
        System.out.println("Squawk");
    }
}
