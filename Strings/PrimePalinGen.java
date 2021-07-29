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

}
