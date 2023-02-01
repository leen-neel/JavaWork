import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimePalinGen {

    int start;
    int end;

    PrimePalinGen(int a, int b) {
        this.start = a;
        this.end = b;
    }

    public static int isPrime(int i) {

        int f = 0;

        for (int j = 1; j <= i; j++) {

            if (i % j == 0) {
                f++;
            }

        }

        return f == 2 ? 1 : 0;

    }

    public static int isPalin(int i) {

        String number = Integer.toString(i);
        String reveNumber = "";

        for (int j = number.length() - 1; j >= 0; j--) {
            reveNumber += number.charAt(j);
        }

        return number.equals(reveNumber) ? 1 : 0;

    }

    public void generate() {

        for (int i = start; i <= end; i++) {

            if (isPrime(i) == 1 && isPalin(i) == 1) {
                System.out.print(i + " ");
            }

        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit : ");
        int a = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int b = Integer.parseInt(in.readLine());

        System.out.println();
        PrimePalinGen obj = new PrimePalinGen(a, b);

        obj.generate();

    }

}
