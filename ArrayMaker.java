import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayMaker {
    public static void main(String[] args) {
        // Try-with-resources to ensure Scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to array maker for Java!");

            // Prompt the user to enter the file name
            System.out.print("Enter the name of the file (with .txt extension): ");
            String fileName = sc.nextLine();

            // Prompt the user to enter the number of elements in the array
            System.out.print("Enter how many numbers you want to write in the file: ");
            int n = sc.nextInt();

            // Initialize the array with the specified number of elements
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i + 1; // Populate the array with sequential numbers
            }

            // Print the array to the console for verification
            System.out.print("Array: [");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            // Write the array to the specified file, each number on a new line
            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
                for (int i = 0; i < n; i++) {
                    writer.println(array[i]);
                }
            } catch (IOException e) {
                // Handle any IO exceptions that occur
                e.printStackTrace();
            }
        }
    }
}
