import java.util.Scanner;

// Java program to take an index and whole array from user
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();

        if (index >= 0 && index < size) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Index out of bounds.");
        }

        sc.close();
    }
}
