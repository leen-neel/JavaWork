import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomorphicNumber {

    public static boolean isAutomorphic(int n) {
        String number = Integer.toString(n);
        String squared = Integer.toString(n * n);

        return squared.endsWith(number);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(Syste, in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

    }

}
