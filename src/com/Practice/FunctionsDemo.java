import java.util.logging.Logger;

public class FunctionsDemo {

    private static final Logger logger = Logger.getLogger(FunctionsDemo.class.getName());

    // Method without parameters and return type
    public static void greet() {
     if (logger.isLoggable(java.util.logging.Level.INFO)) {   
        logger.info("Hello, welcome to Java!");
    }
    }

    // Method with parameters
    public static void greetUser(String name) {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
        logger.info("Hello " + name + ", welcome!");
        }
    }

    // Method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method Overloading
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        greetUser("Pranav");

        int sum = add(10, 20);
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Sum (int): %d", sum));
        }

        double sumDouble = add(10.5, 5.5);
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Sum (double): %.2f", sumDouble));
        }
    }
}
