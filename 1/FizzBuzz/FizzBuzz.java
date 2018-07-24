public class FizzBuzz {

  public static void main(String[] args) {
    //Loops from 0 to 60
    for(Integer i = new Integer(1); i < 61; i++){
      //Uses modulus to check if dividing by 5 or 3 gives a remainder
      if(i % 3 != 0 && i % 5 != 0){ //If both dividing by 5 and 3 give remainders (NOT 0) we just output the value
        System.out.print(i);
      }
      //If the value of i divided by 3 has a remainder of 0 output Fizz
      if(i % 3 == 0){
        System.out.print("Fizz");
      }
      //If the value of i divided by 5 has a remainder of 0 output Buzz
      if(i % 5 == 0){
        System.out.print("Buzz");
      }
      //Moves the console down to the next line
      System.out.println();
    }
  }
}
