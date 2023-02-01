package Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 7, 5, 4, 2, 0 };

        for (int i = 0; i < arr.length - 1; i++) {

            boolean sorted = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    sorted = false;
                }

            }

            if (sorted) {
                break;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
