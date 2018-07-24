public class Wolf extends Carnivore {

    //Constructor for a Wolf which calls the Carnivore constructor
    public Wolf(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Outputs the wolf's call to the terminal
    public void makeNoise() {
        System.out.println("Howl");
    }

}
