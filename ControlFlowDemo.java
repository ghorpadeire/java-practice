import java.util.Scanner;

public class ControlFlowDemo {
    
    // Write a program to check if a number is prime.

    // Make a calculator using switch.


    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // If-else statement 
        if  (number > 2) {

            boolean isPrime = true;
            for (int i=2 ; i <= number / 2; i++) {

                // Uncomment the line below to see the checks being made
                // System.out.print(number / 2 + " % "+ i + " ->"+ number % i + " \n");

                // Check if the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }   
            if (isPrime) {
                System.out.println("Number is prime.");
            } else {
                System.out.println("Number is not prime.");
            }
            
        } else if (number == 2) {
            System.out.println("Number is prime.");
            boolean isPrime = true;
        } else {
            System.out.println("Number is not prime.");
            boolean isPrime = false;


        }


        // Switch statement       
        System.out.println("""
            

            Calculator Menu:
            """); 
        System.out.print("Enter a number for calculator (1-4): \n");
        System.out.println("Choose an operation:"); 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");

        // Assuming the user enters a valid choice (1-4)
        // In a real application, you should validate the input.
        // For simplicity, we will not handle invalid inputs here.

        int choice = sc.nextInt();      

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation (1-4).");
                break;
            



        }


        sc.close();
    }
}
