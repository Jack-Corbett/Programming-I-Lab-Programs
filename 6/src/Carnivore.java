public class Carnivore extends Animal {

    public Carnivore(String setName, Integer setAge) {
        super(setName, setAge);
    }

    @Override
    //Throws an unsupported operation exception if the makeNoise method is called on Carnivore
    public void makeNoise() {
        throw new UnsupportedOperationException();
    }

    @Override
    //If the food passed is meat it is eaten, if not it throws an exception
    public void eat(Food food) throws Exception {
        if (food instanceof Meat) {
            System.out.println("The animal is eating: " + food.getName());
        } else {
            //This message is returned and printed in the try/catch statement
            throw new Exception("The animal cannot eat this");
        }
    }
}
