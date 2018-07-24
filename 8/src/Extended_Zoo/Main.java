package Extended_Zoo;

public class Main {

    public static void main (String[] args) {

        //LAB 6

        //Part 1

        //Instantiate a new wolf and parrot
        Wolf wolf = new Wolf("Ghost", 3);
        Parrot parrot = new Parrot("Percy", 2);

        //Call the name and age get methods for the wolf
        System.out.println("Wolf");
        System.out.println("    Name: " + wolf.getName());
        System.out.println("    Age: " + wolf.getAge());

        System.out.println();

        //Call the name and age get methods for the parrot
        System.out.println("Parrot");
        System.out.println("    Name: " + parrot.getName());
        System.out.println("    Age: " + parrot.getAge());

        //Instantiate meat and plant objects
        Meat beef = new Meat("Beef");
        Plant apple = new Plant("Apple");

        //Part 2

        System.out.println();

        //Call the makeNoise method on the wolf and parrot objects
        wolf.makeNoise();
        parrot.makeNoise();

        System.out.println();

        //Part 3

        //Instantiate a new Extended_Zoo.Giraffe
        Giraffe giraffe = new Giraffe("Geoff", 5);

        //Call the name and get methods for the Extended_Zoo.Giraffe
        System.out.println("Giraffe: ");
        System.out.println("    Name: " + giraffe.getName());
        System.out.println("    Age: " + giraffe.getAge());

        System.out.println();

        //Try catch to test if an animal can eat a given food
        /*try {
            giraffe.eat(beef);
            wolf.eat(apple);
        } catch (Exception e) {
            //If an exception is thrown output the error to the terminal
            System.err.println(e.getMessage());
        }*/

        //LAB 8

        //Part 1.a

        Plant leaf = new Plant("Leaf");

        System.out.println("Giraffe Eating: ");
        try {
            giraffe.eat(leaf, 3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println();

        //Part 1.b
        System.out.println("Wolf Puppy: ");
        Wolf puppy = new Wolf();

        //To show a new instance has been created make the puppy howl
        puppy.makeNoise();

        //Part 2
        /* See Demo Class */
    }
}
