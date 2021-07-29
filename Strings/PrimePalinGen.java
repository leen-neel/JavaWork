import jdk.internal.jshell.tool.resources.l10n;

public class PrimePalinGen {

    int start;
    int end;

    PrimePalinGen(int a, int b) {
        this.start = a;
        this.end = b;
    }

    public static int isPrime(int i) {

        int f = 0;

        for (int j = 0; j <= i; j++) {

            if (i % j == 0) {
                f++;
            }

        }

        return f == 2 ? 1 : 0;

    }

    public static int isPalin(int i) {

        StringBuffer number = new StringBuffer(Integer.parseInt(i));
        StringBuffer reveNumber = number.reverse();

        return number.equals(reveNumber) ? 1 : 0;

    }

    public void generate() {

        for (int i = start; i <= end; i++) {

            if (isPrime(i) == 1 && isPalin(i) == 1) {
                System.out.print(i + " ");
            }

        }

    }

}
