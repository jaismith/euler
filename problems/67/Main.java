//euler 18

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

class Main {
     public static void main(String[] args) {
          int[][] array = new int[100][100];
          int x;
          int y;

          File triangle = new File(args[0]);

          try {
               Scanner in = new Scanner(triangle);

               y = 0;

               while(y <= 99 && in.hasNext()) {
                    for(x = 0; x <= y; x++) {
                         array[y][x] = Integer.parseInt(in.next());
                    }

                    y++;
               }

               in.close();
          } catch(Exception e) {
               System.out.println("Properly formatted input file must be provided in command line argument. Delimiter: ' ', Line Break: '\\r\\n'\n\nExample:\n3\n7 4\n2 4 6\n8 5 9 3\n");
               System.out.println("Error: " + e);
               System.exit(0);
          }

          //add up routes
          y = 98;

          while(y >= 0) {
               for(x = 0; x <= y; x++) {
                    int neighborL = array[y + 1][x];
                    int neighborR = array[y + 1][x + 1];

                    if (neighborL > neighborR) {
                         array[y][x] += neighborL;
                    } else {
                         array[y][x] += neighborR;
                    }
               }

               y--;
          }

          /*print array
          for(int i = 0; i < 15; i++) {
               System.out.println(Arrays.toString(array[i]));
          }*/

          System.out.println(array[0][0]);
     }
}
