import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdNumberThingy {

    private static int numberIncrement(int n, int amount) {

        String number = "";

        for (int i = 1; i <= amount; i++) {

            number += Integer.toString(n);

        }

        return Integer.parseInt(number);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n1 = Integer.parseInt(in.readLine());

        int n2 = numberIncrement(n1, 2);
        int n3 = numberIncrement(n1, 3);
        int n4 = numberIncrement(n1, 4);
        int sum = n2 + n3 + n4;

        System.out.println();

        System.out.println(n2 + ", " + n3 + ", " + n4);
        System.out.println("Sum : " + sum);

    }

}
