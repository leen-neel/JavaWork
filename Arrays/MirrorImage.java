import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorImage {

    public static int[][] mirrorImage(int[][] arr) {
        
        int[][] newArr = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][arr.length - 1 - j] = arr[i][j];
            }
        }

        return newArr;

    }

    public static void printArr(int[][] arr) {
       
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

        System.out.println();
        int[][] arr = new int[order][order];

        for (int i = 0; i < order; i++) {
           for (int j = 0; j < order; j++) {
                System.out.print("Enter the data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
           } 
        }

        System.out.println();

        int[][] newArr = mirrorImage(arr);

        printArr(arr);
        System.out.println();
        printArr(newArr);

    }

}
