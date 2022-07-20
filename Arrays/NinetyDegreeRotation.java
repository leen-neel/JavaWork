import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NinetyDegreeRotation {
   
    public static int[][] rotateArray(int[][] arr) {

        int[][] newArr = new int[arr.length][arr.length];

        for (int i = 0; i < newArr.length; i++) {
           for (int j = 0; j < newArr.length; j++) {
                newArr[j][arr.length - 1 - i] = arr[i][j];
           } 
        }

        return newArr;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the order of the matrix : ");
        int order = Integer.parseInt(in.readLine());

        System.out.println();
        int[][] arr = new int[order][order];

        for (int i = 0; i < order; i++) {
           for (int j = 0; j < order; j++) {
                System.out.print("Enter the data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
           } 
        }

        System.out.println();

        int[][] newArr = rotateArray(arr);


        
    }

}
