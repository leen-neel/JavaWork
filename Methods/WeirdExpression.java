import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdExpression {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter value of a : ");
        int a = Integer.parseInt(in.readLine());

        System.out.print("Enter value of b : ");
        int b = Integer.parseInt(in.readLine());

        System.out.print("Enter value of c : ");
        int c = Integer.parseInt(in.readLine());

        System.out.println();

        double res = (Math.pow(a, b) * Math.pow(b, c)) / (a * b * c);

        System.out.println("The result is : " + res);

    }

}
