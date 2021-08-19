import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDSorting {

    static void sortRowWise(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
 
            for (int j = 0; j < arr[i].length; j++) {
 
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {

                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int length = 3;
        int breadth = 3;

        int[][] arr = new int[length][breadth];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());

            }

        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.println();

        sortRowWise(arr);
    }

}

