import java.util.Arrays;

public class FascinatingNumber {

    static boolean arraySortedOrNot(int arr[]) {

        int n = arr.length;

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }

    public static int[] productsAsArray(int n) {

        String two = Integer.toString(n * 2);
        String three = Integer.toString(n * 3);

        String products = Integer.toString(n) + two + three;

        int[] digits = new int[products.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = products.charAt(i) - '0';
        }

        return digits;

    }

    public static boolean isMagic(int n) {

        int[] digits = productsAsArray(n);
        Arrays.sort(digits);
        return arraySortedOrNot(digits);

    }

    public static void main(String[] args) {

        System.out.println(isMagic(273));

    }

}
