//euler 23
//abundant number candidates

//imports
import java.util.ArrayList;

public class Candidate {
     //variables
     int number;
     ArrayList<Integer> divisorList = new ArrayList<Integer>();
     int sum = 0;

     //construct
     public Candidate(int number) {
          this.number = number;

          //find divisors
          for(int i = 1; i < number / 2 + 1; i++) {
               if(!divisorList.contains(i)) {
                    if(number % i == 0) {
                         divisorList.add(i);
                    }
               }
          }

          //add each divisor to sum
          for(int i : divisors()) {
               sum += i;
          }
     }

     public ArrayList<Integer> divisors() {
          //return output
          return divisorList;
     }

     public int divisorSum() {
          //return output
          return sum;
     }

     //provide integer equivalent of candidate
     public int toInteger() {
          return number;
     }

     //make candidates comparable
     public int compareTo(Candidate n) {
          if(number < n.toInteger()) {
               return -1;
          } else if (number == n.toInteger()) {
               return 0;
          } else {
               return 1;
          }
     }

     public String isType() {
          if(number < sum) {
               return "abundant";
          } else if (number == sum) {
               return "perfect";
          } else {
               return "deficient";
          }
     }
}
