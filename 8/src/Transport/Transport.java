package Transport;

/**
 * A way of conveying people or goods from one place to another, covers all other classes so is therefore the root
 */
abstract class Transport {

    /* Sets the name of the mode of transport */
    public void setName() {

    }

    /* Sets the number of people the transport can carry */
    public void setCapacity() {

    }

    /**
     * Slows down the vehicle
     */
    void brake() {

    }

    /**
     * Speeds up the vehicle
     */
    void accelerate() {

    }
}
