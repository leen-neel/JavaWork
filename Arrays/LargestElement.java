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

}
