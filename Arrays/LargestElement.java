import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestElement {

    public static int largestNumber(int[] arr) {

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        return largest;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        System.out.println();

        System.out.println("The largest element of the array is : " + largestNumber(arr));

    }

}
