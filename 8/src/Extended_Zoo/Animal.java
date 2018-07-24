package Extended_Zoo;

/**
 * Represents an animal setting it's name and age and providing abstract methods
 */
abstract public class Animal implements Comparable<Animal> {

    private String name;
    private Integer age;

    /**
     * The constructor for an animal which sets it's name and age
     * @param setName The name of the animal
     * @param setAge The age of the animal in years
     */
    public Animal(String setName, Integer setAge) {
        name = setName;
        age = setAge;
    }

    /**
     * Calls the above constructor giving a default for the name of newborn and an age of 0
     */
    public Animal() {
        this("newborn", 0);
    }

    /**
     * Compares the ages of two animals
     * @param o An animal object
     * @return 0 if they are the same age, positive if this animal is older than the passed animal
     *         and negative if the animal is younger than the passed animal
     */
    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }


    /**
     * Abstract method so all animals must make a noise
     */
    abstract public void makeNoise();

    /**
     * Abstract method for an animal to eat one item of food
     * @param food A food instance to be eaten
     * @throws Exception If the animal cannot eat the food passed
     */
    abstract public void eat(Food food) throws Exception;

    /**
     * Method for an animal to eat multiple items of food
     * @param food A food instance to be eaten
     * @param noTimes How many times to eat that item of food
     * @throws Exception If the animal cannot eat the food passed
     */
    public void eat(Food food, Integer noTimes) throws Exception {
        for (int i = 0; i < noTimes; i++) {
            eat(food);
        }
    }

    /**
     * Get the animals name
     * @return Name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animals age
     * @return Age as an Integer
     */
    public Integer getAge() {
        return age;
    }
}


