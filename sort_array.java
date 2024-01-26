// Sort Array
// Add a line that would sort the char array in alphabetical order.

// by Alexandra Lanorias
// January 26, 2024

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        final char[] chars = {'E', 'B', 'C', 'A', 'D'};
        
        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));
    }
}