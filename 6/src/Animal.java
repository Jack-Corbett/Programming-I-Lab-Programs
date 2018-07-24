abstract public class Animal {

    private String name;
    private Integer age;

    //The default constructor for an animal which sets it's name and age
    public Animal(String setName, Integer setAge) {
        name = setName;
        age = setAge;
    }

    //Using abstract methods means that any class that extends Animal must implement those methods

    //Implemented by child classes
    abstract public void makeNoise();

    //Implemented by child classes
    abstract public void eat(Food food) throws Exception;

    //Returns the name of the animal
    public String getName() {
        return name;
    }

    //Returns the age of the animal
    public Integer getAge() {
        return age;
    }
}


