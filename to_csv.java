// To CSV

// by Alexandra Lanorias
// January 26, 2024

// Implement a toCsv() method that takes vararg String, and returns a single String where the parameters get concatenated with commas in
// between. Be sure to use the right class for the job.

// this method:

/*
    static String toCsv(String...strings) {
        // add your code here
    }
*/

// Must work with this main method:

import java.util.StringJoiner;

public class to_csv {
    public static void main(String[] args) {
        System.out.println(toCsv("Row", "row", "row", "your boat"));
        // Row,row,row,your boat,
    }

    static String toCsv(String... strings) {
        StringJoiner sj = new StringJoiner(",");
        
        for (String str : strings) {
            sj.add(str);
        }

        return sj.toString() + ",";
    }
}
