package Extended_Zoo;

public class Wolf extends Carnivore {

    //Constructor for a Extended_Zoo.Wolf which calls the Extended_Zoo.Carnivore constructor
    public Wolf(String setName, Integer setAge) {
        super(setName, setAge);
    }

    public Wolf() {
        super();
    }

    @Override
    //Outputs the wolf's call to the terminal
    public void makeNoise() {
        System.out.println("Howl");
    }

}
