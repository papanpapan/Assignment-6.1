import java.util.Calendar;
import java.util.GregorianCalendar;
public class Months {

	
	public static void main(String[] args) {
	      // Declare variables
	      int Year, Month;
	      // Assign starting values
	      Year = 2020;
          Month = 1;
	      // Call method to print the month for the values
	      printCalendar(Year, Month);
	      }
       
	public static void printCalendar(int year, int month) {

	      // Declare variables

	      int leap_year;

	      int dayOfWeek=1;

	      String space = "   ";

	      // build array with number of days per month
	      String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	      int[] calDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	 

	      //object to get month

	      Calendar cal = new GregorianCalendar(year, month, 1);

	 

	      // Following calculates if the current year is leapyear

	      if (year % 100 == 0) {

	         if (year % 400 == 0) {

	            calDays[1] = 29;

	         }

	      } else if (year % 4 == 0) {

	         calDays[1] = 29;

	      }

	      // Print out top of calendar
	      System.out.println("Year: " + year + space + "Month: " + monthName[month] + "\n");

	      System.out.println("S   M   T   W   T   F   S\n");

	      // Following loop will find out where to print the first day of the month

	      // dayCounter represents current day of the month and dayOfWeek represents the day of the

	      // week where 1 is Sunday

	      for (int dayCounter=1; dayCounter <= calDays[month]; dayCounter++) {

	         if (dayCounter > 9) {

	            // This controls the printing of the spaces between the days so it's pretty

	            space = "  ";

	         }

	         // This if will find out print out spaces until the day the first of the

	         // month falls on

	         if (dayCounter == 1) {

	            while (dayOfWeek != cal.get(Calendar.DAY_OF_WEEK)) {

	               System.out.print(space + " ");

	               dayOfWeek++;

	            }

	            // Now we have found the right place to print the first day of the month

	            System.out.print(dayCounter + space);

	            dayOfWeek++;

	         } else {

	            // This checks to see if we are at the end of the row.

	          if (dayOfWeek == 8) {

	               // Print a newline and start on the next row and set the day to 2

	               // since we just printed the first position

	               System.out.print("\n" + dayCounter + space);

	               dayOfWeek=2;

	            } else {

	               // this prints out the current day number and increments j

	               System.out.print(dayCounter + space);

	               dayOfWeek++;

	            }

	         }

	      }

	      // This puts some space after the calendar is printed.

	      System.out.println("\n");

	   }

}

		
	
	



