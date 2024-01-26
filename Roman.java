import java.util.*;

class Roman {

    public static void main(String args[]) {
        // Convert Roman numeral to integer
        romanToInteger("MMMCCXXVII");

        // Convert integer to Roman numeral
        integerToRoman(5673);
    }

    public static void romanToInteger(String s) {

        // Print the original Roman numeral
        System.out.print("Roman = " + s + " ");

        // Create a map to store the values of Roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('L', 50);
        map.put('V', 5);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('C', 100);
        map.put('X', 10);

        // Convert the Roman numeral string into an array of characters
        char[] sa = s.toCharArray();
        int prev = 0;
        int ans = 0;

        // Iterate through each character in the Roman numeral
        for (char c : sa) {
            int v = map.get(c);
            if (prev < v) {
                // If the current value is greater than the previous, subtract twice the previous value and current value
                ans += v - 2 * prev;
            } else {
                // Otherwise, simply add the current value
                ans += v;
            }
            prev = v; // Update the previous value
        }
        // Print the converted integer value
        System.out.println("Integer = " + ans);
    }

    public static void integerToRoman(int num) {

        // Print the original integer
        System.out.print("Integer = " + num + " ");

        // Arrays to store the values and symbols of Roman numerals
        int[] v = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] r = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        // StringBuilder to build the Roman numeral string
        StringBuilder sb = new StringBuilder();

        // Iterate through the values and symbols
        for (int i = 0; i < v.length; i++) {
            // While the number is greater than or equal to the current value
            while (num >= v[i]) {
                // Append the corresponding symbol to the StringBuilder
                sb.append(r[i]);
                // Subtract the current value from the number
                num -= v[i];
            }
        }
        // Print the converted Roman numeral
        System.out.println("Roman = " + sb.toString());
    }
}
