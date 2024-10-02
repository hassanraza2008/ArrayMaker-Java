import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ArrayMaker is a utility program that creates an array of sequential numbers
 * and writes them to a specified file.
 */
public class ArrayMaker {
    // Logger for logging messages and errors
    private static final Logger logger = Logger.getLogger(ArrayMaker.class.getName());

    public static void main(String[] args) {
        // Check if the correct number of command-line arguments are provided
        if (args.length < 2) {
            logger.severe("Usage: java ArrayMaker <file-name> <number-of-elements>");
            return;
        }

        // Get the file name and number of elements from the command-line arguments
        String outputFileName = args[0];
        int n;
        try {
            n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            logger.severe("The number of elements must be an integer.");
            return;
        }

        // Create an array of sequential numbers
        int[] arr = createArray(n);

        // Print the array to the console
        printArray(arr);

        // Write the array to the specified file
        writeArrayToFile(arr, outputFileName);
    }

    /**
     * Creates an array of sequential numbers from 1 to n.
     *
     * @param n the number of elements in the array
     * @return the created array
     */
    private static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * Prints the array to the console.
     *
     * @param arr the array to print
     */
    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("Array: [");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        logger.info(sb.toString());
    }

    /**
     * Writes the array to a specified file, each number on a new line.
     *
     * @param arr the array to write
     * @param outputFileName the name of the file to write to
     */
    private static void writeArrayToFile(int[] arr, String outputFileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFileName))) {
            for (int i : arr) {
                pw.println(i);
            }
            logger.info("Array written to file: " + outputFileName);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while writing to the file: " + e.getMessage(), e);
        }
    }
}
