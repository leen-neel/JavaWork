import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqMat {

    public static void printArray(int[][] arr, int size) {
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static boolean isEqual(int[][] arr1, int[][] arr2, int size) {
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the arrays : ");
        int arraySize = Integer.parseInt(in.readLine());

        System.out.println();

        int[][] arr1 = new int[arraySize][arraySize];
        int[][] arr2 = new int[arraySize][arraySize];

        // Taking values of the first array
        System.out.println("Enter the values for the first array : ");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print("Enter the value for position ("+ i + ", "+ j + ") : ");
                arr1[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();
        
        // Taking the values of the second array
        System.out.println("Enter the values for the second array : ");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print("Enter the value for position ("+ i + ", "+ j + ") : ");
                arr2[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();

        System.out.println(isEqual(arr1, arr2, arraySize) ? "The arrays are equal" : "The arrays are not equal");

    }

}
