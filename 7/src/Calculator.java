/**
 * Performs numerical operations
 */
class Calculator {
    Double x;

    /*
    * Chops up input on ' ' then decides whether to add or multiply.
    * If the string does not contain a valid format returns null.
    */
    Double x(String x){
        //Set the instance variable x to the first number in the calculation
        this.x = Double.parseDouble(x.split(" ")[0]);

        //Check if the operation is addition or multiplication
        if (x.split(" ")[1].equals("+")) {
            //Use casting to call the addition method by passing the second number as type Double
            return x((Double) Double.parseDouble(x.split(" ")[2]));

        } else if (x.split(" ")[1].equals("x")) {
            //Use casting to call the multiplication method by passing the second number as type double
            return x((double) Double.valueOf(x.split(" ")[2]));

        } else {
            //If the operator isn't + or x then return null
            return null;
        }
    }

    /*
    * Adds the parameter x to the instance variable x and returns the answer as a Double.
    */
    Double x(Double x){
            System.out.println("== Adding ==");
            return this.x + x;
    }

    /*
    * Multiplies the parameter x by instance variable x and return the value as a Double.
    */
    Double x(double x){
            System.out.println("== Multiplying ==");
            return this.x * x;
        }

}

