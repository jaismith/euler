//euler 17

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
     public static void main(String[] args) {
          ArrayList<String> ones = new ArrayList<String>(Arrays.asList("", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"));
          ArrayList<String> teens = new ArrayList<String>(Arrays.asList(" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"));
          ArrayList<String> tens = new ArrayList<String>(Arrays.asList("", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"));
          ArrayList<String> hundreds = new ArrayList<String>(Arrays.asList("", " one hundred", " two hundred", " three hundred", " four hundred", " five hundred", " six hundred", " seven hundred", " eight hundred", " nine hundred"));
          ArrayList<String> thousands = new ArrayList<String>(Arrays.asList("", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"));

          //instantiate result StringBuilder
          StringBuilder result = new StringBuilder();

          int upperBound = 0;

          try {
               upperBound = Integer.parseInt(args[0]);
               if(!(upperBound < 10000)) {
                    System.out.println("Number exceeds maximum input: 9999");
                    System.exit(0);
               }
          } catch(Exception e) {
               System.out.println("Program must be run with integer command-line argument between 0 and 9999.");
               System.out.println("Error: " + e);
               System.exit(0);
          }

          for(int i = 0; i <= upperBound; i++) {
               //set variables for each digit
               int one = (int) Math.floor(i % 10);
               int ten = (int) Math.floor(i / 10 % 10);
               int hun = (int) Math.floor(i / 100 % 10);
               int tho = (int) Math.floor(i / 1000 % 10);

               //instantiate StringBuilder
               StringBuilder  output = new StringBuilder();

               //System.out.printf("one = %d, ten = %d, hun = %d, tho = %d", one, ten, hun, tho);

               if(ten == 1) {
                    output.insert(0, teens.get(one));
                    if(hun > 0 && (ten > 0 || one > 0)) {
                         output.insert(0, " and");
                    }
                    output.insert(0, hundreds.get(hun));
                    output.insert(0, thousands.get(tho));
               } else {
                    output.insert(0, ones.get(one));
                    output.insert(0, tens.get(ten));
                    if(hun > 0 && (ten > 0 || one > 0)) {
                         output.insert(0, " and");
                    }
                    output.insert(0, hundreds.get(hun));
                    output.insert(0, thousands.get(tho));
               }

               result.append(output);

               output.insert(0, (String) (i + ": "));

               System.out.println(output.toString());
          }

          String buffer = result.toString();
          buffer = buffer.replace(" ", "");
          System.out.println("Number of characters: " + buffer.length());
     }
}
