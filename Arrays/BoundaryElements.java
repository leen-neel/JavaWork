import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundaryElements {

    public static void printBoundary(int[][] arr, int length) {
        
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                if (i == 0 || i == length - 1 || j == 0 || j == length - 1) {

                    System.out.print(arr[i][j] + "\t");

                } else {

                    System.out.print(" \t");

                }

            }

            System.out.println();
            
        }

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the matrix : ");
        int length = Integer.parseInt(in.readLine());

        int[][] arr = new int[length][length];

        System.out.println();

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());

            }

        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            
            for (int j = 0; j < length; j++) {
                
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();
            
        }

        System.out.println();

        printBoundary(arr, length);

    }

}

/**
 * Step 1 - Start
 * Step 2 - Take the array's length as input
 * Step 3 - Initialize a two-dimensional array 
 * Step 4 - Take the array's content from the user as input
 * Step 5 - Print the array
 * Step 6 - Print the element if (i == 0 || i == length - 1 || j == 0 || j == length - 1)
 * Step 7 - Stop
 */
