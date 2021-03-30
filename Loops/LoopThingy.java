package Loops;

public class LoopThingy {

    public static void main(String[] args) {

        int sum = 0;
        int n = 5;

        for (int i = 0; i <= n; i++) {
            sum += (i * (i + 1));
        }

        System.out.println(sum);

    }

}
