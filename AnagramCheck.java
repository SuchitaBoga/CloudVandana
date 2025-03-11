package CloudVandana;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "world";
        String str2 = "hello";

        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If the strings have different lengths, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
