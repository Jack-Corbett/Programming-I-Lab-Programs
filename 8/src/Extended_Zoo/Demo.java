package Extended_Zoo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Part 2
 * Used to demonstrate sorting an array list using collections
 */
public class Demo {

    public static void main(String[] args) {
        /* Instantiate a new array list of animals */
        ArrayList<Animal> animals = new ArrayList<>();

        /* Instantiate a range of animals to add to the array list
        The Parrot will use the default name of Polly and the first wolf will be a newborn*/
        Parrot parrot = new Parrot(2);
        Giraffe giraffe = new Giraffe("Jon", 5);
        Wolf wolf = new Wolf();
        Wolf wolf1 = new Wolf("Fang", 5);

        /* Add the animals to the array list */
        animals.add(parrot);
        animals.add(giraffe);
        animals.add(wolf);
        animals.add(wolf1);

        /* An interface contains only abstract methods while an abstract class can contain
           both abstract and concrete methods. You can also only inherit from only a single
           abstract class while you can use multiple interfaces per class.
         */

        /* Output all animals before ordering */
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
        }

        System.out.println();
        System.out.println("Sorting the array list...");
        System.out.println();
        /* Use collections to sort the animals by increasing age using the compareTo method in the Animal class */
        Collections.sort(animals);

        /* Output all the animals after ordering */
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
        }

        /* We could reverse the order to sort from high to low by swapping this.getAge() and o.getAge()
           in the compareTo method in the Animal class
         */
    }
}
