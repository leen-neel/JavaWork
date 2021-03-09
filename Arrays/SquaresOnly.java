package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquaresOnly {

    public static boolean isPerfectSquare(int num) {

        double squareRoot = Math.sqrt(num);
        return (squareRoot - Math.floor(squareRoot) == 0);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int lengthOfArray = Integer.parseInt(in.readLine());

        System.out.println();
        int[] numberArray = new int[lengthOfArray];

        for (int i = 0; i < numberArray.length; i++) {

            System.out.print("Enter number for position " + i + " : ");
            numberArray[i] = Integer.parseInt(in.readLine());

        }

        System.out.println();

        for (int i = 0; i < numberArray.length; i++) {

            if (isPerfectSquare(numberArray[i])) {
                System.out.print(numberArray[i] + " ");
            }

        }

    }

}
