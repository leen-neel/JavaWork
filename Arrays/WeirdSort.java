package Arrays;

public class WeirdSort {

    public static void main(String[] args) {

        int[] arr = { 5, 1, -5, 6, -7, 44, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

}
