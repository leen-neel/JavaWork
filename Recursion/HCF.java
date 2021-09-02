import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HCF {

    public static int hcf(int a, int b) {
        
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);

    }

    public static int lcm(int a, int b) {
        return ((a * b) / hcf(a, b));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int a = Integer.parseInt(in.readLine());

        System.out.print("Enter another number : ");
        int b = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println("The HCF of " + a + " and " + b + " is : " + hcf(a, b));
        System.out.println("The LCM of " + a + " and " + b + " is : " + lcm(a, b));
    }

}
