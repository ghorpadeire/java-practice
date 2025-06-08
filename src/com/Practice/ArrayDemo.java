import java.util.logging.Logger;

public class ArrayDemo {

    // Goal: Practice arrays (1D/2D), string methods, loops with arrays.
    // Find max/min in an array.
    // Reverse a string manually.
    // Count vowels in a sentence.

    private static final Logger logger = Logger.getLogger(ArrayDemo.class.getName());

    public static void main(String[] args) {
        // 1D Array Example 
        int[] numbers = {5, 3, 8, 1, 4};
        
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Max: %d", max));
            logger.info(String.format("Min: %d", min));
        }
    

    // 2D Array Example
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        logger.info("2D Array:");
        // Print the 2D array
        
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < matrix[i].length; j++) {
                row.append(matrix[i][j]).append(" ");
            }
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(row.toString().trim());
            }
        }

        
    }

   
}
