//main class for question 23

//imports
import java.util.ArrayList;

class Main {
     public static void main(String[] args) {
          /*//testing Candidate class

          int abundantSum = 0;

          for(int i = 1; i <= 500; i++) {
               Candidate test = new Candidate(i);

               if(test.isType().equals("abundant")) {
                    abundantSum++;
               }
               //System.out.println(i + ": " + test.isType());
          }

          System.out.println("Output was " + (abundantSum / 5) + "% abundant");

          System.out.println("done");*/

          ArrayList<Integer> eliminated = new ArrayList<Integer>();

          ArrayList<Integer> abundantList = new ArrayList<Integer>();

          System.out.println("Generating list of abundant numbers...");

          for(int i = 0; i < 28123; i++) {
               Candidate candidate = new Candidate(i);

               if(candidate.isType().equals("abundant")) {
                    abundantList.add(i);
               }
          }

          System.out.println(abundantList.subList(abundantList.size() - 6, abundantList.size() - 1));

          System.out.println("Calculating sums...");

          for(int i = 0; i < abundantList.size(); i++) {
               for(int j = i; j < abundantList.size() - i; j++) {
                    int sum = i + j;

                    if(!eliminated.contains(sum)) {
                         eliminated.add(sum);
                    }
               }

               System.out.print("\r" + (((double)i/abundantList.size()) * 100) + "%  complete...");
          }

          System.out.println(eliminated.subList(eliminated.size() - 6, eliminated.size() - 1));

          System.out.println("\nFinding un-eliminated terms...");

          ArrayList<Integer> output = new ArrayList<Integer>();

          for(int i = 0; i < 28123; i++) {
               if(!eliminated.contains(i)) {
                    output.add(i);
               }
          }

          System.out.println(output.subList(output.size() - 6, output.size() - 1));

          System.out.println("Calculating total sum...");

          int sum = 0;

          for(int i = 0; i < output.size(); i++) {
               sum += i;
          }

          System.out.println("\nOutput: " + sum);
     }
}
