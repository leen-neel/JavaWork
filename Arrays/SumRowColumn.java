import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class SumRowColumn {

    public static void printArray(int[][] arr) {
       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
       } 
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the order of the matrix : ");
        int order = Integer.parseInt(in.readLine());

        int[][] arr = new int[order][order];
        System.err.println();

        for (int i = 0; i < order; i++) {
           for (int j = 0; j < order; j++) {
                System.out.print("Enter the value for (" + i + ", " + j + "): ");
                arr[i][j] = Integer.parseInt(in.readLine());
           } 
        }


    }

}
