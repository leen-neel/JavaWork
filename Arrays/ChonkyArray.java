package Arrays;

import java.io.*;

public class ChonkyArray {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[2][2];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
                sum += arr[i][j];

            }

        }

        System.out.println("\nSum is " + sum);

    }

}
