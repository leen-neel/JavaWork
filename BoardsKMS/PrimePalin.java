public class PrimePalin {

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1 || n == 2) {
            return false;
        }

        int flags = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                flags++;
            }

        }

        return flags == 2;

    }

    public static boolean isPalin(int n) {

        StringBuffer num = new StringBuffer(Integer.toString(n));

        int revNum = Integer.parseInt(num.reverse().toString());

        return revNum == n;

    }

    public static void main(String[] args) {

        System.out.println(isPalin(49));

    }

}
