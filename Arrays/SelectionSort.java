package Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 3, 1, -2, 7, 4, 0 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minInd = i;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
