import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompositeMagic {

    public static boolean isComposite(int n) {

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors > 2;

    }

    public static boolean isMagic(int n) {

        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }

        return sum == 1;

    }

    public static void printValues(int m, int n) {

        for (int i = m; i <= n; i++) {
            if (isComposite(i) && isMagic(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        if (m < 3000 || n < 3000) {
            System.out.println();
            printValues(m, n);
        } else {
            System.out.println("Out of range.");
        }

    }

}
