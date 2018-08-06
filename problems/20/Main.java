//euler 20

import java.math.BigInteger;

class Main {
     public static void main(String[] args) {
          //find factorial of 100
          //initialize initial output variable
          BigInteger initOutput = BigInteger.valueOf(1);

          //multiply factorial
          for(int i = 100; i > 0; i--) {
               initOutput = initOutput.multiply(BigInteger.valueOf(i));
          }

          //add digits
          //initialize final output variable
          int finalOutput = 0;

          //add each digit
          while(initOutput.compareTo(BigInteger.valueOf(0)) > 0) {

               /*debugging step
               System.out.println(initOutput + " subtracting " + initOutput.mod(BigInteger.valueOf(10)) + " and dividing by ten.");
               */

               finalOutput += initOutput.mod(BigInteger.valueOf(10)).intValue();
               initOutput = initOutput.subtract(initOutput.mod(BigInteger.valueOf(10)));
               initOutput = initOutput.divide(BigInteger.valueOf(10));
          }

          //print output
          System.out.println("finalOutput: " + finalOutput);
     }
}

//note to self, using biginteger sucks. next time, find more efficient way
