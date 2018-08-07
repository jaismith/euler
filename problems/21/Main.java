//euler 21

//imports
import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
          //initialize output arraylist
          ArrayList<Integer> output = new ArrayList<Integer>();

          for(int i = 1; i < 10000; i++) {
               if(!output.contains(i)) {
                    //create object of Candidate to test number
                    Candidate test1 = new Candidate(i);
                    Candidate test2 = new Candidate(test1.divisorSum());

                    //check amicability
                    if(test1.divisorSum() == test2.toInteger() && test2.divisorSum() == test1.toInteger() && test1.divisorSum() != test2.divisorSum()) {
                         //add to output list
                         output.add(i);
                    }
               }
          }

          //initialize output sum
          int sum = 0;

          //add all amicable numbers
          for(int i : output) {
               sum += i;
          }

          //print outputs
          System.out.println(output);
          System.out.println(sum);
     }
}
