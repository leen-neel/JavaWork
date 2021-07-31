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

}
