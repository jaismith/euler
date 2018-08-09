//euler 22 name class

public class Name implements Comparable<Name> {
     //instantiate variables
     String name;

     //constructor
     public Name(String name) {
          this.name = name;
     }

     /*public int getScore() {
          return;
     }*/

     @Override
     public String toString() {
          return name;
     }

     @Override
     public int compareTo(Name n) {
          return(name.compareTo(n.toString()));
     }
}
