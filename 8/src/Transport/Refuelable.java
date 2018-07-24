package Transport;

/**
 * An interface as methods will need to be used by multiple different classes throughout the inheritance tree
 */
public interface Refuelable {

    /**
     * Fills the fuel tank to it's maximum
     */
    void fillFuelTank();

    /**
     * Add a given number of litres of fuel
     */
    void addFuel();

    /**
     * Decrements the current fuel level by a given amount
     */
    void useFuel();

}
