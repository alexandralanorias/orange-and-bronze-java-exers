// Round-Off Doubles

// by Alexandra Lanorias
// January 26, 2024

// Implement the round() method below that takes in vararg double and returns a corresponding long[] of rounded-off numbers. 
// Look at the documentation of java.lang.Math (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) to find a method that 
// will make this task easy.

// this method:

/*
    static long[] round(double... doubles) {
        // add your code here
    }
*/

// Should work with this main method:

import java.util.Arrays;

public class round_off_doubles {
    static long[] round(double... doubles) {
        long[] result = new long[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            result[i] = Math.round(doubles[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        long[] rounded = round(4.7, 3.1, 2.8, 3.3, 5.6);
        System.out.println(Arrays.toString(rounded)); // [5, 3, 3, 3, 6]
    }
}
