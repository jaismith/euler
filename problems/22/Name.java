//euler 22 name class

public class Name implements Comparable<Name> {
     //instantiate variables
     String name;

     //constructor
     public Name(String name) {
          this.name = name.toUpperCase();
     }

     public int getScore() {
          //initialize score variable
          int score = 0;

          //add up score of each letter
          for(char c : name.toCharArray()) {
               //int = char returns ascii value of char. uppercase letters in ascii start with a at 97, so by subtracting 64, we aare left with the characters place in the alphabet
               score += c - 64;
          }

          //return score
          return score;
     }

     @Override
     public String toString() {
          return name;
     }

     @Override
     public int compareTo(Name n) {
          return(name.compareTo(n.toString()));
     }
}
