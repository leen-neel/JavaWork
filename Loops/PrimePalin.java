public class PrimePalin {

    public static boolean isPalin(int n) {

        String number = Integer.toString(n);
        String revNum = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            revNum += number.charAt(i);
        }

        return number.equals(revNum);

    }

    public static boolean isPrime(int n) {

        int facts = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                facts++;
            }
        }

        return facts == 2;

    }

    public static void main(String[] args) {

        for (int i = 10; i <= 1000; i++) {
            if (isPalin(i) && isPrime(i)) {
                System.out.println(i);
            }
        }

    }

}
