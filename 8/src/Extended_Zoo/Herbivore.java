package Extended_Zoo;

public class Herbivore extends Animal {

    public Herbivore(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Throws an unsupported operation exception if the makeNoise method is called on Extended_Zoo.Herbivore
    public void makeNoise() {
        throw new UnsupportedOperationException();
    }

    @Override
    //As Herbivores only eat plants if the food passed is an instance of plant it will eat it, if not an exception is thrown
    public void eat(Food food) throws Exception {
        if (food instanceof Plant) {
            System.out.println("The animal is eating: " + food.getName());
        } else {
            throw new Exception("The animal cannot eat this");
        }
    }
}
