//main class for problem 12

class Main {
     public static void main(String[] args) {
          int current = 28;
          int add = 8;
          int max = 0;

          while(true) {
               //create Candidate object
               Candidate test = new Candidate(current);

               //check if found, if so break while loop.
               if(test.divisorCount() > 500) {
                    break;
               }

               //keep track of highest found
               if(test.divisorCount() > max) {
                    max = test.divisorCount();

                    System.out.printf("\r%d has %d factors, this is the highest known candidate.", current, max);
               }

               //calculate next triangular number
               current += add;
               add++;
          }

          System.out.printf("\n%d is the first triangular number to have over 500 divisors.\n", current);
     }
}
