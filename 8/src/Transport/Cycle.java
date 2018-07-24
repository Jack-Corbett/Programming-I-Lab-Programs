package Transport;

/**
 * Can be ridden on the road but are not a vehicle themselves hence abstract
 */
abstract class Cycle extends RoadVehicle {

    /**
     * Causes the cycle to pedal a given number of times
     */
    void pedal() {

    }

    /**
     * Attaches the chain
     */
    void addChain() {

    }

    /**
     * Rings the bell to alert other vehicles/pedestrians
     */
    void ringBell() {

    }

    abstract void removeWheel();
}
