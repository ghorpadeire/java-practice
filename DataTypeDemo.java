public class DataTypeDemo {

    public static void main(String[] args) {

        int age = 25; // Integer data type
        double salary = 50000.50; // Double data type   
        boolean isStudent = false; // Boolean data type
        char grade = 'A'; // Character data type
        String name = "John Doe"; // String data type

        // Printing the values of the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  
        System.out.println("Salary: " + salary);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        
        // Demonstrating type conversion
        double convertedAge = age; // Implicit conversion from int to double
        System.out.println("Converted Age (to double): " + convertedAge);
        int roundedSalary = (int) salary; // Explicit conversion from double to int
        System.out.println("Rounded Salary (to int): " + roundedSalary);

        // Demonstrating arithmetic operations
        int a = 10;
        int b = 5;
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        double quotient = (double) a / b; // Division with explicit conversion to double
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        
    }
    
}
