// Two Months Later

// by Alexandra Lanorias
// February 16, 2024

// Implement the method below that takes in a date and returns the date two months later, using the legacy Date & Calendar classes.

/*
    static Date twoMonthsLater(Date date) {
        ...
    }
*/

// Must work with this main method:

/*
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2014, Calendar.DECEMBER, 31); // Wed Dec 31 XX:XX:XX PHT 2014
        System.out.println(twoMonthsLater(cal.getTime()));
        // Sat Feb 28 XX:XX:XX PHT 2015
    }
*/

import java.util.Calendar;
import java.util.Date;

public class two_months_later {
    static Date twoMonthsLater(Date date) {
        // Convert Date to Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Add two months
        calendar.add(Calendar.MONTH, 2);

        // Handle edge cases for months with fewer days
        int originalDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (originalDayOfMonth > maxDayOfMonth) {
            // Set to last day of the month
            calendar.set(Calendar.DAY_OF_MONTH, maxDayOfMonth);
        }

        // Convert Calendar back to Date
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2014, Calendar.DECEMBER, 31); // Wed Dec 31 XX:XX:XX PHT 2014
        System.out.println(twoMonthsLater(cal.getTime()));
        // Sat Feb 28 XX:XX:XX PHT 2015
    }
}
