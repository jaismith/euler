//euler 19



class Main {
     public static void main(String[] args) {
          int daysElapsed = 0;
          int sundaysElapsed = 0;

          //iterate through all 36525 days in 20th century
          //iterate years
          for(int year = 1901; year <= 2000; year++) {

               /*debugging step
               System.out.print("1 Jan " + year + " is");
               if((daysElapsed + 2) % 7 != 0) {
                    System.out.print(" not");
               }
               System.out.println(" a Sunday.");
               */

               //iterate months
               for(int month = 1; month <= 12; month++) {

                    //leap year
                    if(month == 2 && year % 4 == 0) {
                         //check for sunday on 1st
                         if((daysElapsed + 2) % 7 == 0) {
                              sundaysElapsed++;
                         }
                         daysElapsed += 29;

                    //normal february
                    } else if (month == 2) {
                         //check for sunday on 1st
                         if((daysElapsed + 2) % 7 == 0) {
                              sundaysElapsed++;
                         }
                         daysElapsed += 28;

                    //30-day months
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                         //check for sunday on 1st
                         if((daysElapsed + 2) % 7 == 0) {
                              sundaysElapsed++;
                         }
                         daysElapsed += 30;

                    //31-day months
                    } else {
                         //check for sunday on 1st
                         if((daysElapsed + 2) % 7 == 0) {
                              sundaysElapsed++;
                         }
                         daysElapsed += 31;
                    }
               }
          }

          System.out.println("There were " + sundaysElapsed + " sundays on the first of the month and " + daysElapsed + " total days in the 20th century.");
     }
}
