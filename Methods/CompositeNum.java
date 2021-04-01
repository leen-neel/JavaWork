package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompositeNum {

    public static boolean isComposite(int n) {

        int flag = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                flag++;
            }

        }

        return flag > 2;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        System.out
                .println(isComposite(n) ? "The number is a composite number" : "The number is not a composite number.");

    }

}
