package Extended_Zoo;

public class Omnivore extends Animal {

    //Constructor for an Extended_Zoo.Omnivore which calls the Extended_Zoo.Animal constructor
    public Omnivore(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Throws an unsupported operation exception if the makeNoise method is called on Extended_Zoo.Carnivore
    public void makeNoise() {
        throw new UnsupportedOperationException();
    }

    @Override
    //As the omnivore eats meat and plants it eats the food regardless of type
    public void eat(Food food) {
        System.out.println("The animal is eating: " + food.getName());
    }

}
