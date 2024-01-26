// String to Integers

// by Alexandra Lanorias
// January 26, 2024

// Implement the sumIntegersAsString() method that takes in vararg String, and converts each parameter into an int, and them sums all 
// the ints together. Use the right class for the job.

// this method:

/*
    static int sumIntegersAsString(String...stringIntegers) {
        // add your code here
    }
*/

// Must work with this main method:

public class string_to_integers {
    public static void main(String[] args) {
        System.out.println(sumIntegersAsString("10", "20")); // 30
        System.out.println(sumIntegersAsString("10", "20", "30")); // 60
        System.out.println(sumIntegersAsString("10", "20", "30", "40")); // 100
    }

    static int sumIntegersAsString(String... stringIntegers) {
        int sum = 0;

        for (String str : stringIntegers) {
            sum += Integer.parseInt(str);
        }

        return sum;
    }
}
