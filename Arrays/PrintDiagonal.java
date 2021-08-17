import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintDiagonal {

    public static void printDiagonal(int[][] arr, int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == (n - 1)) {
                    System.out.print(arr[i][j] + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        printDiagonal(arr, n);

    }

}

/** 
 * Step 1: Start
 * Step 2: Ask users's input for the length of the array
 * Step 3: Initialize a two-dimensional array
 * Step 4: Take the user's input of the array's contained data
 * Step 5: Start a for loop to go through the two-dimensional array
 * Step 6: If (i == j) or ((i + j) == (n - 1)) print the element with a tab
 * Step 7: Else print a whitespace with a tab 
*/
