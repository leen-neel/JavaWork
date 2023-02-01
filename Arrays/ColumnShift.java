import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColumnShift {

    public static int[][] shiftCol(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        int newArr[][] = new int[m][n];

        for (int j = 0; j < n; j++) {
            int col = j + 1; // First, we add 1 to the column number

            if (col == n) {
                col = 0; // If the new column number is equal to the acutal column number, we set it to
                         // 0. Making it the first column
            }

            for (int i = 0; i < m; i++) {
                newArr[i][col] = arr[i][j]; // Here, we get our row number from the loop then the col number from the
                                            // parent loop
            }
        }

        return newArr;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of array (m): ");
        int m = Integer.parseInt(in.readLine());

        System.out.println();
        int arr[][] = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter data for position : (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        int[][] newArr = shiftCol(arr);

        System.out.println("New Shifted Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * 
 * Algorithm:
 * Step 1: Start
 * Step 2: Start looping through the columns
 * Step 3: Add 1 to the index of the column, if it's equal to the left-most
 * column set it to 0
 * Step 4: Add the elements of the new row and column to a new array
 * Step 5: Print the array
 * Step 6: End
 * 
 * Variable list:
 * m - Integer - Stores the number of rows
 * n - Integer - Stores the number of columns
 * arr - int[][] - Stores the array
 * newArr - int[][] - Stores the new shifted array
 * 
 */
