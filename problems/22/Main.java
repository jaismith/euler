//euler 22

//imports
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Main {
     public static void main(String[] args) throws FileNotFoundException {
          //initialize dictionary ArrayList
          ArrayList<Name> dictionary = new ArrayList<Name>();

          //load names.txt
          File names = new File(args[0]);

          //initialize Scanner
          Scanner in = new Scanner(names).useDelimiter(",");

          //transfer names into dictionary
          while(in.hasNext()) {
               //instantiate temp variable
               String temp;

               //assign Scanner's next String to temp
               temp = in.next();

               //add to dictionary, without quotation marks
               dictionary.add(new Name(temp.substring(1, temp.length()-1)));
          }

          //sort alphabetically
          for(int i = 1; i < dictionary.size(); i++) {
               //save target name
               Name target = dictionary.get(i);

               //probe index
               int index = i - 1;

               //find place
               while(index > 0 && target.compareTo(dictionary.get(index)) <= 0) {
                    index--;
               }

               //System.out.println("Placing " + target + " before );

               dictionary.remove(i);
               dictionary.add(index + 1, target);
          }


          System.out.println(dictionary);
     }
}
