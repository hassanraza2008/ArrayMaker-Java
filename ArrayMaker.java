import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayMaker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to array maker for Java!");

            // Take the file name as input
            System.out.print("Enter the name of the file (with .txt extension): ");
            String fileName = sc.nextLine();

            System.out.print("Enter how many numbers you want to write in the file: ");
            int n = sc.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i + 1; // Populate with sequential numbers
            }

            // Print the array to verify
            System.out.print("Array: [");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            // Write the array to a file, each number on a new line
            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
                for (int i = 0; i < n; i++) {
                    writer.println(array[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
