package Extended_Zoo;

public class Giraffe extends Herbivore {

    //Constructor for the Extended_Zoo.Giraffe which calls the Extended_Zoo.Herbivore constructor
    public Giraffe(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Outputs the Extended_Zoo.Giraffe's call to the terminal
    public void makeNoise() {
        System.out.println("Hum");
    }
}
