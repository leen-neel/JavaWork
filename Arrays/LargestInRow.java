import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LargestInRow {

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] rowLargest(int[][] arr, int numberOfRows) {

        int max = 0;
        int[] results = new int[numberOfRows];

        for (int i = 0; i < numberOfRows; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }

            results[i] = max;
            max = 0;

        }

        return results;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows");
        int numberOfRows = Integer.parseInt(in.readLine());

        System.out.print("Enter the number of columns : ");
        int numberOfColumns = Integer.parseInt(in.readLine());

    }

}
