//candidate class for problem 12 euler
//includes divisorCount() method which returns number of divisors of init value as integer

//imports
import java.util.ArrayList;

public class Candidate {
     //variables
     ArrayList<Integer> divisors = new ArrayList<Integer>();

     //constructor
     public Candidate(int init) {
          //find divisors and add to ArrayList
          for(int i = 1; i < Math.sqrt(init) + 1; i++) {
               if(!divisors.contains(i)) {
                    if(init % i == 0) {
                         divisors.add(i);
                         divisors.add(init / i);
                    }
               }
          }
     }

     //method to retrieve number of divisors of init
     int divisorCount() {
          return divisors.size();
     }
}
