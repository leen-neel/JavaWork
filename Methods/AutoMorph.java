import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoMorph {

    public static boolean isAutomorphic(int n) {
        return Integer.toString(n * n).endsWith(Integer.toString(n));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println(isAutomorphic(n) ? "The number is automorphic" : "The number isn't automorphic");

    }

}
