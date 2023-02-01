import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class SumOfDiagonals {
    
    public static int[] sumOfDiagonals(int[][] arr) {

        int secondaryDiagonal = 0;
        int primaryDiagonal = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            
            primaryDiagonal += arr[i][i];
            secondaryDiagonal += arr[i][length - (i + 1)];

        }        
        
        int[] results = {primaryDiagonal, secondaryDiagonal};

        return results;
        
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

        int[] results = sumOfDiagonals(arr);

        System.out.println("Sum of primary diagonal : " + results[0]);
        System.out.println("Sum of secondary diagonal : " + results[1]);
    }

}
