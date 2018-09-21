//main class for question 23

//imports
import java.util.ArrayList;

class Main {
     public static void main(String[] args) {
          //declare arraylists
          ArrayList<Integer> eliminated = new ArrayList<Integer>(); //for eliminated numbers (not abundant)
          ArrayList<Integer> abundantList = new ArrayList<Integer>(); //abundant numbers

          System.out.println("Generating list of abundant numbers...");

          for(int i = 12; i <= 28123; i++) {
               Candidate candidate = new Candidate(i);

               if(candidate.isType().equals("abundant")) {
                    abundantList.add(i);
               }
          }

          System.out.println(abundantList.subList(abundantList.size() - 5, abundantList.size()));

          System.out.println("There are " + abundantList.size() + " abundant numbers.");

          System.out.println("Calculating sums...");

          for(int i = 0; i < abundantList.size(); i++) {
               for(int j = i; j < abundantList.size() - i; j++) {
                    int sum = i + j;

                    if(!eliminated.contains(sum)) {
                         eliminated.add(sum);
                    }
               }

               System.out.printf("\r%.5f%% complete...", (((double)i/abundantList.size()) * 100));
          }

          /*System.out.println("Checking sums...");

          for(int i = 28123; i > 0; i--) {
               for(int j = 0; j < abundantList.size() / 2; j++) {
                    if(abundantList.contains(abundantList.get(j) - i)) {
                         eliminated.add(i);
                         //System.out.println(i + " and " + j + " add to " + )
                         break;
                    }
               }

               System.out.printf("\r%.5f%% complete...", (((28123 - i) / 28123.0) * 100));
          }*/

          System.out.println(eliminated.subList(eliminated.size() - 6, eliminated.size() - 1));

          System.out.println("Finding un-eliminated terms...");

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
