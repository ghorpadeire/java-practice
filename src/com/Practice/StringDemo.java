import java.util.logging.Logger;

public class StringDemo {

    // Reverse a string manually.
    // Count vowels in a sentence.

    private static final Logger logger = Logger.getLogger(StringDemo.class.getName());

    public static void main(String[] args) {
        String input = "Heloo World";
        String reversed = reverseString(input);
        int vowelCount = countVowels(input);
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Reversed String: %s", reversed));
            logger.info(String.format("Vowel Count: %s", vowelCount));
        }
           
    }
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
}
