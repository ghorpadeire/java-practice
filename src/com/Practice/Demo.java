package src.com.Practice;


import java.util.Scanner;

import java.util.logging.Logger;
import java.util.logging.Level;

// Java program to take an index and whole array from user
public class Demo {
    private static final Logger logger = Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Welcome to the Array Demo!");

        logger.info("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Enter %d elements:", size));
        }
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        logger.info("Enter the index to access: ");
        int index = sc.nextInt();

        if (index >= 0 && index < size) {
            if (logger.isLoggable(Level.INFO)) {
                logger.info(String.format("Element at index %d: %d", index, arr[index]));
            }
        } else {
            logger.warning("Index out of bounds.");
        }

        sc.close();
    }
}
